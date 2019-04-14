public class WydawnictwoThrillerow extends AbstractWydawnictwo {

    private String author;
    private String title;
    private int numberOfPages;

    public WydawnictwoThrillerow(String author) {
        this.author = author;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public String getAuthor() {
        return null;
    }

    @Override
    public int getNumberOfPages() {
        return 0;
    }
}
