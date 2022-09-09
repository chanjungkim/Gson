package io.chanjungkim.gson

import com.google.gson.Gson
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    data class TestModel(val name: String, val level: Int)

    @Test
    fun parseArrayListJson() {
        val json = "[{\"name\":\"evan\", \"level\": 1}, {\"name\":\"hazel\", \"level\": 2}, {\"name\":\"mason\", \"level\": 3}]"

        val expected = arrayListOf(TestModel("evan", 1), TestModel("hazel", 2), TestModel("mason", 3))
        val result = Gson().fromJsonToArrayList(json, TestModel::class.java)

        assertEquals(expected, result)
    }
}