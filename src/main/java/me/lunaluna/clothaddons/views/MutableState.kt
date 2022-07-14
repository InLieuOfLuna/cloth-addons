package me.lunaluna.clothaddons.views

import kotlin.reflect.KClass
import kotlin.reflect.KProperty

open class MutableState<T: Any>(protected val type: KClass<T>, protected var value: T) {
    operator fun getValue(testConfig: Any?, property: KProperty<*>): T {
        return value
    }

    operator fun setValue(testConfig: Any?, property: KProperty<*>, any: T) {
        this.value = any
    }
}