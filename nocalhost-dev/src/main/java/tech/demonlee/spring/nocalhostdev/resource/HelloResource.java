package tech.demonlee.spring.nocalhostdev.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Demon.Lee
 * @date 2023-04-11 22:56
 */
@RestController
@RequestMapping("/hello")
public class HelloResource {

    @GetMapping("/greet")
    public String greet() {
        return "Hi, " + UUID.randomUUID() + "\n";
    }
}
