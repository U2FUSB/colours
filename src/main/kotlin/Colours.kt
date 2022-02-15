class Colours {

    private val colours:List<String> = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String>{
        //return the colours list
        return colours
    }

    fun numberOfColours (): Int{
        //return the size of the colours list
        return colours.size
    }

    fun firstColour() : String{
        //return the first colour in the list
        return colours.first()
    }

    fun lastColour() : String{
        //return the last colour list
        return colours.last()
    }

    fun coloursInAplhabeticOrder() : List<String>{
        //return the colours in alphabetical order
        //Variation in lambda exp: colours.sortedBy { it }
        return colours.sorted()
    }

    fun coloursInAllCapitals(): List<String> {
        //return the colours in ALL CAPS
        //Variation in lambda exp foreach: does not work with String Templates --> .forEach seems only to work when using it with prints or when using returns --> would only give back first element
        //"lowCase: ${colours.forEach {print("${it.lowercase()}, ")} }" +
        //        "\nupCase: ${colours.forEach{print("${it.uppercase()}, ")} }"
        return colours.map { "${it.uppercase()}, ${it.lowercase()}" }
    }

    fun coloursStartingWithLetter(letter: Char) : List<String>{
        //TODO return the colours starting with the letter passed as a parameter
        return listOf("this should return colours that start with ${letter}")
    }

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{
        //TODO return the colours that have exactly the same number of chars as the number passed as a parameter
        return listOf("this should return colours that have ${size} chars")
    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{
        //TODO return the colours that have less chars than the number passed as s parameter
        return listOf("this should return colours less than ${size} chars")
    }

    fun isColourInTheList(colour : String) : Boolean{
        //TODO return true of the colour passed as a parameter is in the list and false otherwise
        // Note: the search should be case insensitive - if blue is passed as a parameter it should find Blue, BLUE etc.
        return false
    }

    //TODO Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.

}