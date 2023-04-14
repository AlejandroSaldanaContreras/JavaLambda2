package dev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LambdaParamsTest {
	@Test
    public void shouldReturnLambdaParams() {
        var sut = new LambdaParams();
        var name = "Miranda";
        Assertions.assertEquals("My first Java Lambda with Params thanks to: Miranda :3", sut.handleRequest(name));
    }
}
