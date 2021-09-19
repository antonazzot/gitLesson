package GitL1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Goals:
It's need some public static method, that wait entering user name.
 */
public class GitMain {
    public static void main(String[] args) {
        reader();
    }
    public static void reader () {
        BufferedReader rd = null;
        System.out.println("Enter your name!");
        rd = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = rd.readLine();
            if (str!=null) {
                System.out.println("Hello " + str + "!");
            }
            else System.out.println("Hello " + "unname!" );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
