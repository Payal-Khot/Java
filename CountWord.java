import java.util.Scanner;
 public class CountWord{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String input = sc.nextLine();
        input = input.trim();

        if(input.isEmpty())
        {
            System.out.println("String has no words: ");
        }
        else
        {
            String[] words = input.split("\\s+");
            int countword = words.length;
            System.out.println("The number of words in the string :");
        }
        sc.close();
    }
 }