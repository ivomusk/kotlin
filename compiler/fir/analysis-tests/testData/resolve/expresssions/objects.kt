// RUN_PIPELINE_TILL: BACKEND
object A {
    fun foo() = this
}

fun use() = A
fun bar() = A.foo()

/* GENERATED_FIR_TAGS: functionDeclaration, objectDeclaration, thisExpression */
