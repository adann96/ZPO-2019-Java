import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("TO JEST PROGRAM DO NUMERU PESEL");
        String sex = "", peselStr, answ;
        List<Pesel> peselList = new ArrayList<>();
        int i;

        do
        {
            i = 0;
            System.out.println("Podaj proszę PESEL: ");
            peselStr = input.nextLine();
            try
            {
                peselList.add(new Pesel(getYourPesel(peselStr)));

                //Displays the whole list
                for(Pesel var : peselList)
                {
                    if(Integer.valueOf(var.yourPesel.substring(9,10)) % 2 == 0){
                        sex = "Female";
                    }
                    else if(Integer.valueOf(var.yourPesel.substring(9,10)) % 2 == 1){
                        sex = "Male";
                    }

                    i++;
                    //---------------------------------------------------------------------------//
                    //Wiek dziewiętnasty
                    if (var.yourPesel.substring(2,3).equals("8")) { System.out.println("Index: " + i + " | " + var.yourPesel + " | " + "---- | Year: 18" + var.yourPesel.substring(0, 2) + " | Month: 0" + var.yourPesel.substring(3, 4) + " | Day: " + var.yourPesel.substring(4,6) + " | Sex: " + sex); }
                    else if (var.yourPesel.substring(2,3).equals("9")) { System.out.println("Index: " + i + " | " + var.yourPesel + " | " + "---- | Year: 18" + var.yourPesel.substring(0, 2) + " | Month: 1" + var.yourPesel.substring(3, 4) + " | Day: " + var.yourPesel.substring(4,6) + " | Sex: " + sex); }

                    //---------------------------------------------------------------------------//
                    //Wiek dwudziesty
                    else if (var.yourPesel.substring(2,3).equals("0") || var.yourPesel.substring(2,3).equals("1")) { System.out.println("Index: " + i + " | " + var.yourPesel + " | " + "---- | Year: 19" + var.yourPesel.substring(0, 2) + " | Month: " + var.yourPesel.substring(2, 4) + " | Day: " + var.yourPesel.substring(4,6) + " | Sex: " + sex); }

                    //---------------------------------------------------------------------------//
                    //Wiek dwudziestypierwszy
                    else if (var.yourPesel.substring(2,3).equals("2")) { System.out.println("Index: " + i + " | " + var.yourPesel + " | " + "---- | Year: 20" + var.yourPesel.substring(0, 2) + " | Month: 0" + var.yourPesel.substring(3, 4) + " | Day: " + var.yourPesel.substring(4,6) + " | Sex: " + sex); }
                    else if (var.yourPesel.substring(2,3).equals("3")) { System.out.println("Index: " + i + " | " + var.yourPesel + " | " + "---- | Year: 20" + var.yourPesel.substring(0, 2) + " | Month: 1" + var.yourPesel.substring(3, 4) + " | Day: " + var.yourPesel.substring(4,6) + " | Sex: " + sex); }
                }
            }
            catch(StringtTooLongException ex)
            {
                System.out.println(ex.getMessage());
            }

            System.out.println("Czy to już koniec?: ");
            answ = input.nextLine();

        } while(answ.equals("No"));


    }

    public static String getYourPesel(String psl)
    {
        return psl;
    }
}
