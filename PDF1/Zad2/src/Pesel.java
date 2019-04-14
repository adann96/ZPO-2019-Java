public class Pesel {

    public String yourPesel;

    public Pesel(String yourPesel) throws StringtTooLongException
    {
        if (yourPesel == null || yourPesel.length() != 11) { throw new StringtTooLongException("Sorry, but Your PESEL is wrong!"); }
        else{ System.out.println("Thank You for PESEL!"); this.yourPesel = yourPesel; }
    }
}
