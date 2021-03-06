package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Date;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

	@CrossOrigin(origins = "http://localhost:8081")
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

	@CrossOrigin(origins = "http://localhost:8081")
    @RequestMapping(value="/pdata", method = RequestMethod.POST, produces = "application/json")
    // public String testMethod(@PathVariable String projectName, @PathVariable String managerName, @PathVariable Date startDate, @PathVariable Date endDate) {
    public Project testMethod(@RequestBody Project project) {
        return project;
    }
}
