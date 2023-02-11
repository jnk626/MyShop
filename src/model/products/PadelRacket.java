package model.products;

import java.util.ArrayList;

public class PadelRacket extends Product {
    private String brand;
    private String type;
    //solo tre tipi
    //rotonda, goccia, diamante
    public PadelRacket(String b, char t, double w, double p, ArrayList<Product> stock){
        super(w, p, stock);
        this.brand = b;
        this.setRacketType(t);
    }
    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    private void setRacketType(char t){
        if (t == 'r') type = "rotonda";
        if (t == 'g') type = "goccia";
        if (t == 'd') type = "diamante";
    }
}
