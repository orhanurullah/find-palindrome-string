import java.util.Scanner;

public class Main {

    public static String reverse(String word){
       String reverseWord = "";
       for(int i = word.length()-1; i >= 0; i--){
           reverseWord += word.charAt(i);
       }
       return reverseWord;
    }
    public static boolean isPalindrome(String word){
        return word.equalsIgnoreCase(reverse(word));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome Kontrolü Yapan Program");
        System.out.print("Kelimeyi Girin : ");
        String word = scanner.next();
        if(isPalindrome(word)){
            System.out.println("Girilen Kelime : " + word);
            System.out.println("Kelimenin Tersi : " + reverse(word));
            System.out.println("Girilen Kelime Palindrome Kelimedir.");
        }else{
            System.out.println("Girilen Kelime : " + word);
            System.out.println("Kelimenin Tersi : " + reverse(word));
            System.out.println("Girilin Kelime Palindrome Değildir.");
        }
    }
}
