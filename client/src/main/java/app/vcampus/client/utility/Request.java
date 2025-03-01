package app.vcampus.client.utility;

import lombok.Data;

import java.util.Map;
import java.util.UUID;

@Data
public class Request {
    UUID id = UUID.randomUUID();

    String uri;
    Map<String, String> params;
}
