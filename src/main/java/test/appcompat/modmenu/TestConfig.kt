package test.appcompat.modmenu

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.impl.StringField

object TestConfig : LunaConfig(name = "test-config") {

    var string by StringField(name, "string").apply { entryViews.add(this) }

}