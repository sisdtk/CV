package utils;

import admin.api.MRM.MrmApiConfig;
import com.github.javafaker.Faker;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Generator extends MrmApiConfig {
    private static final Logger logger = LoggerFactory.getLogger(Generator.class.getSimpleName());
    private static final String STRING = "String",
            INTEGER = "Integer",
            SERIALIZED = "SERIALIZED",
            JAVA_LANG_OBJECT = "java.lang.Object";
    private static final Class<Mandatory> MANDATORY_CLASS = Mandatory.class;
    private static final Class<ExlcudeFromGeneration> EXLCUDE_FROM_GENERATION_CLASS = ExlcudeFromGeneration.class;
    private final Faker faker = new Faker();

    public <T> T generate(T dto) {
        if (!dto.getClass().getSuperclass().getName().equals(JAVA_LANG_OBJECT)) {
            Field[] fieldsOfSuperClass = dto.getClass().getSuperclass().getDeclaredFields();

            Stream<Field> streamOfSuperClassFields = Arrays.stream(fieldsOfSuperClass);
            streamOfSuperClassFields
                    .filter(field -> !field.getName().contains(SERIALIZED))
                    .filter(field -> !field.isAnnotationPresent(EXLCUDE_FROM_GENERATION_CLASS))
                    .filter(field -> field.isAnnotationPresent(MANDATORY_CLASS))
                    .forEach(System.out::println);
        }

        Field[] fieldsOfThisClass = dto.getClass().getDeclaredFields();
        Stream<Field> streamOfThisClassFields = Arrays.stream(fieldsOfThisClass);
        streamOfThisClassFields
                .filter(field -> !field.getName().contains(SERIALIZED))
                .filter(field -> !field.isAnnotationPresent(EXLCUDE_FROM_GENERATION_CLASS))
                .forEach(field -> {
                    if (field.isAnnotationPresent(MANDATORY_CLASS)) {
                        try {
                            Mandatory mandatoryAnnotation = field.getAnnotation(MANDATORY_CLASS);
                            Class<?> clazz = Class.forName(mandatoryAnnotation.service().getName());
                            Method declaredMethod = clazz.getDeclaredMethod(mandatoryAnnotation.method(), mandatoryAnnotation.clazzParams());
                            Class<?>[] params = {RequestSpecBuilder.class};
                            Object api = clazz.getConstructor(params).newInstance(getRequestSpecBuilder());

                            Function<Response, JsonPath> function = Response::jsonPath;
                            JsonPath response = (JsonPath) declaredMethod.invoke(api, function);
                            int id = response.getInt(mandatoryAnnotation.jsonPath());

                            if (!field.canAccess(dto)) {
                                field.setAccessible(true);
                            }
                            field.set(dto, id);
                        } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException |
                                 InvocationTargetException | InstantiationException e) {
                            e.printStackTrace();
                        }
                    } else {
                        if (!field.canAccess(dto)) {
                            field.setAccessible(true);
                        }
                        String fieldType = "";
                        if (field.getType().toString().contains(STRING))
                            fieldType = STRING;
                        else if (field.getType().toString().contains(INTEGER))
                            fieldType = INTEGER;
                        switch (fieldType) {
                            case STRING:
                                try {
                                    field.set(dto, faker.animal().name());
                                    break;
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                            case INTEGER:
                                try {
                                    field.set(dto, faker.number().randomDigitNotZero());
                                    break;
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                            default:
                                logger.info("fieldType = " + fieldType);
                                break;
                        }
                    }
                });
        return dto;
    }
}