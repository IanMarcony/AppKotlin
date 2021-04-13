package com.marcony.appkotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private var inputNome: EditText?  = null
    private var inputEmail: EditText? = null
    private var buttonLogon: Button?  = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputNome = findViewById<EditText>(R.id.inputName)
        inputEmail = findViewById<EditText>(R.id.inputEmail)
        buttonLogon= findViewById<Button>(R.id.btnMessage)

        buttonLogon?.setOnClickListener {

            var name = inputNome?.text.toString()
            var email = inputEmail?.text.toString()

            if(name.isNotEmpty() &&email.isNotEmpty()){
                val alertDialog: AlertDialog? = this?.let {
                    val builder = AlertDialog.Builder(it)
                    builder.apply {
                        setMessage("Seu nome: $name \n Seu E-mail: $email ")
                        setTitle("Você logou!!!")
                    }

                    builder.create()
                }
                alertDialog?.create()




            }else{
                Toast.makeText(this,"Preencha os campos obrigatórios",Toast.LENGTH_SHORT).show()
            }

        }


    }
}