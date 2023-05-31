/* структура Product, id - уникальный номер продукта, name - наименование*/
public class Product {
    /*late String id;
    late String name;*/
    private String id;
    private String name;


    // Создаём пару конструкторов, геттеры и сеттеры.
    public Product() {
    }

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


}
