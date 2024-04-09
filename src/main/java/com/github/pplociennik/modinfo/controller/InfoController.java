package com.github.pplociennik.modinfo.controller;

import com.github.pplociennik.modinfo.dto.BuildEnvInfoDto;
import com.github.pplociennik.modinfo.dto.BuildInfoDto;
import com.github.pplociennik.modinfo.dto.ContactInfoDto;
import com.github.pplociennik.modinfo.dto.ModuleInfoDto;
import com.github.pplociennik.modinfo.service.IModuleInfoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A Rest Controller sharing the API endpoints for gathering the module information.
 * The data is being gained from the application properties.
 *
 * @author Created by: Pplociennik at 04.04.2024 19:44
 */
@RestController( value = "/api/info" )
@AllArgsConstructor
class InfoController {

    private final IModuleInfoService IModuleInfoService;

    @GetMapping( path = "/build-info" )
    ResponseEntity< BuildInfoDto > getBuildInfo() {
        BuildInfoDto moduleBuildInformation = IModuleInfoService.getModuleBuildInformation();
        return ResponseEntity
                .status( HttpStatus.OK )
                .body( moduleBuildInformation );
    }

    @GetMapping( path = "/build-env-info" )
    ResponseEntity< BuildEnvInfoDto > getBuildEnvInfo() {
        BuildEnvInfoDto moduleBuildEnvironmentInformation = IModuleInfoService.getModuleBuildEnvironmentInformation();
        return ResponseEntity
                .status( HttpStatus.OK )
                .body( moduleBuildEnvironmentInformation );
    }

    @GetMapping( path = "/contact-info" )
    ResponseEntity< ContactInfoDto > getContactInfo() {
        ContactInfoDto contactInfo = IModuleInfoService.getContactInformation();
        return ResponseEntity
                .status( HttpStatus.OK )
                .body( contactInfo );
    }

    @GetMapping( path = "/module-info" )
    ResponseEntity< ModuleInfoDto > getModuleInfo() {
        ModuleInfoDto moduleInfo = IModuleInfoService.getModuleInformation();
        return ResponseEntity
                .status( HttpStatus.OK )
                .body( moduleInfo );
    }
}
