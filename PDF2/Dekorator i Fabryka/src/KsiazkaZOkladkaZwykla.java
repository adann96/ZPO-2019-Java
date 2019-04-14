public class KsiazkaZOkladkaZwykla extends Dekorator {

    private final String okladka = "Okładka Zwykła";

    public KsiazkaZOkladkaZwykla(Publikacja book) {
        super(book);
    }

    @Override
    public String toString() {
        return "| Autor: " + book.getAuthor() + " | Title: " + book.getTitle() + " | Pages: " + book.getPageNumber() + " | Okładka: " + this.okladka + " |";
    }
}
