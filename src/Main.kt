/**
 * Learning about Kotlin collections, particularly
 * the MutableList type
 */

fun main() {
    println("Kotlin mutableList")
    println()

    //Create our list
     val snacks = mutableListOf<String>()

    //Show it
    println(snacks)

    //Add in some things....
    snacks.add("Cheetos")
    snacks.add("Cheese")
    snacks.add("Twiglets")

    //show specific items. println(snacks[3]) This would be out of bounds
    println(snacks[0])
    println(snacks[1])
    println(snacks[2])
//Change the value
    println(snacks)
    snacks[2] = "Dog biscuits"

//Remove an item
    snacks.removeAt(1)
    println(snacks)

//Add in new items in specific places
    snacks.add(1, "Bacon Scratchings")
//Sort the list
    snacks.sort()
    println(snacks)

    snacks.shuffle()
    println("shuffled :$snacks")

//Get a random item from the list
    val item = snacks.random()
    println(item)

    //loop through the list
    for (snack in snacks) {
        println(snack)
    }
    //Searching for an item
    println("Cheetos is in list: ${ snacks.contains("Cheetos")}")
    println("Horse is in list: ${ snacks.contains("Horse")}")

    //Getting index of an item
    println("Cheetos index: ${ snacks.indexOf("Cheetos")}")
    println("Horse index: ${ snacks.indexOf("Horse")}")

    //looping using an index
    for (i in 0 ..< snacks.size) {
        println("$i: ${snacks[i]}")
    }

    //loop getting index and values
    for ((i, snack) in snacks.withIndex()) {
        println("$i: $snack")
    }

    




}