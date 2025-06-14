// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
fun <T> foo(t: T) = t

fun test(map: MutableMap<Int, Int>, t: Int) {
    map [t] = foo(t) // t was marked with black square
}

//from library
operator fun <K, V> MutableMap<K, V>.set(key : K, value : V) : V? = this.put(key, value)

/* GENERATED_FIR_TAGS: assignment, funWithExtensionReceiver, functionDeclaration, nullableType, operator, thisExpression,
typeParameter */
