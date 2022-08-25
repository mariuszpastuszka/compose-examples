package com.mpas.composebook.composeunitconverter.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mpas.composebook.composeunitconverter.Repository

class ViewModelFactory(private val repository: Repository) :
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        if (modelClass.isAssignableFrom(TemperatureViewModel::class.java))
            TemperatureViewModel(repository) as T
        else
            DistancesViewModel(repository) as T
}