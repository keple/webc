package com.webc.server.webc_serv.settings;
import javax.sql.DataSource;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/datasource.properties")
public class DatabaseConfiguration{
    private static final Logger LOGGER = LogManager.getLogger(DatabaseConfiguration.class);
    @Bean
    @ConfigurationProperties(prefix="spring.datasource.hikari")
    public HikariConfig hikariConfig(){
        LOGGER.info("==setup==");
        return new HikariConfig();
    }
    @Bean
    public DataSource dataSource(){
        DataSource dataSource = new HikariDataSource(hikariConfig());
        LOGGER.info("datasource : " + dataSource);
        return dataSource;
    }

}