package com.github.jozsefutca.kaputelefon.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;

@Configuration
@ComponentScan(basePackages = "com.github.jozsefutca.kaputelefon")
@EntityScan("com.github.jozsefutca.kaputelefon.model")
@EnableJpaRepositories("com.github.jozsefutca.kaputelefon.repository")
@EnableJpaAuditing
@Import(SpringDataRestConfiguration.class)
public class ApplicationConfiguration {
	@Bean
	public ObjectMapper createObjectMapper() {
		return new ObjectMapper();
	}
}
