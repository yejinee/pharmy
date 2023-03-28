package com.pharm.pharmy

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.TestPropertySource
import org.testcontainers.containers.GenericContainer
import spock.lang.Specification

@SpringBootTest
@TestPropertySource(locations = ["classpath:application.yml"])
abstract class AbstractIntegrationContainerBaseTest extends Specification {
    //generic container (redis)
    static final GenericContainer MY_REDIS_CONTAINER

    static {
        // docker port
        MY_REDIS_CONTAINER = new GenericContainer<>("redis:6").withExposedPorts(6379)

        MY_REDIS_CONTAINER.start()

        // mapping port with docker port
        System.setProperty("spring.redis.host", MY_REDIS_CONTAINER.getHost())
        System.setProperty("spring.redis.port", MY_REDIS_CONTAINER.getMappedPort(6379).toString())

    }
}
