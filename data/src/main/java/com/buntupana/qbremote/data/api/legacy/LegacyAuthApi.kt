package com.buntupana.qbremote.data.api.legacy

import io.reactivex.rxjava3.core.Observable
import retrofit2.Response
import retrofit2.http.*

interface LegacyAuthApi {

    @FormUrlEncoded
    @POST("{baseUrl}/login")
    fun login(
        @Path("baseUrl") baseUrl: String,
        @Field("username") username: String,
        @Field("password") password: String
    ): Observable<Response<String>>

    @POST("logout")
    fun logout(@Header("Set-Cookie") token: String) : Observable<Unit>
}