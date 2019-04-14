public class WydawnictwoPowiesciHistorycznych extends AbstractWydawnictwo {

    private String author;
    private String title;
    private int numberOfPages;

    public WydawnictwoPowiesciHistorycznych(String author) {
        this.author = author;
    }

    public String getInstance() {
        return this.getAuthor();
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
