class Colours {

    private val colours:List<String> = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String>{
        return colours
    }

    fun numberOfColours (): Int{
        return colours.size
    }

    fun firstColour() : String{
        return colours.first()
    }

    fun lastColour() : String{
        return colours.last()
    }

    fun coloursInAplhabeticOrder() : List<String>{
        //Variation in lambda exp: colours.sortedBy { it }
        return colours.sorted()
    }

    fun coloursInAllCapitals(): List<String> {
        return colours.map { "${it.uppercase()}, ${it.lowercase()}" }
    }

    fun coloursStartingWithLetter(letter: Char) : List<String>{
        return colours.filter { it.first() == letter }
    }

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{
        return colours.filter { it.count() == size }
    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{
        return colours.filter { it.count() < size }
    }

    fun isColourInTheList(colour : String) : Boolean{
        return colours  .map { it.uppercase() }
                        .contains(colour.uppercase())
    }

    fun colourContainsLetter(letter: Char) : List<String>{
        return colours  .filter {letter in it }
    }
    fun firstHalf() : List<String>{
        return colours.filterIndexed { index, _ -> index <= colours.size/2 }
    }
    fun secondHalf() : List<String>{
        return colours.filterIndexed { index, _ -> index > colours.size/2 }
    }

}