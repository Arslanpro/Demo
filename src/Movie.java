public class Movie extends ShopItem {
    private String director;
    private int year;
    public Movie(String director, String title, int year, double price) {
        this.director = director;
        setTitle(title);
        this.year = year;
        setPrice(price);
    }
    public String getDirector() {
        return director;
    }
    public int getYear() {
        return year;
    }
    @Override
    public String toString () {
        return "Movie: " + getTitle() + " by " + director + " from " + year;
    }
}
