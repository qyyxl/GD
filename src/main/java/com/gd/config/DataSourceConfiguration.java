package com.gd.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * 数据源配置
 */
@Configuration
@EnableTransactionManagement
public class DataSourceConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(DataSourceConfiguration.class);

    /**
     * GDDATEBASE库数据
     *
     * @return+
     */
    @Bean(name = "gdDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource gdDataSource() {
        logger.info("==================GDDATABASE init!==================");
        return DataSourceBuilder.create().type(DruidDataSource.class).build();
    }

}
