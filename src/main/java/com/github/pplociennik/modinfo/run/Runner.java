package com.github.pplociennik.modinfo.run;

import com.github.pplociennik.modinfo.config.ModuleInfoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Import;

/**
 * Test runner class.
 */
@Import( value = { ModuleInfoConfiguration.class } )
public class Runner {

    public static void main( String[] args ) {
        SpringApplication.run( Runner.class, args );
    }

}
