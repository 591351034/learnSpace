package com.chenjr.springsecurity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description:
 * <p>
 * ClassName: SpringSecurityTestApplication
 * date: 2022/10/9 16:43
 *
 * @author chenjr
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringSecurityTestApplication {

    @Test
    public void testPasswordEncoder(){
        // 创建密码解析器
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        // 对密码进行加密
        String chenjr = bCryptPasswordEncoder.encode("chenjr");
        String atguigu = bCryptPasswordEncoder.encode("atguigu");
        // 打印加密之后的数据
        System.out.println(chenjr);
        System.out.println(atguigu);
        // 判断原字符加密后和加密之前是否匹配
//        boolean matches1 = bCryptPasswordEncoder.matches("chenjr", chenjr);
        boolean matches2 = bCryptPasswordEncoder.matches("atguigu", "$2a$10$2R/M6iU3mCZt3ByG7kwYTeeW0w7/UqdeXrb27zkBIizBvAven0/na");
        // 打印比较结果
//        System.out.println("matches1:" + matches1);
        System.out.println("matches2:" + matches2);
    }

}
