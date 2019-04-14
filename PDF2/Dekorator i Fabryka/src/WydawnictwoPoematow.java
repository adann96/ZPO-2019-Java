public class WydawnictwoPoematow extends AbstractWydawnictwo{

    private String author;
    private String title;
    private int numberOfPages;

    public WydawnictwoPoematow(String author) {
        this.author = author;
    }

    public Ksiazka createBook(String title, int numberOfPages)
    {
        return new Ksiazka(author, title, numberOfPages);
    }


    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public int getNumberOfPages() {
        return this.numberOfPages;
    }
}
