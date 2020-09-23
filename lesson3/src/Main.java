import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        Product prod = new Product( 0, "яблоко", 67, "зеленое");
        Product prdod = new Product(1, "ggh", 57, "красное");
        Product prdodi = new Product( 1, "ggh", 570, "красное");

        ProductCatalog catalog = new ProductCatalog();

        catalog.createProduct(prod);
        catalog.createProduct(prdod);
        catalog.updateProduct(prdodi);
        catalog.deleteProduct(1);

        List<Product> c = catalog.getAllProducts();
        for (Product r: c)
        System.out.println(r.getName());
    }
}
