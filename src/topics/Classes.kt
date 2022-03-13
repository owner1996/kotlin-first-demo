package topics

fun main() {
    val person = Person(
        "Mukhammad", "Jalolov", 25,
        Person("Rasul", "Jalolov", 0)
    )

    println(person.age)
    println(person.children[0].firstName)

    val person2 = Person()

    val rectangle = Rectangle(3.0, 4.0);


    println(rectangle.test)

}

class Person(val firstName: String, val lastName: String, val age: Int = 26) {
    var children: MutableList<Person> = mutableListOf() // ArrayList

    init {
        println("Person $firstName is created")
    }

    constructor(firstName: String, lastName: String, age: Int, child: Person) :
            this(firstName, lastName, age) {
        children.add(child);
    }

    constructor() : this("", "", -1)
}

data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1
        set(value) {
            if (value < 0) println("Negative value") else field = value
        }

    fun area() = height * this.length
}