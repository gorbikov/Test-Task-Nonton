

public class main {
    public static void main(String[] args) {
        // Создаёт набор продуктов для тестирования, включая дубликат,
        // продукты с одним id и разным name, продукты с разным id но одинм name.
        Product product1 = new Product("0001", "product1");
        Product product2 = new Product("0002", "product2");
        Product product3 = new Product("0003", "product3");
        Product product4 = new Product("0004", "product4");
        Product product5 = new Product("0004", "product4");
        Product product6 = new Product("0001", "product4");
        Product product7 = new Product("0002", "product1");

        // Создаёт объект класса ProductsImpl для тестирования.
        ProductsImpl productsImpl = new ProductsImpl();


        // Тестирует addProduct.
        System.out.println("----------Тестирует addProduct.----------");
        System.out.println(productsImpl.addProduct(product1));
        System.out.println(productsImpl);
        System.out.println(productsImpl.addProduct(product2));
        System.out.println(productsImpl);
        System.out.println(productsImpl.addProduct(product3));
        System.out.println(productsImpl);
        System.out.println(productsImpl.addProduct(product4));
        System.out.println(productsImpl);
        System.out.println(productsImpl.addProduct(product5));
        System.out.println(productsImpl);
        System.out.println(productsImpl.addProduct(product6));
        System.out.println(productsImpl);
        System.out.println(productsImpl.addProduct(product7));
        System.out.println(productsImpl);
        System.out.println("\n\n");

        // Тестирует deleteProduct.
        System.out.println("----------Тестирует deleteProduct.----------");
        System.out.println(productsImpl.deleteProduct(product1));
        System.out.println(productsImpl);
        System.out.println(productsImpl.deleteProduct(product2));
        System.out.println(productsImpl);
        System.out.println(productsImpl.deleteProduct(product2));
        System.out.println(productsImpl);
        System.out.println(productsImpl.deleteProduct(product3));
        System.out.println(productsImpl);
        System.out.println(productsImpl.deleteProduct(product4));
        System.out.println(productsImpl);
        System.out.println(productsImpl.deleteProduct(product4));
        System.out.println(productsImpl);
        System.out.println("\n\n");

        // Тестирует getName.
        System.out.println("----------Тестирует getName.----------");
        productsImpl.addProduct(product1);
        productsImpl.addProduct(product2);
        productsImpl.addProduct(product3);
        productsImpl.addProduct(product4);
        System.out.println(productsImpl);
        System.out.println("Name: " + productsImpl.getName("0001"));
        System.out.println("Name: " + productsImpl.getName("0002"));
        System.out.println("Name: " + productsImpl.getName("0003"));
        System.out.println("Name: " + productsImpl.getName("0004"));
        System.out.println("Name: " + productsImpl.getName("0005"));
        System.out.println("\n\n");


        // Тестирует findByName.
        System.out.println("----------Тестирует findByName.----------");
        productsImpl.deleteProduct(product4);
        productsImpl.addProduct(new Product("0004", "product3"));
        System.out.println(productsImpl);
        System.out.println(productsImpl.findByName("product1"));
        System.out.println(productsImpl.findByName("product2"));
        System.out.println(productsImpl.findByName("product3"));
        System.out.println(productsImpl.findByName("product4"));
        System.out.println("\n\n");


    }
}