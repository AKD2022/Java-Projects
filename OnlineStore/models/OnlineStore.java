package Models;

public class OnlineStore {
    ArrayList<OnlineStore> OnlineProducts;

    public OnlineStore() {
        this.OnlineProducts = new ArrayList<OnlineProducts>();
    }    

    public OnlineProducts getOnlineProducts(int index) {
        return new OnlineProducts(this.OnlineProducts.get(index));
    }

    public OnlineProducts getOnlineProducts(String product) {
        for (int i = 0; i < this.OnlineProducts.size(); i++) {
            if (this.OnlineProducts.get(i).getPrice().equals(product)) {
                return new OnlineProducts(this.OnlineProducts.get(i));
            }
        }
        return null;
    }

    
}
