package eureka.health.issue;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Body;
import javax.inject.Inject;

@Controller("/hello")
public class HelloWorldController {
    @Get(produces = MediaType.APPLICATION_JSON) 
    public String hello() {
        return "\"hello world!\"";
    }
}

