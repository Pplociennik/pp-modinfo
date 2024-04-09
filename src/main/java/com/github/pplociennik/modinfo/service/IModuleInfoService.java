package com.github.pplociennik.modinfo.service;

import com.github.pplociennik.modinfo.dto.BuildEnvInfoDto;
import com.github.pplociennik.modinfo.dto.BuildInfoDto;
import com.github.pplociennik.modinfo.dto.ContactInfoDto;
import com.github.pplociennik.modinfo.dto.ModuleInfoDto;

/**
 * A service providing methods for getting the necessary information and processing it to the Rest Controller.
 *
 * @author Created by: Pplociennik at 04.04.2024 20:16
 */
public interface IModuleInfoService {

    /**
     * Gathers the details about the current application build.
     *
     * @return The {@link BuildInfoDto} typed object containing the current application build details.
     */
    BuildInfoDto getModuleBuildInformation();

    /**
     * Gathers the details about the current application build environment.
     *
     * @return The {@link BuildEnvInfoDto} typed object containing the current application build environment details.
     */
    BuildEnvInfoDto getModuleBuildEnvironmentInformation();

    /**
     * Gathers the information about the current application authors' contact details.
     *
     * @return The {@link ContactInfoDto} typed object containing the current application authors' contact details.
     */
    ContactInfoDto getContactInformation();

    /**
     * Gathers the information about the current module.
     *
     * @return The {@link ModuleInfoDto} typed object containing all the build, environment and contact information.
     */
    ModuleInfoDto getModuleInformation();
}
