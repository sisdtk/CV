package utils;

import io.restassured.http.*;

import java.lang.annotation.*;
import java.util.function.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Mandatory {
    Class<?> service();

    String uriPath();

    Method httpMethod();

    String method() default "execute";

    Class<?> clazzParams() default Function.class;

    String jsonPath();
}
