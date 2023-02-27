fun main() {
    try {
        print("Введите день недели: ")
        val day = readLine()!!.toString()
        val imDay = DayOfWeek.valueOf(day)
        println("${printNumDay(imDay)}. ${printDayOfWeek(imDay)} (${getAbbreviation(imDay)}) - ${checkWeekend(imDay)}")

        println()

        print("Введите цвет: ")
        val color = readLine()!!.toString()
        val imColor = Color.valueOf(color)
        println("${printColor(imColor)} (${getColorCode(imColor)}) - ${isWarm(imColor)}: ${isColorOfRainbow(imColor)}")
    }
    catch (e: Exception){
        println("Ошибка ввода.")
        return
    }
}