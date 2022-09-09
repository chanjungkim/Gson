package io.chanjungkim.gson

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

fun <T> Gson.fromJsonToArrayList(jsonArray: String, clazz: Class<T>): ArrayList<T> {
    val typeOfT: Type = TypeToken.getParameterized(MutableList::class.java, clazz).type
    return this.fromJson(jsonArray, typeOfT) as ArrayList<T>
}