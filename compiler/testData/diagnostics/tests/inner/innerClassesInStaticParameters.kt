// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
class Test {
    companion object {
        fun test(t: TestInner) = 42
    }

    class TestStatic {
        fun test(t: TestInner) = 42
    }

    inner class TestInner
}

/* GENERATED_FIR_TAGS: classDeclaration, companionObject, functionDeclaration, inner, integerLiteral, nestedClass,
objectDeclaration */
