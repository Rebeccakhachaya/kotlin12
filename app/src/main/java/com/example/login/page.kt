package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class page : AppCompatActivity() {
    lateinit var etname: EditText
    lateinit var etemail: EditText
    lateinit var etpassword: EditText
    lateinit var etgender: EditText
    lateinit var etphone:EditText
    lateinit var btnButton: Button
    lateinit var btnlogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page)
        information()
        onClicklistener()
    }
    fun information (){
        etname=findViewById(R.id.etname)
        etemail=findViewById(R.id.etemail)
        etpassword=findViewById(R.id.etpassword)
        etgender=findViewById(R.id.etgender)
        etphone=findViewById(R.id.etphone)
        btnButton=findViewById(R.id.btnBACK)
        btnlogin=findViewById(R.id.btnlogin)
    }
    fun onClicklistener(){
        btnlogin.setOnClickListener {
            if (etname.text.toString().isEmpty() || (etpassword.text.toString().isEmpty()||etgender.text.toString().isEmpty()||
                        etemail.text.toString().isEmpty()||etphone.text.toString().isEmpty())) {
                etname.setError("YOUR NAME")
                etpassword.setError("INPUT PASSWORD ")
                etemail.setError("YOUR EMAIL ")
                etgender.setError("MAKE A CHOICE ")
                etphone.setError("NUMBER")
            } else {
                var data = Data(
                    etname = etname.text.toString(),
                    etpassword = etpassword.text.toString(),
                    etemail = etemail.text.toString(),
                    etphone = etphone.text.toString(),
                    etgender=etgender.text.toString(),

                )
                Toast.makeText(baseContext, data.toString(), Toast.LENGTH_LONG).show()


            }
        }
        btnButton.setOnClickListener{
            var intent1= Intent(baseContext,MainActivity::class.java)
            startActivity(intent1)

        }
    }
}
data class Data(var etemail: String, var etpassword:String,var etname: String,var etphone:String, var etgender:String)




