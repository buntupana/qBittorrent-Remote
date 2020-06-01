package com.buntupana.qbremote.data.api.v2

import com.buntupana.qbremote.data.model.PartialDataRaw
import io.reactivex.rxjava3.core.Observable
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SyncApi {

    @GET("api/v2/sync/")
    fun mainData(@Query("rid") rid: String): Observable<Response<PartialDataRaw>>

}