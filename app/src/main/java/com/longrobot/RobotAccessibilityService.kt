package com.longrobot
import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent
import android.util.Log
class RobotAccessibilityService : AccessibilityService() {
    companion object {
        var lastMessage: String = ""
        var lastSender: String = ""
        var instance: RobotAccessibilityService? = null
    }
    override fun onServiceConnected() {
        super.onServiceConnected()
        instance = this
        Log.d("Longrobo", "Accessibility Connected")
    }
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}
    override fun onInterrupt() {}
}
