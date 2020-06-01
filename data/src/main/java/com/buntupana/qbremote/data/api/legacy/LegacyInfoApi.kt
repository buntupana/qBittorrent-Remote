package com.buntupana.qbremote.data.api.legacy

import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface LegacyInfoApi {

    @GET("version/api")
    fun getApiVersion() : Observable<String>

    @GET("version/api_min")
    fun getMinApiVersion(): Observable<String>

    @GET("version/qbittorrent")
    fun getQBVersion(): Observable<String>
}