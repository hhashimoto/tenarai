data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        val diffY = year - other.year
        val diffM = month - other.month
        val diffD = dayOfMonth - other.dayOfMonth
        if (diffY == 0 && diffM == 0 && diffD == 0) {
            return 0
        }
        if (diffY > 0 || (diffY == 0 && diffM > 0) || (diffY == 0 && diffM == 0 && diffD > 0)) {
            return 1
        }
        return -1
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
