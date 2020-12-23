package guru.springframework;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloWorldTest {

    @Test
    public void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assertEquals("Hello World",javaHelloWorld.getHello());
    }
}