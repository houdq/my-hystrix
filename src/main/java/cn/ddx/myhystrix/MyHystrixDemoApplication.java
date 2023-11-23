package cn.ddx.myhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class MyHystrixDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyHystrixDemoApplication.class, args);
    }

}
