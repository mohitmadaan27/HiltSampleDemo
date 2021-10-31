package com.mohit.hiltsampleapplication

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.mohit.hiltsampleapplication.data.HiltSampleRepository

class HiltSampleViewModel @ViewModelInject constructor(
    private val hiltSampleRepository: HiltSampleRepository
) : ViewModel() {

    init {
        hiltSampleRepository.retrieveData()
    }
}
