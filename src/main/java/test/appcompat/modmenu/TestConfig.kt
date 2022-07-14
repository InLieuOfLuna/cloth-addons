package test.appcompat.modmenu

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.field.*
import me.lunaluna.clothaddons.views.list.stringList
import me.lunaluna.clothaddons.views.slider.intSlider
import me.lunaluna.clothaddons.views.slider.longSlider
import me.lunaluna.clothaddons.views.toggle.booleanToggle

object TestConfig : LunaConfig(name = "test-config") {

    var alphaColor by alphaColorField("alpha-color-field")
    var int by intField("int")
    var keyCode by keyCodeField("key-code")
    var long by longField("long")
    var string by stringField("string")

    var strings by stringList("str-list")

    var intSlider by intSlider("int-slider", range = 0..3)
    var longSlider by longSlider("long-slider", range = 0L..3L)

    var boolean by booleanToggle("boolean")

}