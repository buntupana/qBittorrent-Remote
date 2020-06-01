package com.buntupana.qbremote.data.api.v2

import com.buntupana.qbremote.data.model.TorrentContentRaw
import com.buntupana.qbremote.data.model.TorrentGenericRaw
import com.buntupana.qbremote.data.model.TorrentRaw
import io.reactivex.rxjava3.core.Observable
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TorrentManagementApi {

    /**
     * Get torrent list
     *
     * @return code 200 All scenarios
     */
    @GET("api/v2/torrents/info")
    fun info(
        @Query("filter") filter: String,
        @Query("category") category: String,
        @Query("sort") sort: String,
        @Query("reverse") reverse: Boolean,
        @Query("limit") limit: Int,
        @Query("offset") offset: Int,
        @Query("hashes") hashed: String
    ): Observable<Response<List<TorrentRaw>>>

    /**
     * Get torrent generic properties
     * Requires knowing the torrent hash. You can get it from torrent list.
     *
     * @param hash of the torrent you want to get the generic properties of
     * @return code 404 when torrent wasn't found and 200 in all other scenarios
     */
    @GET("api/v2/torrents/properties")
    fun properties(
        @Query("hash") hash: String
    ): Observable<Response<TorrentGenericRaw?>>

    /**
     * Get torrent contents
     * Requires knowing the torrent hash. You can get it from torrent list.
     *
     * @param hash of the torrent you want to get the contents of
     * @return code 404 when torrent wasn't found and 200 in all other scenarios
     */
    @GET("api/v2/torrents/files")
    fun files(
        @Query("hash") hash: String
    ): Observable<Response<List<TorrentContentRaw>?>>

    /**
     * Get torrent pieces' states
     * Requires knowing the torrent hash. You can get it from torrent list.
     *
     * @param hash of the torrent you want to get the pieces' states of
     * @return code 404 when torrent wasn't found and 200 in all other scenarios
     */
    @GET("api/v2/torrents/pieceStates")
    fun pieceStates(
        @Query("hash") hash: String
    ): Observable<Response<List<Int>?>>

    /**
     * Pause torrents
     * Requires knowing the torrent hashes. You can get it from torrent list.
     *
     * @param hashes of the torrents you want to resume. hashes can contain multiple hashes
     * separated by |, to resume multiple torrents, or set to all, to resume all torrents.
     * @return code 200 for all scenarios
     */
    @GET("api/v2/torrents/pause")
    fun pause(
        @Query("hashes") hashes: String
    ): Observable<Response<Unit>>

    /**
     * Resume torrents
     * Requires knowing the torrent hashes. You can get it from torrent list.
     *
     * @param hashes of the torrents you want to resume. hashes can contain multiple hashes
     * separated by |, to resume multiple torrents, or set to all, to resume all torrents.
     * @return code 200 for all scenarios
     */
    @GET("api/v2/torrents/resume")
    fun resume(
        @Query("hashes") hashes: String
    ): Observable<Response<Unit>>

    /**
     * Delete torrents
     * Requires knowing the torrent hashes. You can get it from torrent list.
     *
     * @param hashes  of the torrents you want to delete. hashes can contain multiple hashes
     * separated by |, to delete multiple torrents, or set to all, to delete all torrents.
     * @param deleteFiles If set to true, the downloaded data will also be deleted,
     * otherwise has no effect.
     * @return code 200 for all scenarios
     */
    @GET("api/v2/torrents/resume")
    fun delete(
        @Query("hashes") hashes: String,
        @Query("deleteFiles") deleteFiles: Boolean
    ): Observable<Response<Unit>>
}