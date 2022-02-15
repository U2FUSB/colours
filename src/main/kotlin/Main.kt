//INSTRUCTIONS:
//  1. Now that you have the code in IntelliJ on your computer, use VCS to "Share this project to your GitHub repo
//     that is attached to your student email.  MAKE SURE YOU HAVE THIS REPO SET TO PRIVATE.
//  2. Run the app and familiarise yourself with the output and where each part of the output came from in the code.
//  3. There are multiple TO DO comments in the two classes.  Follow this workflow when addressing EACH one:
//       a. Locate a single TO DO item that you want to work on
//       b. Add the required code to address it.
//       c. Commit the change to your local repository, making sure your commit message explains (briefly) what you did.
//       d. Push the change to your remote repository
//  4. REMEMBER TO USE THIS GITHUB WORKFLOW FOR EACH CHANGE - failure to use GitHub in this way will result in
//     a lower grade for the assignment as it is a software development tooling module.
//  5. NOTE that you should not change the function names, parameters or return types when working on the fixes - to
//     do so will also result in a reduced mark.

private val colours = Colours()

fun main(){

    //Use String templates i.e. ${} to insert the method calls into the actual println string.
    //TODO tidy up the printing layout so that it is neat and has a nicer UI - you can choose what you would like to do
    //     here, maybe add breaks, lines, tabs, dividers, etc, whatever you think for making it nicer / easier to read.
    println("The list is: ${colours.getAll()}")

    println("The List has ${colours.numberOfColours()} elements stored")

    println("${colours.firstColour()} is the first colour in the list")

    println("${colours.lastColour()} is the last colour in the list")

    println("Sorted list is: ${colours.coloursInAplhabeticOrder()}")

    println("CAPITALISED list is: ${colours.coloursInAllCapitals()}")

    println("Colours starting with specific letter ${colours.coloursStartingWithLetter('B')} [ B was chosen ]")

    println("Colours with a specific number of chars ${colours.coloursWithSpecificNumberOfChars(6)} [ 6 was chosen]")

    println("${colours.coloursWithLessCharsThan(6)} have less than less 6 chars ")

    println("True or false, is blue in the list: ${colours.isColourInTheList("blue")}")

    println("The list of colours, each printed on a new line is:")
    colours.getAll().forEach{ println("Colour: $it")}

    //for the three additional functions you wrote in Colours.kt, print the returned value here.
    println("The Colours: ${colours.colourContainsLetter('l')} all contain the letter 'l' ")
    println("The First half of the colours are: ${colours.firstHalf()}")
    println("The Second half of the colours are: ${colours.secondHalf()}")
}