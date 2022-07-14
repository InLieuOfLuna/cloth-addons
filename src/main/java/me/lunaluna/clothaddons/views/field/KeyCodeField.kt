package me.lunaluna.clothaddons.views.field

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.BasicField
import net.minecraft.client.util.InputUtil
import net.minecraft.client.util.InputUtil.Key

fun LunaConfig.keyCodeField(key: String, default: Key = InputUtil.UNKNOWN_KEY, hasTooltip: Boolean = false) = BasicField(Key::class, prefix, default, key) { entryBuilder, value ->
    entryBuilder.startKeyCodeField(name, value).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
}.apply { entryViews.add(this) }