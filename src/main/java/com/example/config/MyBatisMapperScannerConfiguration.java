package com.example.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ɨ��mybatis�Ľӿ�
 *
 * @author zxj
 *
 */
@Configuration
// ��Ϊ��������ɨ�裬��Ҫ��MyBatisConfig�ĺ���ע�룬���Լ��������ע��
@AutoConfigureAfter(MyBatisConfiguration.class)
public class MyBatisMapperScannerConfiguration {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //��ȡ֮ǰע���beanNameΪsqlSessionFactory�Ķ���
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        //ָ��xml�����ļ���·��
        mapperScannerConfigurer.setBasePackage("com.framework.msg.mapper");
        return mapperScannerConfigurer;
    }
}
