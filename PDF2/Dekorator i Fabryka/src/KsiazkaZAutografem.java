public class KsiazkaZAutografem extends Dekorator {

    protected String autograf;

    public KsiazkaZAutografem(Publikacja book, String autograf) {
        super(book);
        this.autograf = autograf;
    }

    @Override
    public String toString() {
        return "| Autor: " + book.getAuthor() + " | Title: " + book.getTitle() + " | Pages: " + book.getPageNumber() + " | Autograf: " + this.autograf + " |";
    }
}
