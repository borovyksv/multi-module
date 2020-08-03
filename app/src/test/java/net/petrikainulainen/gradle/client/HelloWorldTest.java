package net.petrikainulainen.gradle.client;

import net.petrikainulainen.gradle.core.MessageService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    private final HelloWorld application = new HelloWorld();
    private final MessageService core = new MessageService();


    @Test
    public void getMessageFromAppModule() {
        String message = application.getMessage();
        assertEquals("Hello World!", message);
    }

    @Test
    public void getMessageFromCoreModule() {
        String message = core.getMessage();
        assertEquals("Hello World!", message);
    }


}
