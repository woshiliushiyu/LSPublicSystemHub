package com.sunntry.lspublicsystemhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LsPublicSystemHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(LsPublicSystemHubApplication.class, args);
    }

}
