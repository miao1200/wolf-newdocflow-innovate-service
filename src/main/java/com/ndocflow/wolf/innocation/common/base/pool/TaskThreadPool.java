package com.ndocflow.wolf.innocation.common.base.pool;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author is Mj
 * @date 2025-01-03 17:0346
 * @functionDesc
 **/
@Configuration
public class TaskThreadPool {
    @Bean(name = "testThreadPool")
    public ThreadPoolTaskExecutor TaskThreadPool(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(100);
        executor.setKeepAliveSeconds(60);
        executor.setThreadNamePrefix("test-thread-");
        executor.initialize();
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
        return executor;
    }
}
