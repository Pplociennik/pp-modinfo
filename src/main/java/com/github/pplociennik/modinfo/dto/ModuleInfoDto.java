package com.github.pplociennik.modinfo.dto;

import com.github.pplociennik.modinfo.config.BuildEnvInfo;
import com.github.pplociennik.modinfo.config.BuildInfo;
import com.github.pplociennik.modinfo.config.ContactInfo;
import lombok.*;

/**
 * A data transfer object representing the data from {@link BuildInfo}, {@link BuildEnvInfo} and {@link ContactInfo}.
 *
 * @author Created by: Pplociennik at 09.04.2024 20:33
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ModuleInfoDto {
    private BuildInfoDto buildInfo;
    private BuildEnvInfoDto buildEnvInfo;
    private ContactInfoDto contactInfo;
}
