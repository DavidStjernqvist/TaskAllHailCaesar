import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String alphabet = "abc";
        int amountOfShifts = shiftLetter();


        System.out.println("Previous alphabet: " + alphabet);
        System.out.println("Enrypted alphabet: " + encrypt(alphabet, amountOfShifts));
        System.out.println("Decrypted alphabet: " + decrypt(alphabet, amountOfShifts));
    }

    public static int shiftLetter() {

        System.out.print("Amount of shifts: ");
        Scanner scanner = new Scanner(System.in);
        int amountOfShifts = scanner.nextInt();
        return amountOfShifts;
    }

    public static StringBuffer encrypt(String alphabet, int amountOfShifts) {

        StringBuffer res = new StringBuffer();

        for (int i = 0; i < alphabet.length(); i++) {
            char ch = (char) (((int) alphabet.charAt(i) + amountOfShifts - 97) % 26 + 97);
            res.append(ch);
        }
        return res;
    }

    public static StringBuffer decrypt(String alphabet, int amountOfShifts) {

        StringBuffer res = new StringBuffer();

        for (int i = 0; i < alphabet.length(); i++) {
            char ch = (char) (((int) alphabet.charAt(i) + amountOfShifts + 97) % -26 + 97);
            res.append(ch);
        }
        return res;
    }

}