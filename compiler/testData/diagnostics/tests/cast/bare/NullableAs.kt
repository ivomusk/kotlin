// RUN_PIPELINE_TILL: FRONTEND
// FIR_IDENTICAL
// CHECK_TYPE

interface Tr<T>
interface G<T> : Tr<T>

fun test(tr: Tr<String>?) {
    val v = tr as G
    checkSubtype<G<String>>(v)
}

/* GENERATED_FIR_TAGS: asExpression, classDeclaration, funWithExtensionReceiver, functionDeclaration, functionalType,
infix, interfaceDeclaration, localProperty, nullableType, propertyDeclaration, typeParameter, typeWithExtension */
