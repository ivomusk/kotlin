// RUN_PIPELINE_TILL: FRONTEND
// SKIP_TXT
// DIAGNOSTICS: -UNUSED_PARAMETER
import kotlin.reflect.KProperty0

object A

fun <TProperty> property0(property: KProperty0<TProperty>) = A
val <K> K.key get() : A = property0(<!TYPE_MISMATCH!>Map.Entry<K, *>::key<!>) // should be forbidden

/* GENERATED_FIR_TAGS: functionDeclaration, getter, nullableType, objectDeclaration, propertyDeclaration,
propertyWithExtensionReceiver, typeParameter */
