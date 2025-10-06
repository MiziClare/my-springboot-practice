package com.itheima.springbootregister.config;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 当配置文件中存在country.name和country.system属性时，当前配置类CommonConfig生效
@ConditionalOnProperty(prefix = "country", name = {"name", "system"})
@Configuration
public class CommonConfig {
    @Bean // 将当前方法的返回值作为Bean对象注册到IOC容器中，方法名作为Bean的id，成为IOC容器的bean对象
    public Country country(@Value("${country.name}") String name, @Value("${country.system}") String system){
        Country country = new Country();
        country.setName(name);
        country.setSystem(system);
        return country;
    }

    // 对象的默认id是方法名"province"
    @Bean
    public Province province(){
        System.out.println();
        return new Province();
    }
}
