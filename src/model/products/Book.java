package model.products;

import java.util.ArrayList;

public class Book extends Product{
    private String ISBN;
    private String title;
    private String category;
    private int numPages;
    public Book(){

    }
    public Book(String isbn, String t, String c, int pn, double w, double p, ArrayList<Product> stock){
        super(w, p, stock);
        this.ISBN = isbn;
        this.title = t;
        this.category = c;
        this.numPages = pn;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getPageNumber() { return numPages; }
}
