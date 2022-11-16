package com.example.savedstatehandle_mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel


class MainViewModel(state: SavedStateHandle): ViewModel() {

    private val _count = state.getLiveData("count",0)

    val count: LiveData<Int> get() = _count

    fun incrementCount(){
        _count.value = _count.value!! + 1
    }
}