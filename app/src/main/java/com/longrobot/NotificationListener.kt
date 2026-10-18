package com.longrobot

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification

class NotificationListener : NotificationListenerService() {
    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        val packageName = sbn?.packageName
        val text = sbn?.notification?.extras?.getString("android.text")
        // Khi co tin nhan Zalo moi, neu dang BAT tu dong 100% thi goi Meta AI
    }
}
