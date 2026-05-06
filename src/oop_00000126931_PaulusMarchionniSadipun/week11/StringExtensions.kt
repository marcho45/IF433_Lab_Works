package oop_00000126931_PaulusMarchionniSadipun.week11

fun String.addGreeting() : String {
    return "Hello $this"
}

fun String.repeatlines(n: Int) : String {
    return this.repeat(n)
}

fun String?.isNullOrEmptyCustom() : Boolean {
    return this == null || this.isEmpty()
}