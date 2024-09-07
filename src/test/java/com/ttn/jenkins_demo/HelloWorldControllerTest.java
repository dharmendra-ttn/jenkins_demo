package com.ttn.jenkins_demo;

import org.junit.jupiter.api.Test;

import java.util.Objects;

class HelloWorldControllerTest {

    @Test
    void helloWorld() {
        HelloWorldController controller = new HelloWorldController();
        assert Objects.equals(controller.sayHello(), "Hello World!");
    }

}