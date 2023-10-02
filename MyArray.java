import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class MyArray
{
    double average;
    Scanner sc = new Scanner(System.in);

    public double Average()
    {
        System.out.println("Please give a string of numeric values:");
        String words = sc.nextLine();
        ArrayList<String> myList = new ArrayList<>(Arrays.asList(words.split(" ")));
        myList.forEach(System.out::println);
        System.out.println();

        ArrayList<Integer> myIntegerList = new ArrayList<>();

        for(String element : myList)
        {
        int intValue = Integer.parseInt(element);
        myIntegerList.add(intValue);
        }

        double average = 0;
        for (double number : myIntegerList) {
            average += number;
        }
        System.out.println("Total: " + average);
        return average;
    } 
}