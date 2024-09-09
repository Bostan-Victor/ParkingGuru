package practica.anul.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class EchoController {

    @QueryMapping
    public String echo(@Argument String input) {
        return input;
    }
}


