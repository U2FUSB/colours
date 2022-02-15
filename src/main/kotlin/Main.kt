//TODO INSTRUCTIONS:
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

private val colours = Colours();

fun main(args: Array<String>){

    //TODO Use String templates i.e. ${} to insert the method calls into the actual println string.
    //TODO tidy up the printing layout so that it is neat and has a nicer UI - you can choose what you would like to do
    //     here, maybe add breaks, lines, tabs, dividers, etc, whatever you think for making it nicer / easier to read.
    print("The list is: ")
    println(colours.getAll())

    print("The List has ___ elements stored")
    println(colours.numberOfColours())

    print("___ is the first colour in the list")
    println(colours.firstColour())

    print("___ is the last colour in the list")
    print(colours.lastColour())

    println("Sorted list is: ")
    print(colours.coloursInAplhabeticOrder())

    print("CAPITALISED list is:")
    print(colours.coloursInAllCapitals())

    println("Colours starting with specific letter ___ [ B was chosen ]")
    print(colours.coloursStartingWithLetter('B'))

    print("Colours with a specific number of chars ___ [ 6 was chosen]")
    println(colours.coloursWithSpecificNumberOfChars(6))

    println("___ have less than less 6 chars ")
    print (colours.coloursWithLessCharsThan(6))

    println("True or false, is blue in the list: ")
    print(colours.isColourInTheList("blue"))

    println("The list of colours, each printed on a new line is:")
    //TODO Write Code here (below this comment) to print the list in this format:
    //    Colour: Red
    //    Colour: Orange
    //    ...
    //    Colour: Silver

    //TODO for the three additional functions you wrote in Colours.kt, print the returned value here.

}