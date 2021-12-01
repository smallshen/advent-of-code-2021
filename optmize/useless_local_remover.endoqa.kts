@file:EndoqaToolChain(Tools.ASM)
@file:EndoqaToolChain(Tools.AST)

files("build/classes/kotlin/main/", "*.class").forEach { clazz ->
    val classNode = clazz.toClassNode()
    classNode.methods.forEach {
        instructions.apply {
            val loads = filter { it.opcode.isLoad() }
            removeAll(filter { it.opcode.isStore() && loads.none { l -> l.index == it.index } })
        }
    }

    classNode.rewriteSelf()
}