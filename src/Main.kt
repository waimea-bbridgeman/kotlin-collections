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


//    const val EXIT = 'x'
//    val ADD = 'a'
//
//    fun main() {
//        println("Accounting System 5000")
//        println()
//
//        val accounts = mutableListOf<Double>()
//
//        //Test values
//        accounts.add(3.14)
//        accounts.add(2.81)
//        accounts.add(7.905)
//        accounts.add(12.97)
//        accounts.add(195.016)
//
//        showAccounts(accounts)
//
//        while (true) {
//            val action = getUserAction()
//
//            when (action) {
//
//                EXIT -> break
//
//                //User wants to add new value
//                ADD -> {}
//            }
//        }
//    }
//
//    fun showAccounts(accounts: List<Double>) {
//        var sum = 0.0
//        //Show the values in the list
//        for (value in accounts) {
//            println("%8.2f".format(value))
//            sum += value
//        }
//    }
//
//    fun getUserAction(): Char  { //Char returns a single letter or single value
//        //Show a menu of options and get users choice and you will return the choice
//        return EXIT
//
//    }
//
//    fun average(average: Array<String>) {
//        val numArray = doubleArrayOf(45.3, 67.5, -45.6, 20.34, 33.0, 45.6)
//        var sum = 0.0
//
//        for (num in numArray) {
//            sum += num
//        }
//
//        val average = sum / numArray.size
//        println("The average is: %.2f".format(average))
//    }





}