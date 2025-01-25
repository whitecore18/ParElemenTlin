fun main() {
    // t1
    val numbers = (1..20).toList()
    val evenCount = numbers.drop(4).count { it % 2 == 0 }
    println("Количество четных чисел с 5 элемента до конца: $evenCount")

    // t2
    val sumFirstSeven = numbers.take(7).sum()
    println("Сумма первых 7 чисел: $sumFirstSeven")

    // t3
    val strings = listOf("one", "two", "three")
    val characters = strings.map { it.toList() }.flatten()
    println("Список символов: $characters")

    // t4
    val longestString = strings.maxByOrNull { it.length }
    println("Строка максимальной длины: $longestString")

    // t5
    data class Product(val name: String, val quantity: Int)
    val products = listOf(
        Product("apple", 10),
        Product("banana", 5),
        Product("orange", 8)
    )
    val totalQuantity = products.map { it.quantity }.fold(0) { acc, quantity -> acc + quantity }
    println("Общее количество продуктов на складе: $totalQuantity")
}