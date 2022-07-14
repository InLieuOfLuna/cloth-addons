package me.lunaluna.clothaddons.views.impl

import me.lunaluna.clothaddons.views.BasicField

class StringField(config: String, key: String, default: String = "", hasTooltip: Boolean = false) : BasicField<String>(String::class, config, default, key, { entryBuilder, value ->
    entryBuilder.startStrField(name, value).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
})