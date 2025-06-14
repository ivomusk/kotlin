// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
abstract class ClassEmpty {
    abstract fun foo()
}

interface BaseEmpty {
    fun foo()
}

interface BaseDefault {
    fun foo() {}
}

abstract class ClassEmpty_BaseEmpty_BaseDefault : ClassEmpty(), BaseEmpty, BaseDefault

/* GENERATED_FIR_TAGS: classDeclaration, functionDeclaration, interfaceDeclaration */
