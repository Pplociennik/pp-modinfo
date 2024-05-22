package com.github.pplociennik.modinfo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * A record being a representation of the application authors' contact information. Contains data such as:
 * - Authors
 * - Mail addresses
 * - GitHub account Link
 *
 * @author Created by: Pplociennik at 09.04.2024 20:16
 */
@Getter
@Setter
@ConfigurationProperties( prefix = "contact" )
public class ContactInfo {
    List< String > authors;
    List< String > emailAddresses;
    String githubLink;
}
