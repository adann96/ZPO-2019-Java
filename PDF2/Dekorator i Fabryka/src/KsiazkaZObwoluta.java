public class KsiazkaZObwoluta extends Dekorator {

    protected String obwoluta = "Z Obwolutą";


    public KsiazkaZObwoluta(Publikacja book) throws noCoverOnTheBookSorryException {

        if (book instanceof KsiazkaZObwoluta) { System.out.println("Podwójna obwoluta"); }

        else if (book instanceof KsiazkaZOkladkaZwykla || book instanceof KsiazkaZOkladkaTwarda) {
            this.book = book;
        }

        else { System.out.println("Książka nie ma okładki!"); }
    }

    @Override
    public String toString() {
        return "| Autor: " + book.getAuthor() + " | Title: " + book.getTitle() + " | Pages: " + book.getPageNumber() + " | Okładka: " + this.obwoluta + " |";
    }
}
