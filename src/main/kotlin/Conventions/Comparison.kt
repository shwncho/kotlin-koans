package Conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(o: MyDate) = when {
        year!=o.year -> year - o.year
        month!=o.month -> month - o.month
        else -> dayOfMonth - o.dayOfMonth
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}