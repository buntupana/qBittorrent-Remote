package com.buntupana.qbremote.data

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import org.koin.core.context.startKoin

class App : Application(){

    override fun onCreate() {
        super.onCreate()

        AndroidThreeTen.init(this)

        startKoin {

        }
    }
}