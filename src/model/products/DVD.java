package model.products;

import java.util.ArrayList;

public class DVD extends Product{
    private String title;
    private String category;
    private double duration;

    public DVD(){

    }
    public DVD(String t, String c, double d, double w, double p, ArrayList<Product> stock){
        super(w, p, stock);
        this.duration = d;
        this.title = t;
        this.category = c;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }
}
