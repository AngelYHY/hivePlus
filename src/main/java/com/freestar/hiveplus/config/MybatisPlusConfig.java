package com.freestar.hiveplus.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@EnableTransactionManagement 是 spring-tx 的注解，不是 spring-boot 的
//spring-boot 会自动配置事务，相关的配置在 org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration
//@EnableTransactionManagement(proxyTargetClass = true)
@Configuration
@MapperScan(value = {"com.freestar.hiveplus.ynyc_dm.mapper"})
public class MybatisPlusConfig {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // paginationInterceptor.setLimit(你的最大单页限制数量，默认 500 条，小于 0 如 -1 不受限制);
        return paginationInterceptor;
    }
}
