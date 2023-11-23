package cn.ddx.myhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel.hou
 * @date 2023/11/23 09:10
 * @Desc
 */
@RestController
public class TestController {

    //test method
    @HystrixCommand(fallbackMethod = "defaultGreeting", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
    })
    @GetMapping("/test")
    public String test(Model model) throws Exception {
        Thread.sleep(3000);
        model.addAttribute("message", "Hello, Thymeleaf!");

        return "test";
    }


    //defaultGreeting method
    private String defaultGreeting(Model model) {
        model.addAttribute("message", "Hello, Thymeleaf!");

        return "Request fails. It takes long time to response";
    }
}
