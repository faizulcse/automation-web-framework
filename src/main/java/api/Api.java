package api;

import io.restassured.response.Response;

public interface Api {

    Response get();

    Response get(String id);

    Response create();

    Response create(String payload);

    Response create(String payload, String endpoint);

    Response put(String payload, String id);

    Response patch(String payload, String id);

    Response delete(String id);
}
