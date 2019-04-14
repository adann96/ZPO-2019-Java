public class Ksiazka implements Publikacja {
    private String author, title;
    private int pageNumber;

    public Ksiazka(String author, String title, int pageNumber) {
        this.author = author;
        this.title = title;
        this.pageNumber = pageNumber;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public int getPageNumber() {
        return this.pageNumber;
    }
}
