package com.buntupana.qbremote.data.api.legacy

import com.buntupana.qbremote.data.model.*
import io.reactivex.rxjava3.core.Observable
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface LegacyGetApi {

    @GET("query/torrents")
    fun fetchTorrents(
        @Query("filter") filter: String,
        @Query("category") category: String,
        @Query("sort") sort: String,
        @Query("reverse") reverse: Boolean,
        @Query("limit") limit: Int,
        @Query("offset") offset: Int,
        @Query("hashes") hashed: String
    ): Observable<Response<List<TorrentRaw>>>

    @GET("query/propertiesGeneral/{hash}")
    fun fetchTorrentGeneric(
        @Path("hash") hash: String
    ): Observable<TorrentGenericRaw?>

    @GET("query/propertiesTrackers/{hash}")
    fun fetchTorrentTracker(
        @Path("hash") hash: String
    ): Observable<List<TorrentTrackerRaw>?>

    @GET("query/propertiesFiles/{hash}")
    fun fetchTorrentContent(
        @Path("hash") hash: String
    ): Observable<List<TorrentContentRaw>?>

    @GET("query/getPieceStates/{hash}")
    fun fetchTorrentPiecesStates(
        @Path("hash") hash: String
    ): Observable<List<Int>?>

    @GET("query/transferInfo")
    fun fetchTransferInfo(): Observable<TransferInfoRaw>

    /**
     * Get partial data
     * @param rid Response ID. If not provided, rid=0 will be assumed. If the given rid is different
     * from the one of last server reply, full_update will be true (see the server reply details for
     * more info)
     */
    @GET("sync/maindata")
    fun fetchPartialData(
        @Query("rid") rid: Int
    ): Observable<PartialDataRaw>
}