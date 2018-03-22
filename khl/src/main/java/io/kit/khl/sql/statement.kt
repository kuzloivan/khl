package io.kit.khl.sql

import android.database.sqlite.SQLiteStatement

fun SQLiteStatement.bindStringOrNull(index: Int, value: String?) {
    when (value) {
        null -> bindNull(index)
        else -> bindString(index, value)
    }
}

fun SQLiteStatement.bindEnum(index: Int, value: Enum<*>?) {
    bindStringOrNull(index, value?.name)
}
