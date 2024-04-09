package com.github.pplociennik.modinfo.map;

import com.github.pplociennik.modinfo.config.BuildEnvInfo;
import com.github.pplociennik.modinfo.config.BuildInfo;
import com.github.pplociennik.modinfo.config.ContactInfo;
import com.github.pplociennik.modinfo.dto.BuildEnvInfoDto;
import com.github.pplociennik.modinfo.dto.BuildInfoDto;
import com.github.pplociennik.modinfo.dto.ContactInfoDto;
import org.springframework.lang.NonNull;

import static java.util.Objects.requireNonNull;

/**
 * A mapper for the build info.
 *
 * @author Created by: Pplociennik at 04.04.2024 19:50
 */
public class ModInfoMapper {

    public static BuildInfoDto mapToDto( @NonNull BuildInfo aBuildInfo ) {
        requireNonNull( aBuildInfo );
        return new BuildInfoDto( aBuildInfo.name(), aBuildInfo.version(), aBuildInfo.date(), aBuildInfo.os() );
    }

    public static BuildEnvInfoDto mapToDto( @NonNull BuildEnvInfo aBuildEnvInfo ) {
        requireNonNull( aBuildEnvInfo );
        return new BuildEnvInfoDto( aBuildEnvInfo.jdkDistribution(), aBuildEnvInfo.jdkVersion(), aBuildEnvInfo.dockerDistribution(), aBuildEnvInfo.dockerVersion() );
    }

    public static ContactInfoDto mapToDto( @NonNull ContactInfo aContactInfo ) {
        requireNonNull( aContactInfo );
        return new ContactInfoDto( aContactInfo.authors(), aContactInfo.emailAddresses(), aContactInfo.githubLink() );
    }
}
