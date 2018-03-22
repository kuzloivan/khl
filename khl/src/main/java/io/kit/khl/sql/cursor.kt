package io.kit.khl.sql

import android.database.Cursor
import java.util.*

fun Cursor.getDate(index: Int) = Date(getLong(index))

inline fun <reified T : Enum<T>> Cursor.getEnum(index: Int): T = enumValueOf(getString(index))