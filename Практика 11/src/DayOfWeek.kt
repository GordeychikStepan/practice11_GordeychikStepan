enum class DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
fun printDayOfWeek(day: DayOfWeek): String {
    return when (day) {
        DayOfWeek.MONDAY -> "Понедельник"
        DayOfWeek.TUESDAY -> "Вторник"
        DayOfWeek.WEDNESDAY -> "Среда"
        DayOfWeek.THURSDAY -> "Четверг"
        DayOfWeek.FRIDAY -> "Пятница"
        DayOfWeek.SATURDAY -> "Суббота"
        DayOfWeek.SUNDAY -> "Воскресенье"
    }
}
fun printNumDay(day: DayOfWeek): Int {
    return when (day) {
        DayOfWeek.MONDAY -> 1
        DayOfWeek.TUESDAY -> 2
        DayOfWeek.WEDNESDAY -> 3
        DayOfWeek.THURSDAY -> 4
        DayOfWeek.FRIDAY -> 5
        DayOfWeek.SATURDAY -> 6
        DayOfWeek.SUNDAY -> 7
    }
}
fun checkWeekend(day: DayOfWeek): String {
    return if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY)
        "выходной"
    else "будний день"
}
fun getAbbreviation(day: DayOfWeek): String {
    return when (day) {
        DayOfWeek.MONDAY -> "Пон."
        DayOfWeek.TUESDAY -> "Вт."
        DayOfWeek.WEDNESDAY -> "Ср."
        DayOfWeek.THURSDAY -> "Чет."
        DayOfWeek.FRIDAY -> "Пят."
        DayOfWeek.SATURDAY -> "Суб."
        DayOfWeek.SUNDAY -> "Вос."
    }
}