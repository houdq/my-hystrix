//package cn.ddx.myhystrix.service;
//
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
///**
// * @author daniel.hou
// * @date 2023/11/22 16:07
// * @Desc
// */
//@Service
//public class GreetingService {
//    @HystrixCommand(fallbackMethod = "defaultGreeting")
//    public String getGreeting(String username) {
//        return new RestTemplate()
//                .getForObject("http://localhost:9090/greeting/{username}",
//                        String.class, username);
//    }
//
//    private String defaultGreeting(String username) {
//        return "Hello User!";
//    }
//}