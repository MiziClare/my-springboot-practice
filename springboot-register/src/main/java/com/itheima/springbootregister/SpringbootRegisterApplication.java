package com.itheima.springbootregister;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootRegisterApplication {

    public static void main(String[] args) {

        // 启动SpringBoot应用，返回IOC容器对象
        ApplicationContext applicationContext = SpringApplication.run(SpringbootRegisterApplication.class, args);

        // 从容器中获取Country对象，检测该对象是否被注册到IOC容器中
        Country country = applicationContext.getBean(Country.class);
        System.out.println(country);

        // 通过id获取Province对象
        // 注：applicationContext.getBean("province") 返回的是 Object 类型，直接打印时不会有类型不兼容的问题。只有在赋值给特定类型变量（如 Province province1 = applicationContext.getBean("province");）时，才需要强制类型转换。
        // 打印时不关心具体类型，所以不会报错。赋值时类型必须匹配，才需要 (Province) 强制转换。
        Province province1 = (Province) applicationContext.getBean("province");
        System.out.println(province1);
        System.out.println(applicationContext.getBean("province"));
    }

//    // 通过Bean注解注入Country对象
//    @Bean // 将当前方法的返回值作为Bean对象注册到IOC容器中，方法名作为Bean的id，成为IOC容器的bean对象
//    public Country country(){
//        return new Country();
//    }
//
//    // 不过这种方式不推荐。因为启动类应该只用于启动。正确方法是创建一个配置类。
//    // 正确方式见config包下的CommonConfig.java
}
