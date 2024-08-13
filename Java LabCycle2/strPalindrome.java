import java.io.*;
import java.util.*;

class strPalindrome {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str;
        System.out.println("Enter the Sting: ");
        str = s.nextLine();
        checkIfPalindrome(str);
    }

    private static void checkIfPalindrome(String s) {
        char str[];
        int size = s.length();
        str = new char[size];
        s.getChars(0, size, str, 0);
        char rev[] = new char[size];
        for (int i = 0, j = size - 1; i < size; i++, j--) {
            rev[i] = str[j];
        }
        String r = new String(rev);
        if (s.equals(r)) {
            System.out.println("String : " + r + " Is a Palindrome");
        } else {
            System.out.println("String : " + r + " Is not a Palindrome");
        }
    }
}