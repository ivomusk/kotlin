// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
interface My {
    <!REDUNDANT_OPEN_IN_INTERFACE!>open<!> fun foo()
    open fun bar() {}
    <!REDUNDANT_MODIFIER!>open<!> abstract fun baz(): Int

    <!REDUNDANT_OPEN_IN_INTERFACE!>open<!> val x: Int
    open val y: String
        get() = ""
    <!REDUNDANT_MODIFIER!>open<!> abstract val z: Double
}

/* GENERATED_FIR_TAGS: functionDeclaration, getter, interfaceDeclaration, propertyDeclaration, stringLiteral */
