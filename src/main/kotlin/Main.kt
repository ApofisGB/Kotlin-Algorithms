
// Проверка строки на уникальность символов
fun uniqueSymbols(string: String): Boolean {
    if (string.length > 128) return false

    val n = string.length - 1
    for (i in 0..n) {
        if ((string[i] != ' ') and (string[i] in string.slice(i+1..n))) return false
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


fun main() {

    val string = readln()
    print(replacingSpaces(string))

}


