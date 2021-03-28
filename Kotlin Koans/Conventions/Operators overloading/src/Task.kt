import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate {
    return this.addTimeIntervals(timeInterval, 1)
}

data class TimeIntervalExtra(val timeInterval: TimeInterval, val amount: Int)

operator fun TimeInterval.times(amount: Int): TimeIntervalExtra {
    return TimeIntervalExtra(this, amount)
}

operator fun MyDate.plus(timeIntervalExtra: TimeIntervalExtra): MyDate {
    return this.addTimeIntervals(timeIntervalExtra.timeInterval, timeIntervalExtra.amount)
}

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
