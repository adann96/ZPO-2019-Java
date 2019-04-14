public class Number {
    public int yourNumber;

    public Number(int yourDigit) throws GeneralErrorException
    {
        if (Math.abs(yourDigit) < 99 || Math.abs(yourDigit) > 1000)
        {
            throw new GeneralErrorException("Wrong number!");
        }
        else
        {
            this.yourNumber = yourDigit;
        }

    }

    public int getYourNumber() {
        return yourNumber;
    }
}
