// RUN_PIPELINE_TILL: FRONTEND
// FIR_IDENTICAL
// DIAGNOSTICS: -UNUSED_VALUE

fun foo(): Int {
    val i: Int
    var j = 0
    do {
        <!VAL_REASSIGNMENT!>i<!> = ++j
    } while (j < 5)
    return i
}

/* GENERATED_FIR_TAGS: assignment, comparisonExpression, doWhileLoop, functionDeclaration, incrementDecrementExpression,
integerLiteral, localProperty, propertyDeclaration */
