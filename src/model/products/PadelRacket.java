package model.products;

import java.util.ArrayList;

public class PadelRacket extends Product {
    private String brand;
    private RacketType type;

    public PadelRacket(){

    }
    public PadelRacket(String b, RacketType t, double w, double p, ArrayList<Product> stock){
        super(w, p, stock);
        this.brand = b;
        this.type = t;
    }
    public String getBrand() {
        return brand;
    }

    public RacketType getType() {
        return type;
    }
}
