package base;

import java.util.Scanner;

/*
Exercise 3 - Printing Quotes
Quotation marks are often used to denote the start and end of a string.
But sometimes we need to print out the quotation marks themselves by using escape characters.

Create a program that prompts for a quote and an author. Display the quotation and author as shown in the example output.

Example Output
What is the quote? These aren't the droids you're looking for.
Who said it? Obi-Wan Kenobi
Obi-Wan Kenobi says, "These aren't the droids you're looking for."

Constraints
Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
If your language supports string interpolation or string substitution, don’t use it for this exercise. Use string concatenation instead.

Challenge
Modify this program so that instead of prompting for quotes from the user,
you create a structure that holds quotes and their associated attributions and then display all of the quotes using the format in the example.
An array of maps would be a good choice.
 */
public class App 
{
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        App myApp = new App();

        String quote = myApp.getquote();
        String author = myApp.getauthor();
        myApp.readquote(quote, author);
    }

    public void readquote(String quote, String author)
    {
        System.out.println(author + " says, \"" + quote + "\"");
    }

    public String getauthor()
    {
        System.out.print("Who said it? ");
        String author = in.nextLine();
        return author;
    }

    public String getquote()
    {
        System.out.print("What is the quote? ");
        String quote = in.nextLine();
        return quote;
    }
}
