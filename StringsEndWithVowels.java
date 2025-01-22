public class StringsEndWithVowels //class is declared as strings ending with vowels
{
    public static void main(String[] args)
    {
        String[] strings = {"Rolls-Royce","Proche","G-Wagen","Tesla","BMW"}; //array of strings is declared 
        System.out.println("Strings ending with vowel : ");
        for(String str : strings) //this for loop iterates the string of arrays 
        {
            if(endsWithVowel(str)) //condition is given as if the strings endswithvowel then that string is printed
            {
                System.out.println(str);
            }
        }
    }
    public static boolean endsWithVowel(String str) // this is another method that takes the single string as an input
    {
        //str = str.toLowercase();
        char lastChar = str.charAt(str.length()-1);// str.lenght()-1 calculates the index of the last character in the string
        return lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u'; 
        //this is the return statement if any of the vowel is present at ending of the string then that string is returned.
    }
}