package com.github.pplociennik.modinfo.dto;

import com.github.pplociennik.modinfo.config.BuildInfo;
import lombok.*;

/**
 * A data transfer object representing the data from {@link BuildInfo}.
 *
 * @author Created by: Pplociennik at 09.04.2024 20:21
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class BuildEnvInfoDto {
    private String jdkDistributio;
    private String jdkVersion;
    private String dockerDistributio;
    private String dockerVersion;
}
