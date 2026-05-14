import java.util.*;

public class printletter {
    public static void printLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String firstname = "LOKESH";
        String lastname = "RENGUNTWAR";
        String fullname = firstname + " " + lastname;

        printLetter(fullname);

    }

}
