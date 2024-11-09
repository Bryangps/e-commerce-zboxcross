package com.zboxcross.ecommerce.config;

import com.zboxcross.ecommerce.entities.*;
import com.zboxcross.ecommerce.entities.enums.OrderStatus;
import com.zboxcross.ecommerce.entities.enums.PaymentMethod;
import com.zboxcross.ecommerce.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile(value = "test")
public class TestConfing implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    public void run(String... args) throws Exception {

        /* ----Created Category and Product----*/
        Category cate01 = new Category(null,"Alcoolico");
        Category cate02 = new Category(null,"Nao Alcoolico");

        Product prod01 = new Product(null, "Stempel", 14.0, cate01);
        Product prod02 = new Product(null, "Coca", 5.0, cate02);
        Product prod03 = new Product(null, "Sprit", 4.0, cate02);

        categoryRepository.saveAll(Arrays.asList(cate01,cate02));
        productRepository.saveAll(Arrays.asList(prod01,prod02,prod03));

        /* ----Created Stock ----*/
        Stock stock01 = new Stock(null, Instant.now(), 400L, 400L, 0L, prod01);
        Stock stock02 = new Stock(null, Instant.now(), 500L, 500L, 0L, prod02);
        Stock stock03 = new Stock(null, Instant.now(), 600L, 600L, 0L, prod03);

        prod01.setStock(stock01);
        prod02.setStock(stock02);
        prod03.setStock(stock03);
        productRepository.saveAll(Arrays.asList(prod01,prod02,prod03));

        /* ----Created User and Order---- */

        User u1 = new User(null, "Gui Red");
        User u2 = new User(null, "Clara Borge");
        User u3 = new User(null, "Maria Blue");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.BEGGAR, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, u1);

        userRepository.saveAll(Arrays.asList(u1,u2,u3));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));

        OrderItem oi1 = new OrderItem(o1, prod01,50, prod01.getPrice());
        OrderItem oi2 = new OrderItem(o2, prod03,50, prod03.getPrice());
        OrderItem oi3 = new OrderItem(o1, prod02,50, prod02.getPrice());

        orderItemRepository.saveAll(Arrays.asList(oi1,oi2,oi3));

        /* ----Created Payment ---- */
        Payment pay1 = new Payment(null, Instant.now(), PaymentMethod.PIX, o1);
        Payment pay2 = new Payment(null, Instant.now(), PaymentMethod.CARTAO_CREDITO, o2);

        o1.setPayment(pay1);
        o2.setPayment(pay2);
        orderRepository.saveAll(Arrays.asList(o1,o2));
    }
}
