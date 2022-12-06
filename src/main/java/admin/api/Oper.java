package admin.api;

import io.restassured.response.Response;

import java.util.function.Function;

public interface Oper {

    <T> T execute(Function<Response, T> handler);

}
