package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestApiHelper {
    private static String baseURI;
    private static String basePath;
    private static String authKey;
    private static RequestSpecification request;

    public static void setAuthKey(String authKey) {
        RestApiHelper.authKey = authKey;
    }

    public static void setBaseURI(String baseURI) {
        RestApiHelper.baseURI = baseURI;
    }

    public static void setBasePath(String basePath) {
        RestApiHelper.basePath = basePath;
    }

    private static void basicAuth() {
        RestAssured.baseURI = baseURI;
        RestAssured.basePath = basePath;
        request = RestAssured.given();
        request.auth().oauth2(authKey);
        request.header("Content-Type", "application/json");
    }

    public static Response getRequest() {
        try {
            basicAuth();
            return request.get();
        } catch (Exception ignored) {
        }
        return null;
    }

    public static Response getRequest(String id) {
        try {
            basicAuth();
            return request.get(id);
        } catch (Exception ignored) {
        }
        return null;
    }

    public static Response postRequest(String data) {
        try {
            basicAuth();
            return request.body(data).post();
        } catch (Exception ignored) {
        }
        return null;
    }

    public static Response postRequest(String data, String endpoint) {
        try {
            basicAuth();
            return request.body(data).post(endpoint);
        } catch (Exception ignored) {
        }
        return null;
    }

    public static Response putRequest(String data, String endpoint) {
        try {
            basicAuth();
            return request.body(data).put(endpoint);
        } catch (Exception ignored) {
        }
        return null;
    }

    public static Response patchRequest(String data, String endpoint) {
        try {
            basicAuth();
            return request.body(data).put(endpoint);
        } catch (Exception ignored) {
        }
        return null;
    }

    public static Response deleteRequest(String id) {
        try {
            basicAuth();
            return request.delete(id);
        } catch (Exception ignored) {
        }
        return null;
    }
}
