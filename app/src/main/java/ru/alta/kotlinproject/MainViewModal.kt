package ru.alta.kotlinproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModal : ViewModel(){
    var count: Int = 0
    private val viewStateLiveData: MutableLiveData<String> = MutableLiveData()
    init {
        viewStateLiveData.value = "Hello World!!!"
    }

    fun viewState(): LiveData<String> = viewStateLiveData

    fun updateCount(){
        ++count
        viewStateLiveData.value = count.toString()
    }

}