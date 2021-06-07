package com.github.jozsefutca.kaputelefon.application;

import com.github.jozsefutca.kaputelefon.configuration.ApplicationConfiguration;
import com.github.jozsefutca.kaputelefon.configuration.SpringFoxConfig;
import com.github.jozsefutca.kaputelefon.model.Settings;
import com.github.jozsefutca.kaputelefon.repository.SettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.Iterator;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@Import({ApplicationConfiguration.class, SpringFoxConfig.class})
public class MainApplication {
  @Autowired private final SettingsRepository settingsRepository;

  public MainApplication(SettingsRepository settingsRepository) {
    this.settingsRepository = settingsRepository;
  }

  public static void main(String[] args) {
    run(MainApplication.class, args);
  }

  @PostConstruct
  @Transactional
  public void init() {
    Iterator<Settings> settings = settingsRepository.findAll().iterator();
    if (!settings.hasNext()) {
      settingsRepository.save(new Settings());
    }
  }
}
