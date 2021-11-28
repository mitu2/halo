package run.halo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

/**
 * Halo main class.
 *
 * @author ryanwang
 * @date 2017-11-14
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // Customize the spring config location
        System.setProperty("spring.config.additional-location",
            "optional:file:${user.home}/.halo/,optional:file:${user.home}/halo-dev/");

        // Run application
        final SpringApplication haloApplication = new SpringApplication(Application.class);
        haloApplication.addListeners(new ApplicationPidFileWriter());
        haloApplication.run(args);
    }

}
