
/* задание необходимо выполнить на любом C-подобном языке
 в задаче нельзя использовать базы данных или любые другие бибилиотеки
 В целом вы не ограничены в реализации, только использовать стандартные структуры данных sdk

 необходимо реализовать все 4 функции в классе ProductsImpl
 реализацию писать в теле самих функций
 вы в праве добавлять необходимые вам структуры данных в класс*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*класс для реализации 4 функций*/
public class ProductsImpl {
    // Создаёт хешмап для хранения пар id - Product.
    private HashMap<String, Product> products;

    // Создаёт конуструктор.
    public ProductsImpl() {
        this.products = new HashMap<>();
    }


    boolean addProduct(Product product) {
        /*добавляет новый продукт
         возвращает true - если продукта с таким id еще не было
         возвращает false - если был такой id, вставка отменяется*/

        if (!products.containsKey(product.getId())) {
            products.put(product.getId(), product);
            return true;
        } else return false;

    }


    boolean deleteProduct(Product product) {
        /*Удаляет продукт
         возвращает true - если продукт с таким id был
         возвращает false - если id не было, (удаления не происходит)*/


        if (products.containsKey(product.getId())) {
            products.remove(product.getId());
            return true;
        } else return false;

    }


    String getName(String id) {
        /*Получает имя (name) продукта
         возращает name продукта у которого идентификатор равен (=) id
         если продукта нет, вернуть пустую строку ""*/


        if (products.containsKey(id)) {
            return products.get(id).getName();
        } else return "";


    }


    List findByName(String name) {
        /*возвращает массив (список) идентификаторов (id)
         У котрых наименование равно (=) name
         Если таких нет, возвращается пустой массив (список)*/


        List<String> ids = new ArrayList<>();
        for (String id : products.keySet()) {
            if (products.get(id).getName().equals(name)) {
                ids.add(id);
            }
        }
        return ids;


    }

    // Добавляет для удобства тестирования toString, чтобы можно было посмотреть список products.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProductsImpl: ");
        for (String id : products.keySet()) {
            sb.append(id + "/" + products.get(id).getName() + "; ");
        }

        return sb.toString();
    }
/* данный пример показан на языке dart
 Если вы будуте реализовывать на других языка - вы в праве поменять типы на аналогичные в вашей sdk
 Но только на аналогичные»*/
}
