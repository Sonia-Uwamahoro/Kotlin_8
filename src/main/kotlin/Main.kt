fun main(){

    var result = listString(listOf("blue", "green", "pink", "yellow", "black", "grey", "white", "orange", "purple", "sky blue"))
    println(result)

    // average height and total
    var heights= listOf(1.2, 2.1, 1.8, 1.5, 2.5, 3.0)
    var (averageHeight,total) = height(heights)
    println("Average is : $averageHeight ,  Total is : $total")


    // sorting a list in descending order
    people()

    // average mileage of all the vehicles in the list
   var avgOfMileage = cars()
    println(avgOfMileage)
}



// a function that returns a list of the strings at even indices i.e index 2,4,6
fun listString(colors: List<String>): MutableList<String> {
    var newList = mutableListOf<String>()

    colors.forEachIndexed{
        color, colors ->
        if (color % 2 == 0){
            newList.add(colors)
        }
    }
    return newList
}


// a function that returns the average height and the total height

data class peoplesHeight(var height: Double, var total: Double)

fun height(heights: Collection<Double>): peoplesHeight{

    var averageHeight=heights.average()
    var total=heights.sum()

    return peoplesHeight(averageHeight, total)
}



// a list of Person objects, each with the attributes, name, age, height and weight. Sort the list in order of descending age

data class Person(var name: String, var age: Int, var Height: Double, var weight: Double)
data class Product(var name: String, var price: Double)
    fun people(){
        val person1 = Person("Sonia", 20, 1.65, 48.5)
        val person2 = Person("James", 25, 2.3, 70.8)
        val person3 = Person("Mark", 12, 1.0, 40.5)
        val person4 = Person("Zeus", 50, 1.9, 98.5)

        val personList = listOf(person1, person2,person3, person4)

        val sorted = personList.sortedByDescending{ person -> person.age}
        println(sorted)

    }

// list similar to the one above, write a function in which you will create 2 more people objects and add them to the list at one go.



// a function that takes in a list of Car objects each with a registration and mileage attribute and returns the average mileage of all
// the vehicles in the list.


data class Car(var registration: String, var mileage: Double)
fun cars(): Double {
    val car1 = Car("FA05 NXR", 1000.0)
    val car2 = Car("EA06 BDE", 5000.10)
    val car3 = Car("DA04 GHY", 7400.0)
    val car4 = Car("WR09 LOP", 1000.0)

    var carList = listOf(car1, car2, car3, car4)

    var sum =0.0
    for (car in carList){
        sum+=car.mileage
    }
 var avg = sum/carList.size
    return avg
}