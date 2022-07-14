package me.lunaluna.clothaddons.views.slider

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.BasicField

fun LunaConfig.intSlider(key: String, default: Int = 0, range: IntRange, hasTooltip: Boolean = false) = BasicField(Int::class, prefix, default, key) { entryBuilder, value ->
    entryBuilder.startIntSlider(name, value, range.first, range.last).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
}.apply { entryViews.add(this) }