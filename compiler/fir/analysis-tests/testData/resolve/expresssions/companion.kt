// RUN_PIPELINE_TILL: FRONTEND
open class A {
    companion object {
        fun foo() {}
        val D = ""
    }

    fun bar() {
        foo()
    }
}

class B {
    companion object : A() {
        fun baz() {}
        val C = ""
    }
}

fun test() {
    A.foo()
    B.bar()
    B.baz()
    val x = A.D
    val y = B.C
    val z = B.<!UNRESOLVED_REFERENCE!>D<!>
}

/* GENERATED_FIR_TAGS: classDeclaration, companionObject, functionDeclaration, localProperty, objectDeclaration,
propertyDeclaration, stringLiteral */
