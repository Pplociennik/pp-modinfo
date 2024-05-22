package com.github.pplociennik.modinfo.dto;

import com.github.pplociennik.modinfo.config.ContactInfo;
import lombok.*;

import java.util.List;

/**
 * A data transfer object representing the data from {@link ContactInfo}.
 *
 * @author Created by: Pplociennik at 09.04.2024 20:21
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ContactInfoDto {
    private List< String > authors;
    private List< String > emailAddresses;
    private String githubLink;
}
