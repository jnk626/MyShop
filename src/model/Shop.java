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

    public String getMostValuable(ArrayList<Product> stock){
        Product mvp = null;
        double maxPrice = 0;
        for (Product selected : stock) {
            if (selected.getPrice() > maxPrice) {
                maxPrice = selected.getPrice();
                mvp = selected;
            }
        }
        String mvpClass = String.valueOf(mvp.getClass());
        if (mvpClass.equals("class model.products.Book")) {
            Book mvBook = (Book) mvp;
            return mvBook.getTitle()+" "+mvBook.getPrice();
        } else if (mvpClass.equals("class model.products.DVD")) {
            DVD mvDVD = (DVD) mvp;
            return mvDVD.getTitle()+" "+mvDVD.getPrice();
        }
        PadelRacket mvRacket = (PadelRacket) mvp;
        return mvRacket.getBrand()+" "+mvRacket.getPrice();
    }

    public int howManyFantasyBooks(ArrayList<Product> stock){
        int fantasyN = 0;
        for (Product selected : stock){
            String selectedClass = String.valueOf(selected.getClass());
            if (selectedClass.equals("class model.products.Book")) {
                Book fantasyBook = (Book) selected;
                if (fantasyBook.getCategory().equals("Fantasy")) {
                    fantasyN += 1;
                }
            }
        }
        return fantasyN;
    }

    public ArrayList<PadelRacket> getExpensiveRackets(ArrayList<Product> stock) {
        ArrayList<PadelRacket> expensiveRacketList = new ArrayList<>();
        for (Product selected : stock) {
            String selectedClass = String.valueOf(selected.getClass());
            if (selectedClass.equals("class model.products.PadelRacket")) {
                PadelRacket expensiveRacket = (PadelRacket) selected;
                if (expensiveRacket.getPrice() > 100 && expensiveRacket.getType().equals("goccia")) {
                    expensiveRacketList.add(expensiveRacket);
                }
            }

        }
        return expensiveRacketList;
    }
}