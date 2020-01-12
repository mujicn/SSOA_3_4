

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
public class CircuitBreakerBookstoreApplication {

  @RequestMapping(value = "/recommended")
  public String readingList(){
    return "Bierbrauen leicht gemacht. Verlag Stiegl, 2019";
  }

  public static void main(String[] args) {
    SpringApplication.run(CircuitBreakerBookstoreApplication.class, args);
  }
}