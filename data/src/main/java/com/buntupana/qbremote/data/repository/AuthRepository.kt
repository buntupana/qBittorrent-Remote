package com.buntupana.qbremote.data.repository

import com.buntupana.qbremote.data.api.legacy.LegacyAuthApi
import com.buntupana.qbremote.data.api.v2.AuthApi

class AuthRepository(private val legacyAuthApi: LegacyAuthApi, private val authApi: AuthApi) {

    fun login(baseUrl: String, username: String, password: String, legacy: Boolean) {
        if (legacy) {
            legacyAuthApi.login(baseUrl, username, password)
        } else {
            authApi.login(baseUrl, username, password)
        }
    }
}
