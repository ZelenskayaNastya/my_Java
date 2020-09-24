import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        Product prod1 = new Product( 0, "яблоко", 67, "зеленое");
        Product prod2 = new Product(1, "банан", 57, "желтый");
        Product prod3 = new Product( 1, "банан1", 570, "желтый");

        ProductCatalog catalog = new ProductCatalog();

        catalog.createProduct(prod1);
        catalog.createProduct(prod2);
//        catalog.createProduct(prod3);
        catalog.updateProduct(prod3);
        catalog.deleteProduct(0);

        List<Product> c = catalog.getAllProducts();
        System.out.println("Catalog: ");
        for (Product r: c)
        System.out.println(r.getName());
    }
}
