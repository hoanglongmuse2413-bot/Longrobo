package com.longrobot
import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log
class NotificationListener : NotificationListenerService() {
    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        if (sbn == null) return
        if (sbn.packageName.contains("zalo")) {
            val title = sbn.notification.extras.getString("android.title") ?: ""
            val text = sbn.notification.extras.getCharSequence("android.text")?.toString() ?: ""
            Log.d("Longrobo", "Zalo: $title - $text")
            RobotAccessibilityService.lastMessage = text
            RobotAccessibilityService.lastSender = title
        }
    }
}
