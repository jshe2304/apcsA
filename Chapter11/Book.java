package Chapter11;

public class Book {
    public int pages;
    public int pictures;
    
    public Book (int pages, int pictures){
        this.pages = pages;
        this.pictures = pictures;
    }
    
    public void pageMessage () {
        System.out.println ("Number of pages: " + pages);
    }
    
    public void pictureMessage () {
        System.out.println("Number of pictures: " + pictures);
    }
}