package com.github.pplociennik.modinfo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.LocalDate;

/**
 * A record being a representation of the current application build information. Contains data such as:
 * - Application name
 * - Application version
 * - The date of build
 * - The operating system on which the application has been built
 *
 * @author Created by: Pplociennik at 04.04.2024 19:52
 */
@Getter
@Setter
@ConfigurationProperties( prefix = "build" )
public class BuildInfo {
    private String name;
    private String version;
    private LocalDate date;
    private String os;
}
