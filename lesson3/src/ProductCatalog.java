import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    ArrayList<Product> p = new ArrayList<>();

    public List<Product> getAllProducts() {
        return p;
    }

    public void createProduct(Product product) throws ProductAlreadyExists {
        for (Product r: p) {
            if (r.getName().equals(product.getName())) {
                throw new ProductAlreadyExists("В справочнике уже есть продукт с таким же именем: " + r.getName());
            }
        }
        p.add(product);
    }

    public void updateProduct(Product product) throws Exception {
        Product c = null;
        for (Product r: p){
            if (r.getId() == product.getId()) {
                c = r;
            }
        }
        if (c == null)
        throw new ProductNotFound("Нет продукта с таким же идентификатором: " + product.getId());


        if (product.getName().equals("")) {
            throw new ProductNotValid( "Новый продукт не имеет имени!");
        }
//        long i = c.getId();
        p.remove(c);
        p.add(product);

    }

    public void deleteProduct(long id) {
        p.remove(p.get((int)id));
    }

}
