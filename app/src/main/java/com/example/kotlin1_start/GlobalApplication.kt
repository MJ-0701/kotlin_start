package com.example.kotlin1_start

import android.app.Application
import com.kakao.sdk.common.KakaoSdk


class GlobalApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        KakaoSdk.init(this, "94a1cd50b06c3a7487bebc884a33b95c")
    }
}