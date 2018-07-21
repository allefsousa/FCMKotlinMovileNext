package com.example.allef.next.pushnotificationmovilenext.fcm

import android.util.Log
import com.example.allef.next.pushnotificationmovilenext.notification.NotificationCreation
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {

    private val Tag = "FMService"

    override fun onNewToken(token: String?) {
        Log.i("New_Token",token)
        FirebaseMessaging.getInstance().subscribeToTopic("MAIN") // tipicos para as push


    }

    // metodo que recebe a mensagem
    override fun onMessageReceived(remoteMessage: RemoteMessage) {

        val notification = remoteMessage.notification
        Log.d(Tag,"FCM message ID : ${remoteMessage.messageId}")
        Log.d(Tag,"FCM Data Message : ${remoteMessage.data}")
        Log.d(Tag,"FCM Notification Message : $notification")

        notification?.let {
            val title = it.title ?:"Default Title"
            val body = it.body ?:"Default body"
            val data = remoteMessage.data
            Log.d(Tag,"title :$title " )
            Log.d(Tag,"Body  :$body " )
            Log.d(Tag,"Notification Data :$data " )


            NotificationCreation.create(this,title,body)

        }
    }
}

