package api;

import io.restassured.response.Response;

public class AudienceApi extends ApiFactory {
    public AudienceApi() {
        RestApiHelper.setBasePath("/lists/");
    }

    public Response create() {
        return null;
    }
}
