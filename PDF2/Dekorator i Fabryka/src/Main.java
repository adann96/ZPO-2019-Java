public class Main {

    public static void main(String[] args)
    {
        Publikacja k1 = new Ksiazka("Adam Mickiewicz", "Pan Tadeusz", 340);
        Publikacja k2 = new Ksiazka("Henryk Sienkiewicz", "W Pustyni i w Puszczy", 1300);

        Publikacja k11 = new KsiazkaZOkladkaZwykla(k1);
        Publikacja k12 = new KsiazkaZOkladkaTwarda(k2);

        System.out.println(k12.toString());

        try
        {
            //-------brak---okładki--------//
            Publikacja kkk1 = new KsiazkaZObwoluta(k1);
            System.out.println(kkk1.toString());

            //-------jest 0kładka--------//
            Publikacja kkk2 = new KsiazkaZObwoluta(k12);
            System.out.println(kkk2.toString());

            //-------Podwójna obwoluta--------//
            Publikacja kkk3 = new KsiazkaZObwoluta(kkk2);
            System.out.println(kkk3.toString());
        }
        catch(noCoverOnTheBookSorryException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (NullPointerException ex){
        }

        Publikacja ka1 = new KsiazkaZAutografem(k1, "To jest autograf dla tej Pani o nieznanym imienu! Adaś Mickiewycz");
        System.out.println(ka1.toString());

        WydawnictwoPoematow w = new WydawnictwoPoematow("Patryk Badowski");
        Ksiazka k = w.createBook("How to be Java Developer?", 400);
        PowiescHistoryczna p = new PowiescHistoryczna(k.getAuthor(),k.getTitle(),k.getPageNumber());

        System.out.println(p.toString());
    }
}
