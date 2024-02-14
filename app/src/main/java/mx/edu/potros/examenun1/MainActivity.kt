package mx.edu.potros.examenun1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etC: EditText = findViewById(R.id.EtC)
        val etF: EditText = findViewById(R.id.EtF)
        val btnGC: Button = findViewById(R.id.btnGC)
        val btnGF: Button = findViewById(R.id.btnGF)

        btnGC.setOnClickListener {
            val fahrenheit = etF.text.toString().toDoubleOrNull()
            if (fahrenheit != null) {
                val celsius = (fahrenheit - 32) / 1.8
                etC.setText(String.format("%.2f", celsius))
            } else {
                etC.setText("")
            }
        }

        btnGF.setOnClickListener {
            val celsius = etC.text.toString().toDoubleOrNull()
            if (celsius != null) {
                val fahrenheit = celsius * 1.8 + 32
                etF.setText(String.format("%.2f", fahrenheit))
            } else {
                etF.setText("")
            }
        }
    }
}
