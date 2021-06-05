package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var etEMAIL:EditText
    lateinit var etpassword:EditText
    lateinit var btnSIGNUP:Button
    lateinit var btnLOGIN:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        views()
        onClicklistener()
//

    }
    fun views (){
        etEMAIL=findViewById(R.id.etEMAIL)
        etpassword=findViewById(R.id.etpassword)
        btnSIGNUP=findViewById(R.id.btnSIGNUP)
        btnLOGIN=findViewById(R.id.btnLOGIN)
    }
    fun onClicklistener(){
        btnLOGIN.setOnClickListener {
            if (etEMAIL.text.toString().isEmpty() || (etpassword.text.toString().isEmpty())) {
                etEMAIL.setError("enter your email")
                etpassword.setError("password")
            }
            else {
                var information = Information(
                    etEMAIL = etEMAIL.text.toString(),
                    etpassword = etpassword.text.toString()
                )
                Toast.makeText(baseContext, information.toString(), Toast.LENGTH_LONG).show()


            }
        }
        btnSIGNUP.setOnClickListener{
            var intent=Intent(baseContext,page::class.java)
            startActivity(intent)

        }
    }
}
data class Information(var etEMAIL: String, var etpassword:String)



