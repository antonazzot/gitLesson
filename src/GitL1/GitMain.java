package GitL1;

import java.util.Scanner;

/*
Goals:
It's need some public static method, that wait entering user name.
 */
public class GitMain {
    public static void main(String[] args) {
        System.out.println("Hello " + waitMethod() + "!");
        
    }
    public static String waitMethod () {
        Scanner sc =null;
        System.out.println("Enter your name");
        sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
