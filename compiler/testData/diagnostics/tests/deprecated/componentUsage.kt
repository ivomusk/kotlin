// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
// DIAGNOSTICS: -UNUSED_VARIABLE

class Data {
    @Deprecated("text")
    operator fun component1(): String = throw Exception()
    operator fun component2(): String = throw Exception()
}

fun use() {
    val (<!DEPRECATION!>x<!>, y) = Data()
}

/* GENERATED_FIR_TAGS: classDeclaration, destructuringDeclaration, functionDeclaration, localProperty, operator,
propertyDeclaration, stringLiteral */
