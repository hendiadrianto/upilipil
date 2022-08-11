package com.hendi.library

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.hendi.upilipil.decimalFormat
import com.hendi.upilipil.orZero

class Zero : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.main_layout)

        val edit = findViewById<EditText>(R.id.edittext)
        val nulable = null
        val dec = nulable.decimalFormat("Rp")

        println("dec : ${dec.orZero()}")

        edit.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s.toString().isNotEmpty()) {
                }
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {

        var a = 10
        a.orZero()

        return super.onCreateView(name, context, attrs)
    }

}