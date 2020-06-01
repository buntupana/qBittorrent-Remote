package com.buntupana.qbremote.data.api.v2

import io.reactivex.rxjava3.core.Observable
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Path

interface AuthApi {

    @FormUrlEncoded
    @GET("{baseUrl}/api/v2/auth/login")
    fun login(
        @Path("baseUrl") baseUrl: String,
        @Field("username") username: String,
        @Field("password") password: String
    ): Observable<Response<String>>

    @GET("api/v2/auth/logout")
    fun logout(): Observable<Response<Unit>>
}