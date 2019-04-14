public abstract class Dekorator implements Publikacja {
    protected Publikacja book;

    public Dekorator(){};

    public Dekorator(Publikacja book) {
        this.book = book;
    }

    @Override
    public String getAuthor() {
        return book.getAuthor();
    }

    @Override
    public String getTitle() {
        return book.getTitle();
    }

    @Override
    public int getPageNumber() {
        return book.getPageNumber();
    }
}
