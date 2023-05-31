

public class main {
    public static void main(String[] args) {
        // Создаём набор продуктов для тестирования, включая дубликат,
        // продукты с одним id и разным name, продукты с разным id но одинм name.
        Product product1 = new Product("0001", "product1");
        Product product2 = new Product("0002", "product2");
        Product product3 = new Product("0003", "product3");
        Product product4 = new Product("0004", "product4");
        Product product5 = new Product("0004", "product4");
        Product product6 = new Product("0001", "product4");
        Product product7 = new Product("0002", "product1");

        // Создаём объект класса ProductsImpl для тестирования.
        ProductsImpl productsImpl = new ProductsImpl();

    }
}