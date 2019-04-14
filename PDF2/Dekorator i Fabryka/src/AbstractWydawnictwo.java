public abstract class AbstractWydawnictwo {

    public abstract String getTitle();
    public abstract String getAuthor();
    public abstract int getNumberOfPages();

    @Override
    public String toString() {
        return this.getAuthor() + " " + this.getTitle() + " " + this.getNumberOfPages();
    }
}
