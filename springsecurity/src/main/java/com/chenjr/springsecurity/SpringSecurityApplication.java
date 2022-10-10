package com.chenjr.springsecurity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description:
 * <p>
 * ClassName: SpringSecurityApplication
 * date: 2022/10/9 16:22
 *
 * @author chenjr
 */
@SpringBootApplication
@MapperScan("com.chenjr.springsecurity.mapper")
public class SpringSecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class,args);
    }

}
