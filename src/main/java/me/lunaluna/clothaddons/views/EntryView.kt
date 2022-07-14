package me.lunaluna.clothaddons.views

import me.shedaniel.clothconfig2.api.AbstractConfigListEntry
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder

interface EntryView {

    fun addEntry(entryBuilder: ConfigEntryBuilder): AbstractConfigListEntry<*>

}