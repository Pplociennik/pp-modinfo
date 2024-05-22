package com.github.pplociennik.modinfo.dto;

import com.github.pplociennik.modinfo.config.BuildInfo;
import lombok.*;

import java.time.LocalDate;

/**
 * A data transfer object representing the data from {@link BuildInfo}.
 *
 * @author Created by: Pplociennik at 04.04.2024 19:49
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class BuildInfoDto {
    private String name;
    private String version;
    private LocalDate date;
    private String os;
}
