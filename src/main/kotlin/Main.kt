private val colours = Colours()

fun main(){
    println("""
        |The list is: ${colours.getAll()}
        |--------------------------------------------------------------
        |The List has ${colours.numberOfColours()} elements stored
        |--------------------------------------------------------------
        |${colours.firstColour()} is the first colour in the list
        |--------------------------------------------------------------
        |${colours.lastColour()} is the last colour in the list
        |--------------------------------------------------------------
        |Sorted list is: ${colours.coloursInAplhabeticOrder()}
        |--------------------------------------------------------------
        |CAPITALISED list is: ${colours.coloursInAllCapitals()}
        |--------------------------------------------------------------
        |Colours starting with specific letter ${colours.coloursStartingWithLetter('B')} [ B was chosen ]
        |--------------------------------------------------------------
        |Colours with a specific number of chars ${colours.coloursWithSpecificNumberOfChars(6)} [ 6 was chosen]
        |--------------------------------------------------------------
        |${colours.coloursWithLessCharsThan(6)} have less than less 6 chars
        |--------------------------------------------------------------
        |True or false, is blue in the list: ${colours.isColourInTheList("blue")}
        |--------------------------------------------------------------
        |The list of colours, each printed on a new line is:
    """.trimMargin())

    colours.getAll().forEach{ println("Colour: $it")}

    // The three additional Print-Statements
    println("\nThe Colours: ${colours.colourContainsLetter('l')} all contain the letter 'l' ")
    println("The First half of the colours are: ${colours.firstHalf()}")
    println("The Second half of the colours are: ${colours.secondHalf()}")
}