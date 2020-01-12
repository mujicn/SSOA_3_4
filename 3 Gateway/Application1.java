
@SpringBootApplication
@EnableConfigurationProperties(UriConfiguration.class)
@RestController
public class Application1 {

    public static void main(String[] args) {
        SpringApplication.run(Application1.class, args);
    }


    @Bean
    public RouteLocator myRoutes1 (RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/get")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("https://httpbin.org:80"))
                .build();
    }


}