import java.util.Scanner;
class PalindromeString {
 void m1(String word) {
 String reverse = "";
 for (int i = word.length() - 1; i >= 0; i--) {
 reverse = reverse + word.charAt(i);
 }
 if (word.equals(reverse))
 System.out.println("Palindrome String");
 else
 System.out.println("Not Palindrome String");
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter word: ");
 String word = sc.next();
 PalindromeString p = new PalindromeString();
 p.m1(word);
 }
}