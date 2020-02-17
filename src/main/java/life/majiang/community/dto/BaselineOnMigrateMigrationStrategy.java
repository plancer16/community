package life.majiang.community.dto;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.stereotype.Component;

/**
 * @author plancer16
 * @create 2020-01-17 17:23
 */
@Component
public class BaselineOnMigrateMigrationStrategy implements FlywayMigrationStrategy {
    @Override
    public void migrate(org.flywaydb.core.Flyway flyway) {
        flyway.setBaselineOnMigrate(true);
        flyway.migrate();
    }
}
