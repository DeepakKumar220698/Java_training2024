import java.util.Scanner;

public class String_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");

        String name = sc.nextLine();
        System.out.println("Username " + name);

    }
}
