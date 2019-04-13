package com.szxw.springcloudeurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaProviderApplication.class, args);
    }

}
