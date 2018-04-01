import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("logs.xml");
        Log log = (Log) applicationContext.getBean("firstLog");
        log.showInfo();
//        Customer customer = (Customer) applicationContext.getBean("customerFromProperty");
//        System.out.println(customer.toString());
    }
}
