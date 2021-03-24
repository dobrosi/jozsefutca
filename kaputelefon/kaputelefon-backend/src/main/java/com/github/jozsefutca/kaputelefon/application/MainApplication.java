package com.github.jozsefutca.kaputelefon.application;

import static org.slf4j.LoggerFactory.getLogger;
import static org.springframework.boot.SpringApplication.run;
import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.github.jozsefutca.kaputelefon.configuration.ApplicationConfiguration;
import com.github.jozsefutca.kaputelefon.configuration.SpringFoxConfig;

@SpringBootApplication
@Import({ApplicationConfiguration.class, SpringFoxConfig.class})
public class MainApplication {
	Logger logger = getLogger(MainApplication.class);


	public static void main(String[] args) {
		run(MainApplication.class, args);
	}

}
