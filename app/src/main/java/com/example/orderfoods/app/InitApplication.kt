package com.example.orderfoods.app

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import androidx.preference.PreferenceManager.getDefaultSharedPreferences

class InitApplication : Application() {
    private var isNightModeEnabled = true

    companion object {
        const val NIGHT_MODE = "NIGHT_MODE"
        private var singleton: InitApplication? = null
        val instance: InitApplication?
            get() {
                if (singleton == null) {
                    singleton = InitApplication()
                }
                return singleton
            }
    }


    override fun onCreate() {
        super.onCreate()
        singleton = this
        val mPrefs = getDefaultSharedPreferences(this)
        isNightModeEnabled = mPrefs.getBoolean(NIGHT_MODE, true)
        if (instance!!.isNightModeEnabled()) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }

    }


    fun isNightModeEnabled(): Boolean {
        return isNightModeEnabled
    }

    fun setIsNightModeEnabled(isNightModeEnabled: Boolean) {
        this.isNightModeEnabled = isNightModeEnabled
        val mPrefs = getDefaultSharedPreferences(this)
        val editor = mPrefs.edit()
        editor.putBoolean(NIGHT_MODE, isNightModeEnabled)
        editor.apply()
    }


}