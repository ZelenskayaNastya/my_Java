import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    ArrayList<Product> p = new ArrayList<>();

    public List<Product> getAllProducts() {
        return p;
    }

    public void createProduct(Product product) throws ProductAlreadyExists {
        for (Product r: p) {
            if (r.getName() == product.getName()) {
                throw new ProductAlreadyExists("ProductAlreadyExists");
            }
        }
        p.add(product);
    }

    public void updateProduct(Product product) throws Exception {
        Product c=null;
        for (Product r: p){
            if (r.getId() == product.getId()) {
                c = r;
            }
        }
        if (c==null)
        throw new ProductNotFound("ProductNotFound");


        if (c.getName() == null) {
            throw new ProductNotValid("ProductNotValid");
        }
        long i=c.getId();
        p.remove(c);
        p.add(product);

    }

    public void deleteProduct(long id) {
        p.remove(p.get((int)id));
    }

}
