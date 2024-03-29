package com.catnip.appfood_rohit.data.source.local.pref

import android.content.Context
import com.catnip.appfood_rohit.utils.SharedPreferenceUtils
import com.catnip.appfood_rohit.utils.SharedPreferenceUtils.set

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
interface UserPreference {
    fun isUsingDarkMode(): Boolean
    fun setUsingDarkMode(isUsingDarkMode: Boolean)
}

class UserPreferenceImpl(private val context: Context) : UserPreference {

    private val pref = SharedPreferenceUtils.createPreference(context, PREF_NAME)

    override fun isUsingDarkMode(): Boolean = pref.getBoolean(KEY_IS_USING_DARK_MODE, false)

    override fun setUsingDarkMode(isUsingDarkMode: Boolean) {
        pref[KEY_IS_USING_DARK_MODE] = isUsingDarkMode
    }

    companion object {
        const val PREF_NAME = "kokomputer-pref"
        const val KEY_IS_USING_DARK_MODE = "KEY_IS_USING_DARK_MODE"
    }
}