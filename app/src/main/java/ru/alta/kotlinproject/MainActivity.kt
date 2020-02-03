package ru.alta.kotlinproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.ViewModelProviders.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModal



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider (this).get(MainViewModal::class.java)
        btn.setOnClickListener {
            viewModel.updateCount() // увеличиваем счетчик нажатий
        }
        viewModel.viewState().observe(this, Observer() {
            textView.text = it
        })

    }

}
