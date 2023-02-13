import model.Shop;
import model.products.Book;
import model.products.DVD;
import model.products.PadelRacket;
import model.products.RacketType;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        PadelRacket smithson = new PadelRacket("Smithson", RacketType.DIAMOND, 3.5, 49.90, shop.getItems());
        PadelRacket master = new PadelRacket("Master", RacketType.DROP , 2.8, 156.50, shop.getItems());
        PadelRacket viper = new PadelRacket("Viper", RacketType.DIAMOND, 3.7, 99.90, shop.getItems());
        PadelRacket slicer = new PadelRacket("Slicer", RacketType.ROUND, 3.2, 89.90, shop.getItems());
        PadelRacket goldenseries = new PadelRacket("Golden Series", RacketType.ROUND, 2.6, 189.90, shop.getItems());

        Book lotr = new Book("155660", "Lord of the Rings", "Fantasy", 2000, 2.0, 25.00,
                shop.getItems());
        Book lotr2 = new Book("155661", "Lord of the Rings 2", "Fantasy", 3000, 2.0, 25.00,
                shop.getItems());
        Book tiffany = new Book("231996", "Colazione da Tiffany", "Romantic", 1500, 1.0, 20.00,
                shop.getItems());

        DVD rambo = new DVD("Rambo", "War", 86.0, 0.3, 9.90, shop.getItems());
        DVD pulpfiction = new DVD("Pulp Fiction", "Pulp", 86.0, 0.3, 12.90, shop.getItems());
        DVD alien = new DVD("Alien", "Horror", 86.0, 0.3, 9.90, shop.getItems());
        DVD taxidriver = new DVD("Taxi Driver", "Thriller", 86.0, 0.3, 9.90, shop.getItems());

        System.out.println("Welcome to my store, dear customer!");
        System.out.println("Number of products: "+shop.getItemsN());
        System.out.println("Total weight of all products: "+shop.getItemsWeight(shop.getItems())+"kg");
        System.out.println("Most valuable product: "+shop.getMostValuable(shop.getItems()));
        System.out.println("There are "+shop.howManyFantasyBooks(shop.getItems())+" fantasy books available");
        System.out.println("These are our most expensive drop padel rackets: "+shop.getExpensiveDropRackets(shop.getItems()));
        System.out.println("Thanks for choosing us!");
    }
}