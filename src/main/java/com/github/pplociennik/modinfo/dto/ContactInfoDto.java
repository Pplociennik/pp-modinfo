package com.github.pplociennik.modinfo.dto;

import com.github.pplociennik.modinfo.config.ContactInfo;

import java.util.List;

/**
 * A data transfer object representing the data from {@link ContactInfo}.
 *
 * @author Created by: Pplociennik at 09.04.2024 20:21
 */
public record ContactInfoDto( List< String > authors, List< String > emailAddresses, String githubLink ) {
}
