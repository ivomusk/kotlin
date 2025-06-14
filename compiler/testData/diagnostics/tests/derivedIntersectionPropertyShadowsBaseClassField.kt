// RUN_PIPELINE_TILL: BACKEND
// WITH_STDLIB
// FIR_DUMP
// FILE: Base.java

public class Base {
    public String x = "";
}

// FILE: test.kt

interface Proxy {
    val x: String
}

open class Intermediate : Base() {
    val x get() = " "
}

class Derived : Proxy, Intermediate() {
    fun test() {
        <!BASE_CLASS_FIELD_SHADOWS_DERIVED_CLASS_PROPERTY!>x<!>
    }
}

/* GENERATED_FIR_TAGS: classDeclaration, functionDeclaration, getter, interfaceDeclaration, javaType,
propertyDeclaration, stringLiteral */
