package com.longrobot
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import android.widget.Switch
import android.widget.Button
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainSwitch = findViewById<Switch>(R.id.mainPowerSwitch)
        val statusText = findViewById<TextView>(R.id.statusText)
        val btnNoti = findViewById<Button>(R.id.btnNotiPermission)
        val btnAcc = findViewById<Button>(R.id.btnAccessibilityPermission)
        mainSwitch.setOnCheckedChangeListener { _, isChecked ->
            statusText.text = if (isChecked) "Đang tự động 100% - Robot đang nghe Zalo" else "Đã tắt - Robot đang nghỉ"
        }
        btnNoti.setOnClickListener { startActivity(Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS)) }
        btnAcc.setOnClickListener { startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)) }
    }
    companion object { fun isAutoEnabled() = true }
}
