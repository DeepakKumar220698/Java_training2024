import java.util.Scanner;

public class Char_input {
    public static void main(String[] args) {
        char a;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a character");
        a = Sc.next().charAt('a');
        System.out.println("Enter a character " + a);


    }
}
