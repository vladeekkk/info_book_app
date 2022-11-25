package com.xp.autobookapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import junit.framework.Assert.assertEquals

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.
import org.junit.Rule
import java.util.regex.Pattern.matches

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java) // TODO use later

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.xp.autobookapp", appContext.packageName)
    }

    @Test
    fun MainActivityDispayedTest() {
        listOf(R.id.mark_text_view, R.id.show_info_btn, R.id.fab).forEach { viewId ->
            onView(withId(viewId)).check(matches(isDisplayed()))
        }
    }

    @Test
    fun MainActivityButtonTest() {
        onView(withId(R.id.show_info_btn)).check(matches(isClickable()))
        onView(withId(R.id.show_info_btn)).check(matches(isFocusable()))
    }
}