

@SpringBootApplication
@EnableConfigurationProperties(UriConfiguration.class)
@RestController
public class Application1 {

    public static void main(String[] args) {
        SpringApplication.run(Application1.class, args);
    }


    @Bean
    public RouteLocator myRoutes2(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/get")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("http://httpbin.org:80"))
                .route(p -> p
                        .host("*.hystrix.com")
                        .filters(f -> f.hystrix(config -> config.setName("mycmd")))
                        .uri("http://httpbin.org:80")).
                        build();
    }


}