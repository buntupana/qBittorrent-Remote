package com.buntupana.qbremote.data.api.v2

import com.buntupana.qbremote.data.model.TransferInfoRaw
import io.reactivex.rxjava3.core.Observable
import retrofit2.Response
import retrofit2.http.GET

interface TransferInfoApi {

    /**
     * Get global transfer info
     *
     * @return info you usually see in qBt status bar.
     */
    @GET("api/v2/transfer/info")
    fun info(): Observable<Response<TransferInfoRaw>>

    /**
     * Get alternative speed limits state
     *
     * @return 1 if alternative speed limits are enabled, 0 otherwise.
     */
    @GET("api/v2/transfer/speedLimitsMode")
    fun speedLimitsMode(): Observable<Response<Int>>

    /**
     * Toggle alternative speed limits
     */
    @GET("api/v2/transfer/toggleSpeedLimitsMode")
    fun toggleSpeedLimitsMode(): Observable<Response<Unit>>

}