public class KsiazkaZOkladkaTwarda extends Dekorator {

    private final String okladka = "Okładka Twarda";

    public KsiazkaZOkladkaTwarda(Publikacja book) {
        super(book);
    }

    @Override
    public String toString() {
        return "| Autor: " + book.getAuthor() + " | Title: " + book.getTitle() + " | Pages: " + book.getPageNumber() + " | Okładka: " + this.okladka + " |";
    }
}
