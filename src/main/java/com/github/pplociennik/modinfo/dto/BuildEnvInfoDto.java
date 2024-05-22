package com.github.pplociennik.modinfo.dto;

import com.github.pplociennik.modinfo.config.BuildInfo;

/**
 * A data transfer object representing the data from {@link BuildInfo}.
 *
 * @author Created by: Pplociennik at 09.04.2024 20:21
 */
public record BuildEnvInfoDto( String jdkDistribution, String jdkVersion, String dockerDistribution,
                               String dockerVersion ) {
}
