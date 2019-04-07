import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String answer;
        int liczba = 0b1101_1000;

        String hex,dec, troj;
        System.out.println("TO JEST PROGRAM DO KONWERSJI LICZB");
        do {
            System.out.print("Podaj podstawę: ");
            answer = input.next();
            switch (answer) {
                case "Dziesięć":
                    dec = Integer.toString(liczba,10);
                    System.out.print("Liczba decymalna: " + dec);
                    break;
                case "Szesnaście":
                    hex = Integer.toString(liczba, 16);
                    System.out.print("Liczba hexadecymalna: " + hex);
                    break;
                case "Trzy":
                    troj = Integer.toString(liczba, 3);
                    System.out.print("Liczba trójkowa: " + troj);
                    break;
                default:
                    System.out.println("Wybrałeś złą liczbę!");
            }
        } while(!answer.equals("Dziesięć") && !answer.equals("Szesnaście") && !answer.equals("Trzy"));
        input.close();
    }
}
