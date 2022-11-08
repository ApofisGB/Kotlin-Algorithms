import kotlin.math.abs

// Проверка строки на уникальность символов
fun uniqueSymbols(string: String): Boolean {
    if (string.length > 128) return false

    val n = string.length - 1
    for (i in 0..n) {
        if ((string[i] != ' ') and (string[i] in string.slice(i + 1..n))) return false
    }

    return true
}


// Проверка перестановок двух строк
fun permutation(string1: String, string2: String): Boolean {
    if (string1.length != string2.length) return false

    var codes1 = 0
    for (char in string1.lowercase()) codes1 += char.code

    var codes2 = 0
    for (char in string2.lowercase()) codes2 += char.code

    return (codes1 == codes2)
}


// Замена пробелов специальными символами
fun replacingSpaces(string: String): String {
    var newString = ""
    for (char in string) {
        if (char == ' ') newString += "%20"
        else newString += char
    }
    return newString
}


// Проверка на палиндром
fun palindrome(string: String): Boolean {

    val mapCounter = mutableMapOf<Char, Int>()

    val newString = string.filter { !it.isWhitespace() }
    for (i in newString.indices) {
        mapCounter[newString[i]] = mapCounter.getOrDefault(newString[i], 0) + 1
    }

    var flag = false
    for (value in mapCounter.values) {
        if (value % 2 == 1) {
            if (flag) return false
            flag = true
        }
    }
    return true
}


// Битовое расстояние Левенштейна
fun minDistance(string1: String, string2: String): Boolean {

    val n = string1.length
    val m = string2.length
    val diff = abs(n - m)
    if (diff > 1) return false

    var count = 0

    var i = 0
    var j = 0

    while ((i < n - 1) and (j < m - 1)) {



    }

    count += diff

    return (count < 2)
}


fun main() {

    val string1 = readln()
    val string2 = readln()
    print(minDistance(string1, string2))

}


