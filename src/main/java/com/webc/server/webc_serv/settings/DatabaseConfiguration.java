package com.webc.server.webc_serv.settings;
import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

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
    @Bean(name="dataSource")
    public DataSource dataSource(){
        DataSource dataSource = new HikariDataSource(hikariConfig());
        LOGGER.info("datasource : " + dataSource);
        return dataSource;
    }
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(
        @Qualifier("dataSource") DataSource dataSource,
        ApplicationContext appContext
    )throws Exception{
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setDataSource(dataSource);
        ssfb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(""));
        return ssfb.getObject();
    }
    @Bean(name = "sqlSession")
    public SqlSessionTemplate sqlSesion(SqlSessionFactory ssf)throws Exception{
        return new SqlSessionTemplate(ssf);
    }

}