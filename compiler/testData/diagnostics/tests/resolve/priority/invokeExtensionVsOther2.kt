// RUN_PIPELINE_TILL: FRONTEND
// FIR_IDENTICAL
// CHECK_TYPE
// DIAGNOSTICS: -UNUSED_EXPRESSION -UNUSED_PARAMETER -UNUSED_VARIABLE

class A {
    fun foo() = this
}

fun test(foo: A.() -> Int) {
    with(A()) {
        foo() checkType { _<A>() }
        this.foo() checkType { _<A>() }
    }
}

/* GENERATED_FIR_TAGS: classDeclaration, funWithExtensionReceiver, functionDeclaration, functionalType, infix,
lambdaLiteral, nullableType, thisExpression, typeParameter, typeWithExtension */
