// RUN_PIPELINE_TILL: FRONTEND
// FIR_IDENTICAL
// LANGUAGE: +VariableDeclarationInWhenSubject
// DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_PARAMETER


fun testNoSubjectVariableName(x: Int?) {
    val y = when (val<!SYNTAX!><!> = 42) {
        0 -> "0"
        else -> "not 0"
    }
}

/* GENERATED_FIR_TAGS: equalityExpression, functionDeclaration, integerLiteral, localProperty, nullableType,
propertyDeclaration, stringLiteral, whenExpression, whenWithSubject */
