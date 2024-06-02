data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(
        Person("Петр", 25),
        Person("Иван", 30),
        Person("Дарья", 25),
        Person("Евгений", 30),
        Person("Алексей", 20),
        Person("Потап", 25),
        Person("Елена", 30),
        Person("Павел", 35),
        Person("Станислав", 20),
        Person("Дмитрий", 25),
        Person("Иполлит", 25),
        Person("Полина", 35)
    )
    println("Task 1. There is list of persons:")
    people.forEach { println("$it") }
    println("Group it by age and count:")
    println(people.groupingBy { it.age }.eachCount())

    println("//--//--//--//--//--//--// ")
    println("Task 2. There are names starts with \"П\" in persons list:")
    val names = people.filter { it.name.startsWith("П") }
    names.forEach { println("$it") }
    println("Group it by name length")
    println(names.groupBy { it.name.length })

}
