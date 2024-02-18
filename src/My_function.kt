// Функция наполнения списка числами
fun fillingNumberList(): MutableList<Int> {

    val listRandom = mutableListOf<Int>()
    println("Введите деслять чисел)")

    while (listRandom.count() < 10) {
        val input = readLine()
        if (input != null && input.toIntOrNull() != null ) {

            listRandom.add(input.toInt())

        } else {
            println("Введите пожалуйста число")
        }
    }

    return listRandom
}

// Функция наполнения списка строковым данным
fun fillingStringList(): MutableList<String> {

    val listRandom = mutableListOf<String>()
    println("Наполните список десятью значениями")


    while (listRandom.count() < 10) {
        val input: String? = readLine()
        if (input != null && input != "") {
            listRandom.add(input)
        } else {
            println("Введите пожалуйста данные")
        }
    }

    return listRandom
}

// Функция вычисления суммы всех чисел масива
fun summList() {
    val listNumber = fillingNumberList()
    val summListNumber = listNumber.sum()
    return println("Сумма всех чисел $summListNumber")
}

// Функция вывода нечетных значения
fun oddValues() {
    val listNumber = fillingNumberList()
    val listOddValues = mutableListOf<Int>()
    for (number in listNumber) {
        if (number % 2 != 0) {
            listOddValues.add(number)
        }
    }
    return println("Нечетными числами являются $listOddValues")
}

// Функция выводит самое большое значение
fun maxNumber() {
    val listNumber = fillingNumberList()
    var maxNum = 0
    for (number in listNumber) {if (maxNum < number) {maxNum = number}}
    return println("Самое большое значение списка $maxNum")
}

// Функция вывода четных значений
fun evenValues() {
    val listNumber = fillingNumberList()
    val listEvenValues = mutableListOf<Int>()
    for (number in listNumber) {
        if (number % 2 == 0) {
            listEvenValues.add(number)
        }
    }
    return println("Четными числами являются $listEvenValues")
}

//Функция вывода значений на нецетных позициях
fun oddCharacters() {
    println("Введите длинную строоку")
    var input: String? = readLine()
    while (input == null || input == "") {
        println("Вы не ввели ничего")
        input = readLine()
    }
    val listChar = mutableListOf<Char>()
    for (i in input.indices step 2) {
        listChar.add(input[i])
    }
    return println("На нечетных позициях находятся значения $listChar")
}

// Функция показывающаяя цифры из произвольной строки
fun sortListNum() {
    println("Введите строку с цифрами")
    var input: String? = readLine()
    while (input == null || input == "") {
        println("Вы не ввели ничего")
        input = readLine()
    }
    val number = input.filter { it.isDigit() }
    if (number == "") {
        println("В этой стоке нет цифр")
    } else {
        println("Цифры из этой строки $number")
    }
    return
}

// Функция показывает самое короткое значение
fun minLenString () {
    val listString = fillingStringList().sortedBy { it.length }
    val minListString = listString[0]
    return println("Самое короткое слово $minListString ")
}

// Функция выводящая длинну каждой строки
fun lenString () {
    val strings = fillingStringList()
    for (string in strings){
        val len = string.length
        println("Длинна строки $string $len символов")
    }
    return
}

//Функция выводит все значения длиннее 5ти символов

fun minFiveLen () {
    val strings = fillingStringList()
    var lenString = mutableListOf<String>()
    for (string in strings){
        if (string.length > 5){
            lenString.add(string)
        }

    }
    return println("А вот и строки длиннее пяти символов $lenString")
}