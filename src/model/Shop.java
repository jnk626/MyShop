package model;

import model.products.Book;
import model.products.DVD;
import model.products.PadelRacket;
import model.products.Product;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> items = new ArrayList<>();

    public void addProduct(Product product){
        items.add(product);
    }

    public ArrayList<Product> getItems(){
        return items;
    }

    public int getItemsN(){
        return items.size();
    }

    public double getItemsWeight(ArrayList<Product> stock){
        double totWeight = 0;
        for (Product product : stock){
            totWeight += product.getWeight();
        }
        return totWeight;
    }

    public Product getMostValuable(ArrayList<Product> stock){
        Product mvp = null;
        double maxPrice = 0;
        for (Product selected : stock) {
            if (selected.getPrice() > maxPrice) {
                maxPrice = selected.getPrice();
                mvp = selected;
            }
        }
        return mvp;
    }

    public int howManyFantasyBooks(ArrayList<Product> stock){
        int fantasyN = 0;
        for (Product selected : stock){
            if(selected instanceof Book && ((Book) selected).getCategory().equals("Fantasy")){
                    fantasyN += 1;
                }
            }
        return fantasyN;
    }

    public ArrayList<PadelRacket> getExpensiveRackets(ArrayList<Product> stock) {
        ArrayList<PadelRacket> expensiveRacketList = new ArrayList<>();
        for (Product selected : stock) {
            if (selected instanceof PadelRacket && selected.getPrice() > 100 && (((PadelRacket) selected).getType().equals("goccia"))){
                    expensiveRacketList.add((PadelRacket) selected);
                }
            }
        return expensiveRacketList;
    }
}