#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.util.HashMap;
import java.util.Map;

public class ${artifactIdCapitalized}Handler implements RequestHandler<Map<String, Object>, Map<String, Object>> {

    @Override
    public Map<String, Object> handleRequest(Map<String, Object> input, Context context) {
        Map<String, Object> response = new HashMap<>();
        Map<String, Object> body = new HashMap<>();

        body.put("mensaje", "Hola desde AWS Lambda 🚀");
        body.put("numero", 42);

        response.put("statusCode", 200);
        response.put("headers", Map.of("Content-Type", "application/json"));
        response.put("body", String.format("{${symbol_escape}"mensaje${symbol_escape}":${symbol_escape}"%s${symbol_escape}", ${symbol_escape}"numero${symbol_escape}":%d}", body.get("mensaje"), body.get("numero")));

        return response;
    }
}