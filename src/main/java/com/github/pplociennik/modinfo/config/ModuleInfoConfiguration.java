package com.github.pplociennik.modinfo.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static com.github.pplociennik.modinfo.config.ModuleInfoConfiguration.*;

/**
 * A configuration class for Module Info project.
 *
 * @author Created by: Pplociennik at 04.04.2024 19:35
 */
@Configuration
@ComponentScan( basePackages = { CONTROLLERS_BASE_PACKAGE, CONFIGURATION_BASE_PACKAGE, SERVICES_BASE_PACKAGE } )
@EnableConfigurationProperties( value = { BuildInfo.class, BuildEnvInfo.class, ContactInfo.class } )
public class ModuleInfoConfiguration {

    /**
     * Base package where the configuration classes are being stored.
     */
    public static final String CONFIGURATION_BASE_PACKAGE = "com.github.pplociennik.modinfo.config";

    /**
     * Base package where the controllers are being stored.
     */
    public static final String CONTROLLERS_BASE_PACKAGE = "com.github.pplociennik.modinfo.controller";

    /**
     * Base package where the services are being stored.
     */
    public static final String SERVICES_BASE_PACKAGE = "com.github.pplociennik.modinfo.service.impl";
}
