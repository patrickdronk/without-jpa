//package dev.bram.withoutjpa.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.simple.JdbcClient;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class JdbcConfig {
//
//    private final DataSource dataSource;
//
//    public JdbcConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//    @Bean
//    public JdbcClient jdbcClient() {
//        return new JdbcClient(dataSource) {
//        };
//    }
//}
//
