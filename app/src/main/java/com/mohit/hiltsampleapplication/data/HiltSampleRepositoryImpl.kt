package com.mohit.hiltsampleapplication.data

import com.mohit.hiltsampleapplication.data.remote.HiltSampleService
import io.reactivex.Observable
import javax.inject.Inject

class HiltSampleRepositoryImpl @Inject constructor(
    private val hiltSampleService: HiltSampleService
) : HiltSampleRepository {

    override fun retrieveData(): Observable<String> =
        hiltSampleService.retrieveData().map { it.result }
}
