// !API_VERSION: 1.3
// JVM_TARGET: 1.8
// WITH_RUNTIME

interface Test {
    @kotlin.annotations.JvmDefault
    private fun test(): String {
        return "OK"
    }

    fun callTest(): String {
        return { test()} ()
    }
}

class TestClass : Test {

}

fun box(): String {
    return TestClass().callTest()
}
