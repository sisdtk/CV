package utils;

import io.qameta.allure.restassured.AllureRestAssured;

public class AllureLogFilter {
    private static final AllureRestAssured FILTER = new AllureRestAssured();

    private AllureLogFilter() {
    }

    public static AllureLogFilter allureLogFilter() {
        return InitLogFilter.logFilter;
    }

    public AllureRestAssured withCustomTemplates() {
        FILTER.setRequestTemplate("request.ftl");
        FILTER.setResponseTemplate("response.ftl");
        return FILTER;

    }

    private static class InitLogFilter {
        private static final AllureLogFilter logFilter = new AllureLogFilter();
    }
}