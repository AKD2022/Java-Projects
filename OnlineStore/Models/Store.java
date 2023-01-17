package Models;

import java.util.ArrayList;

public class Store {
    ArrayList<Products> Products;

    public Store() {
        this.Products = new ArrayList<Products>();
    }    

    public Products getProducts(int index) {
        return new Products(this.Products.get(index));
    }

    public Products getProducts(String model) {
        for (int i = 0; i < this.Products.size(); i++) {
            if (this.Products.get(i).getProduct().equals(model)) {
                return new Products(this.Products.get(i));
            }
        }
        return null;
    }

    
}
