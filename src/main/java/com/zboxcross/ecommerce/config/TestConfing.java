package com.zboxcross.ecommerce.config;

import com.zboxcross.ecommerce.entities.Order;
import com.zboxcross.ecommerce.entities.Payment;
import com.zboxcross.ecommerce.entities.Stock;
import com.zboxcross.ecommerce.entities.User;
import com.zboxcross.ecommerce.entities.enums.OrderStatus;
import com.zboxcross.ecommerce.entities.enums.PaymentMethod;
import com.zboxcross.ecommerce.repositories.OrderRepository;
import com.zboxcross.ecommerce.repositories.StockRepository;
import com.zboxcross.ecommerce.repositories.UserRepository;
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
    private StockRepository stockRepository;

    public void run(String... args) throws Exception {

        Stock stock01 = new Stock(null, Instant.now(), 400L, 400L, 0L);
        Stock stock02 = new Stock(null, Instant.now(), 500L, 500L, 0L);
        Stock stock03 = new Stock(null, Instant.now(), 600L, 600L, 0L);

        stockRepository.saveAll(Arrays.asList(stock01,stock02,stock03));



        User u1 = new User(null, "Gui Red");
        User u2 = new User(null, "Clara Borge");
        User u3 = new User(null, "Maria Blue");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.BEGGAR, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, u1);

        userRepository.saveAll(Arrays.asList(u1,u2,u3));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));

        Payment pay1 = new Payment(null, Instant.now(), PaymentMethod.PIX, o1);
        Payment pay2 = new Payment(null, Instant.now(), PaymentMethod.CARTAO_CREDITO, o2);

        o1.setPayment(pay1);
        o2.setPayment(pay2);
        orderRepository.saveAll(Arrays.asList(o1,o2));
    }
}
