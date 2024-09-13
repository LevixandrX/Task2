fun main() {
    while (true) {
        println("Введите строку, чтобы подсчитать количество различных символов (без цифр):")

        val input = readlnOrNull()

        if (input.isNullOrBlank() || !input.matches(Regex("[A-Za-zА-Яа-яЁё]+"))) {
            println("Ошибка: Введите непустую строку, состоящую только из букв.")
            continue
        }

        val charCount = mutableMapOf<Char, Int>()

        for (char in input) {
            charCount[char] = charCount.getOrDefault(char, 0) + 1
        }

        val sortedChars = charCount.keys.sorted()
        for (char in sortedChars) {
            println("$char - ${charCount[char]}")
        }

        break
    }
}
