package admin.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:junit-platform.properties"})
public interface ParallelExecutionConfig extends Config {
    @Key("junit.jupiter.execution.parallel.enabled")
    String parallelism();

    @Key("junit.jupiter.execution.parallel.config.fixed.parallelism")
    String parallelThreads();
}
