fun main() {
    // Список функций
    val listFunction = listOf(
        ::summList, ::oddValues, ::maxNumber, ::evenValues,
        ::oddCharacters, ::sortListNum, ::minLenString, ::lenString, ::minFiveLen
    )

    val multiLineText = """
        Доброго времени суток!
        Введите 10 значений и выберете что вы хотите сделать с ними
        Вот примеры того что я могу):
        1. Я могу вывести сумму 10 чисел (но вводите пожалуйста числа)
        2. Я могу вывести все нечетные числа из этого списка (но вводите пожалуйста числа)
        3. Могу выбрать свмое большое число из списка
        4. Могу выбрать все четные числа из списка
        5. А еще я могу из строки вывести все символы которые находятся на нечетной позиции
        6. Если вы введете строку с цифрами, я могу показать все цифры со строки
        7. Могу вывести самое короткое значение из строки
        8. Могу вывести длинну каждой строки
        9. А могу вывести строки длинее 5ти символов!!!
        И так, введите номер операции:
   """.trimIndent()
    println(multiLineText)
    var numberFun = 0
    var boolFunction: Boolean = false
    while (boolFunction != true) {
        val input: String? = readLine()
        if (input != null && input != "" && input.all { it.isDigit() }) {
            if (input.toInt() in 1..9) {
                numberFun = input.toInt()
                listFunction[numberFun - 1]()
                boolFunction = true
            } else {
                println("Введите номер операции от 1 до 9")

            }
        } else {
            println("Введите номер операции от 1 до 9")
        }
    }
}






