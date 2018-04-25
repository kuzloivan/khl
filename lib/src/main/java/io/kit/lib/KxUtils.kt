package io.kit.lib

fun <T1 : Any, T2 : Any, R : Any> multiLet(p1: T1?, p2: T2?, block: (p1: T1, p2: T2) -> R) =
        if (p1 != null && p2 != null) block(p1, p2) else null

fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, R : Any> multiLet(p1: T1?, p2: T2?, p3: T3?, p4: T4?, block: (p1: T1, p2: T2, p3: T3, p4: T4) -> R) =
        if (p1 != null && p2 != null && p3 != null && p4 != null) block(p1, p2, p3, p4) else null

fun <R : Any> runIf(condition: Boolean, block: () -> R) {
    if (condition) block()
}

fun <T, R> T?.elseLet(block: (T) -> R, elseBlock: () -> R): R =
        if (this != null) {
            block(this)
        } else {
            elseBlock()
        }