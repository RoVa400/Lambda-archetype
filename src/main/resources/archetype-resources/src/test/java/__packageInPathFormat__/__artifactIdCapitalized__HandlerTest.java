#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

public class ${artifactId}HandlerTest {

    @Test
    public void testHandleRequest() {
        ${artifactId}Handler handler = new ${artifactId}Handler();
        Map<String, Object> response = handler.handleRequest(Map.of(), null);

        assertNotNull(response);
        assertEquals(200, response.get("statusCode"));

        String body = (String) response.get("body");
        assertTrue(body.contains("Hola desde AWS Lambda"));
    }
}
