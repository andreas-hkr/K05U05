import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Skriv ut en multiplikationstabell med X rader som ser ut så här:
        // 1
        // 2 4
        // 3 6 9

        Scanner input = new Scanner(System.in);
        System.out.print("Ange antal rader: ");
        int rows = input.nextInt();

        for (int i=1; i <= rows; i++) {
            for (int j=1; j <= i; j++) {
                System.out.print(i*j + "  ");
            }
            System.out.println();
        }
    }
}