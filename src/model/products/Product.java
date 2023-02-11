package model.products;

import java.util.ArrayList;

public abstract class Product {
    protected double weight;
    protected double price;

    public Product(double w, double p, ArrayList<Product> stock){
        this.weight = w;
        this.price = p;
        stock.add(this);
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
}
