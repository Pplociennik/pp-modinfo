package com.github.pplociennik.modinfo.dto;

import com.github.pplociennik.modinfo.config.BuildInfo;

import java.time.LocalDate;

/**
 * A data transfer object representing the data from {@link BuildInfo}.
 *
 * @author Created by: Pplociennik at 04.04.2024 19:49
 */
public record BuildInfoDto( String name, String version, LocalDate date, String os ) {
}
