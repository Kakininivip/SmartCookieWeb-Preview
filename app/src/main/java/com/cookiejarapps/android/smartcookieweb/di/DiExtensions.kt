@file:JvmName("Injector")

package com.cookiejarapps.android.smartcookieweb.di

import android.content.Context
import androidx.fragment.app.Fragment
import com.cookiejarapps.android.smartcookieweb.BrowserApp

/**
 * The [AppComponent] attached to the application [Context].
 */
val Context.injector: AppComponent
    get() = (applicationContext as BrowserApp).applicationComponent

/**
 * The [AppComponent] attached to the context, note that the fragment must be attached.
 */
val Fragment.injector: AppComponent
    get() = (context!!.applicationContext as BrowserApp).applicationComponent
