package com.longrobot

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent
import android.os.Bundle

class RobotAccessibilityService : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // Neu ban BAT che do tu dong 100% thi moi chay
        // 1. Doc tin nhan tren man hinh
        // 2. Gui cho bo nao Meta AI: callMetaAI(message)
        // 3. Go tung phim y nhu ban: typeLikeHuman(aiReply)
    }
    override fun onInterrupt() {}
    fun typeLikeHuman(text: String) {
        val rootNode = rootInActiveWindow ?: return
        val editTexts = rootNode.findAccessibilityNodeInfosByViewId("com.zing.zalo:id/input")
        for (node in editTexts) {
            val args = Bundle()
            args.putCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE", text)
            node.performAction(android.view.accessibility.AccessibilityNodeInfo.ACTION_SET_TEXT, args)
        }
    }
    private fun callMetaAI(message: String): String {
        return "Da con chi oi, shop con size M a"
    }
}
