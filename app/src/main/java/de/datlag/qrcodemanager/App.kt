package de.datlag.qrcodemanager

import android.app.Application
import io.github.inflationx.calligraphy3.CalligraphyConfig
import io.github.inflationx.calligraphy3.CalligraphyInterceptor
import io.github.inflationx.viewpump.ViewPump

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        applyFont()
    }

    private fun applyFont() {
        ViewPump.init(ViewPump.builder()
            .addInterceptor(
                CalligraphyInterceptor(
                CalligraphyConfig.Builder()
                    .setDefaultFontPath(this.getString(R.string.font_path))
                    .setFontAttrId(R.attr.fontPath)
                    .build())
            )
            .build())
    }

}