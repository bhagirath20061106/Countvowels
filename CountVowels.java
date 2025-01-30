package bhagirath;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        String S = sc.nextLine();
        
        int vc = 0;
        for (char c : S.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vc++;
            }
        }
        System.out.println("Number of Vowels: " +vc);
    }
}
