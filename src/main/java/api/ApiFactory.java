package api;

import io.restassured.response.Response;
import utils.Links;
import utils.User;


public abstract class ApiFactory implements Api {
    ApiFactory() {
        RestApiHelper.setBaseURI(Links.API_URL);
        RestApiHelper.setAuthKey(User.API_KEY);
    }

    public Response get() {
        return RestApiHelper.getRequest();
    }

    public Response get(String id) {
        return RestApiHelper.getRequest(id);
    }

    public Response create(String payload) {
        return RestApiHelper.postRequest(payload);
    }

    public Response create(String payload, String endpoint) {
        return RestApiHelper.postRequest(payload, endpoint);
    }

    public Response put(String payload, String id) {
        return RestApiHelper.putRequest(payload, id);
    }

    public Response patch(String payload, String id) {
        return RestApiHelper.patchRequest(payload, id);
    }

    public Response delete(String id) {
        return RestApiHelper.deleteRequest(id);
    }
}
