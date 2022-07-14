package me.lunaluna.clothaddons.views

import me.lunaluna.clothaddons.LunaConfig
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder
import kotlin.properties.PropertyDelegateProvider
import kotlin.reflect.KClass

inline fun <reified T : Any> LunaConfig.provider(
    default: T,
    key: String? = null,
    noinline addEntry: BasicField<T>.(ConfigEntryBuilder, T) -> AbstractConfigListEntry<*>
) = PropertyDelegateProvider { _ : Any?, property ->
    BasicField(T::class, prefix, default, key ?: property.name, addEntry).apply { entryViews.add(this) }
}