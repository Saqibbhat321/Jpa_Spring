package com.xworkz.xworkmodule.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.xworkz.xworkmodule")
@EnableWebMvc
public class ModuleConfiguration {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/module");
        dataSource.setUsername("root");
        dataSource.setPassword("saqib");
        return dataSource;
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder()
    {
        return   new BCryptPasswordEncoder();
    }


    @Bean
    public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean()
    {
    LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
//    log.info("this is logger");
    bean.setPackagesToScan("com.xworkz.xworkmodule.entity");
    bean.setDataSource(dataSource());
    bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
    return bean;
    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

}

