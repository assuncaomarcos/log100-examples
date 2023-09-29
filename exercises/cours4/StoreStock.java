package cours4;

import java.util.HashMap;
import java.util.Map;

class Product {
    private String name;
    private double unitPrice;

    public Product(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}

class StockManagement {
    private Map<Product, Integer> stock = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        if (stock.containsKey(product)) {
            int currentQuantity = stock.get(product);
            stock.put(product, currentQuantity + quantity);
        } else {
            stock.put(product, quantity);
        }
    }

    public void removeProduct(Product product, int quantity) {
        if (stock.containsKey(product)) {
            int currentQuantity = stock.get(product);
            if (currentQuantity >= quantity) {
                stock.put(product, currentQuantity - quantity);
            } else {
                System.out.println("Quantité insuffisante en stock pour " + product.getName());
            }
        } else {
            System.out.println(product.getName() + " n'est pas en stock.");
        }
    }

    public int checkStock(Product produit) {
        return stock.getOrDefault(produit, 0);
    }
}


public class StoreStock {
    public static void main(String[] args) {
        StockManagement stockMgmt = new StockManagement();

        // Ajout de produits au stock
        Product product1 = new Product("Ordinateur portable", 1399.99);
        Product product2 = new Product("Téléphone portable", 899.99);
        stockMgmt.addProduct(product1, 10);
        stockMgmt.addProduct(product2, 20);

        // Retrait de produits du stock
        stockMgmt.removeProduct(product1, 5);
        stockMgmt.removeProduct(product2, 15);

        // Vérification du stock
        System.out.println("Stock de " + product1.getName() + ": " + stockMgmt.checkStock(product1));
        System.out.println("Stock de " + product2.getName() + ": " + stockMgmt.checkStock(product2));
    }
}
