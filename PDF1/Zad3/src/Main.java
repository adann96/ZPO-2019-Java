import java.util.HashMap;
import java.util.Scanner;
import java.lang.String;

public class Main {

    static HashMap<String, String> map = new HashMap<>();

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number;
        map.put("-","Minus");
        map.put("0","Zero");
        map.put("1","Jeden");
        map.put("2","Dwa");
        map.put("3","Trzy");
        map.put("4","Cztery");
        map.put("5","Pięć");
        map.put("6","Sześć");
        map.put("7","Siedem");
        map.put("8","Osiem");
        map.put("9","Dziewięć");


        try
        {
            System.out.println("Podaj liczbę: ");
            number = input.nextInt();
            Number firstNumber = new Number(number);

            //-----------SPLITED---------------//
            //number.toLowerCase().replaceAll("-","");
            final String[] split = String.valueOf(firstNumber.getYourNumber()).split("");
            //---------------------------------//

            for (String digit : split){
                System.out.print(map.get(digit) + " ");
            }

        }
        catch(GeneralErrorException ex){
            System.out.println(ex.getMessage());
        }
        input.close();
    }
}
