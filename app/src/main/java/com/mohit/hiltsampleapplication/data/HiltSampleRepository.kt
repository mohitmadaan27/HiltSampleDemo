package com.mohit.hiltsampleapplication.data

import io.reactivex.Observable

interface HiltSampleRepository {

    fun retrieveData(): Observable<String>
}
