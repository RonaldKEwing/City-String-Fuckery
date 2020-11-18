import java.util.Scanner;
/*
    @author Ronald Ewing
    CSCI 1010-9 and 1011-1
    Assignment 4

        This program takes a City name and
        shortens to one letter, Then
        uses upper case and lower case.

 */
public class CityThing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the city name?");
        String city = scanner.nextLine();

        System.out.println("This string is " + city.length() + " characters long!");
        System.out.println("Uppercase: " + city.toUpperCase());
        System.out.println("Lowercase: " + city.toLowerCase());
        System.out.println("First Char: " + city.substring(0,1));
    }
}
