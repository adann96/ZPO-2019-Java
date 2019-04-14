public class PowiescHistoryczna extends Ksiazka {

    public PowiescHistoryczna(String author, String title, int pageNumber)
    {
        super(author, title, pageNumber);
    }


    @Override
    public String toString() {
        return "| Autor: " + this.getAuthor() + " | Title: " + this.getTitle() + " | Pages: " + this.getPageNumber();
    }
}

