package com.github.jozsefutca.kaputelefon.application;

import static org.slf4j.LoggerFactory.getLogger;
import static org.springframework.boot.SpringApplication.run;
import java.util.Iterator;
import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.github.jozsefutca.kaputelefon.configuration.ApplicationConfiguration;
import com.github.jozsefutca.kaputelefon.configuration.SpringFoxConfig;
import com.github.jozsefutca.kaputelefon.model.Settings;
import com.github.jozsefutca.kaputelefon.repository.SettingsRepository;

@SpringBootApplication
@Import({ApplicationConfiguration.class, SpringFoxConfig.class})
public class MainApplication {
  Logger logger = getLogger(MainApplication.class);

  @Autowired private SettingsRepository settingsRepository;

  public static void main(String[] args) {
    run(MainApplication.class, args);
  }

  @PostConstruct
  @Transactional
  protected void init() {
    Iterator<Settings> settings = settingsRepository.findAll().iterator();
    if (!settings.hasNext()) {
      settingsRepository.save(new Settings());
    }
  }
}
