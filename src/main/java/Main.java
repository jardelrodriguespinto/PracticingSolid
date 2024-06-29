import org.example.solid.singleresponsability.order.InvoiceGenerator;
import org.example.solid.singleresponsability.order.Order;
import org.example.solid.singleresponsability.order.Product;
import org.example.solid.singleresponsability.order.ProductBuilder;
import practicingstreams.StreamsTeste;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Product pizza =  new ProductBuilder().setName("Pizza")
                                                .setPrice(new BigDecimal(85))
                                                .setAmount(3L).build();

        Product soda =  new ProductBuilder().setName("Soda")
                                             .setPrice(new BigDecimal(10))
                                             .setAmount(2L).build();

        Order order = new Order();

        System.out.println(order.showAllProducts());

        order.addProduct(pizza);

        System.out.println(order.calculateValueOrder());

        order.addProduct(soda);

        System.out.println(order.showAllProducts());

        System.out.println(order.calculateValueOrder());

        System.out.println(InvoiceGenerator.generateInvoice(order));

        String[] arr = {"bella","label","roller"};
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<Integer> unorderNumbers = Arrays.asList(1, 5, 3, 2, 4);
        List<Integer> duplicateNumbers = Arrays.asList(1,1,2,2,3,2,5,4);
        List<Integer> nums = Arrays.asList(-1,1,-2,2,-3,2,5,4);

        System.out.println(StreamsTeste.convertListToMap(words));
        System.out.println(StreamsTeste.hasNumberGraterThanTen(numbers));
        System.out.println(StreamsTeste.calculateAverage(numbers));


    }
}