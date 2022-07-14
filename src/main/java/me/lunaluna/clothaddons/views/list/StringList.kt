package me.lunaluna.clothaddons.views.list

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.BasicField
import kotlin.reflect.KClass

fun LunaConfig.stringList(key: String, default: List<String> = emptyList(), hasTooltip: Boolean = false) = BasicField(
    emptyList<String>()::class as KClass<List<String>>, prefix, default, key,
) { entryBuilder, value ->
    entryBuilder.startStrList(name, value).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
}.apply { entryViews.add(this) }