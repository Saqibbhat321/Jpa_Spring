package com.xworkz.courseregistration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.persistence.Basic;
import javax.sql.DataSource;
import java.sql.Driver;
import java.sql.DriverManager;
import javax.sql.DataSource;

@Configuration
@ComponentScan("com.xworkz.courseregistration")
@EnableWebMvc
public class CourseConfiguration {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/course");
        dataSource.setUsername("root");
        dataSource.setPassword("saqib");
        return dataSource;

    }

    @Bean
    public LocalContainerEntityManagerFactoryBean localContEnititymangFactBean() {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();

        bean.setPackagesToScan("com.xworkz.courseregistration.entity");
        bean.setDataSource(dataSource());
        bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return bean;

    }
    @Bean
    public ViewResolver view()
    {
        return  new InternalResourceViewResolver("/",".jsp");
    }
}
