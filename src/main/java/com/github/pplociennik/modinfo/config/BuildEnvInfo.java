package com.github.pplociennik.modinfo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * A record being a representation of the application build environment information. Contains data such as:
 * - JDK Distribution
 * - JDK Version
 * - Docker Distribution
 * - Docker Version
 *
 * @author Created by: Pplociennik at 09.04.2024 20:11
 */
@Getter
@Setter
@ConfigurationProperties( prefix = "build-env" )
public class BuildEnvInfo {
    private String jdkDistribution;
    private String jdkVersion;
    private String dockerDistribution;
    private String dockerVersion;
}
