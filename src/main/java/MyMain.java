import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int x = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (c == 'a' || c == 'b' || c == 'c') {
                x += 1;
            }
        }
        return x;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        return str.toLowerCase().contains("the");
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        StringBuilder reverse = new StringBuilder();
        String clean = str.toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);

    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what u want 2 do");
        String command=scan.nextLine();
        if (command.equals("countABC")){
            System.out.print("gimme the str big boy");
            String str = scan.nextLine();
            System.out.println(countABC(str));
        }
        if (command.equals("countainsThe")){
            System.out.print("gimme the str big boy");
            String str = scan.nextLine();
            System.out.println(containsThe(str));
        }
        if (command.equals("isPalindrome")){
            System.out.print("gimme the str big boy");
            String str = scan.nextLine();
            System.out.println(isPalindrome(str));
        }


    }
}
