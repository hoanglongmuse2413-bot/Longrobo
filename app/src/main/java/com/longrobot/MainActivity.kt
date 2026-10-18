package com.longrobot

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.switchmaterial.SwitchMaterial
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switchAuto = findViewById<SwitchMaterial>(R.id.switchAuto)
        val btnAccessibility = findViewById<MaterialButton>(R.id.btnAccessibility)
        val btnNotification = findViewById<MaterialButton>(R.id.btnNotification)

        val prefs = getSharedPreferences("long_robot", MODE_PRIVATE)
        switchAuto.isChecked = prefs.getBoolean("auto_enabled", false)

        switchAuto.setOnCheckedChangeListener { _, isChecked ->
            prefs.edit().putBoolean("auto_enabled", isChecked).apply()
        }

        btnAccessibility.setOnClickListener {
            startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
        }

        btnNotification.setOnClickListener {
            startActivity(Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS))
        }
    }
}
