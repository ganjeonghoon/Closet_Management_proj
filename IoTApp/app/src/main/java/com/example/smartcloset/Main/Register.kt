package com.example.smartcloset.Main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.smartcloset.R
import com.example.smartcloset.network.MyMqtt
import kotlinx.android.synthetic.main.register.*
import org.eclipse.paho.client.mqttv3.MqttMessage

class Register: AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        submit_register.setOnClickListener(this)
        back_register.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.submit_register -> {

            }
            R.id.back_register -> {
                val intent = Intent(this, FirstLogin::class.java).apply {
                }
                startActivityForResult(intent, FIRSTBUTTON)
            }
        }
    }
}
