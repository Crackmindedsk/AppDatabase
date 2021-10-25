package com.example.busschedule.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.busschedule.database.ScheduleDao

class BusScheduleViewModelFactory(private val scheduleDao: ScheduleDao):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(BusscheduleViewModel::class.java)){
            @Suppress("UNCHECKED_CAST")
            return BusscheduleViewModel(scheduleDao) as T
        }
        throw IllegalAccessException("Unknown ViewModel class")
    }

}