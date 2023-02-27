enum class Color() {
    RED, ORANGE, YELLOW, GREEN, BLUE, PURPLE, PINK;
}
fun printColor(color: Color): String {
    return when (color) {
        Color.RED -> "Красный"
        Color.ORANGE -> "Ораньжевый"
        Color.YELLOW -> "Желтый"
        Color.GREEN -> "Зеленый"
        Color.BLUE -> "Синий"
        Color.PURPLE -> "Фиолетовый"
        Color.PINK -> "Розовый"
    }
}
fun isWarm(color: Color): String {
    return if (color == Color.RED || color == Color.ORANGE || color == Color.YELLOW)
        "теплый"
    else
        "не теплый"
}
fun getColorCode(color: Color): String {
    return when (color) {
        Color.RED -> "ff0000"
        Color.ORANGE -> "ffa500"
        Color.YELLOW -> "ffff00"
        Color.GREEN -> "008000"
        Color.BLUE -> "0000ff"
        Color.PURPLE -> "8b00ff"
        Color.PINK -> "ffc0cb"
    }
}
fun isColorOfRainbow(color: Color): String {
    return if (color == Color.RED || color == Color.ORANGE || color == Color.YELLOW
        || color == Color.GREEN || color == Color.BLUE || color == Color.PURPLE)
        "является цветом радуги"
    else
        "не является цветом радуги"
}