package com.github.pplociennik.modinfo.service.impl;

import com.github.pplociennik.modinfo.config.BuildEnvInfo;
import com.github.pplociennik.modinfo.config.BuildInfo;
import com.github.pplociennik.modinfo.config.ContactInfo;
import com.github.pplociennik.modinfo.dto.BuildEnvInfoDto;
import com.github.pplociennik.modinfo.dto.BuildInfoDto;
import com.github.pplociennik.modinfo.dto.ContactInfoDto;
import com.github.pplociennik.modinfo.dto.ModuleInfoDto;
import com.github.pplociennik.modinfo.map.ModInfoMapper;
import com.github.pplociennik.modinfo.service.IModuleInfoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * TODO: Describe this class.
 *
 * @author Created by: Pplociennik at 04.04.2024 20:17
 */
@Service
@AllArgsConstructor
class ModuleInfoServiceImpl implements IModuleInfoService {

    private final BuildInfo buildInfo;
    private final BuildEnvInfo buildEnvInfo;
    private final ContactInfo contactInfo;

    /**
     * Gathers the details about the current application build.
     *
     * @return The {@link BuildInfoDto} typed object containing the current application build details.
     */
    @Override
    public BuildInfoDto getModuleBuildInformation() {
        return ModInfoMapper.mapToDto( buildInfo );
    }

    /**
     * Gathers the details about the current application build environment.
     *
     * @return The {@link BuildEnvInfoDto} typed object containing the current application build environment details.
     */
    @Override
    public BuildEnvInfoDto getModuleBuildEnvironmentInformation() {
        return ModInfoMapper.mapToDto( buildEnvInfo );
    }

    /**
     * Gathers the information about the current application authors' contact details.
     *
     * @return The {@link ContactInfoDto} typed object containing the current application authors' contact details.
     */
    @Override
    public ContactInfoDto getContactInformation() {
        return ModInfoMapper.mapToDto( contactInfo );
    }

    /**
     * Gathers the information about the current module.
     *
     * @return The {@link ModuleInfoDto} typed object containing all the build, environment and contact information.
     */
    @Override
    public ModuleInfoDto getModuleInformation() {
        BuildInfoDto buildInfo = ModInfoMapper.mapToDto( this.buildInfo );
        BuildEnvInfoDto buildEnvInfo = ModInfoMapper.mapToDto( this.buildEnvInfo );
        ContactInfoDto contactInfo = ModInfoMapper.mapToDto( this.contactInfo );

        return new ModuleInfoDto( buildInfo, buildEnvInfo, contactInfo );
    }
}
