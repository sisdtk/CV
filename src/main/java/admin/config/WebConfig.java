package admin.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:environment/${env}.properties"})
public interface WebConfig extends Config {
    @Key("browserName")
    String browserName();

    @Key("browserVersion")
    String browserVersion();

    @Key("localeTag")
    String localeTag();

    @Key("workingHost")
    String workingHost();

    @Key("login")
    String login();

    @Key("password")
    String password();

    @Key("groups")
    String groups();

    @Key("remoteHostIp")
    String remoteHostIp();

    @Key("selenoidHostIp")
    String selenoidHostIp();

    @Key("selenoid")
    Boolean selenoid();
}
