// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
// FILE: p/J.java

package p;

public class J {
    public static J j() { return null; }
}

// FILE: k.kt

import p.*

fun foo(): J? = null

fun main() {
    val v = foo() ?: J.j()
    if (v != null) {

    }
}

/* GENERATED_FIR_TAGS: elvisExpression, equalityExpression, flexibleType, functionDeclaration, ifExpression,
javaFunction, javaType, localProperty, nullableType, propertyDeclaration */
