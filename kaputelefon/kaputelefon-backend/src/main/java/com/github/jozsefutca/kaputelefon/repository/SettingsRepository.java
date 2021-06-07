package com.github.jozsefutca.kaputelefon.repository;

import com.github.jozsefutca.kaputelefon.model.Settings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = {"http://localhost:3000", "http://localhost"})
public interface SettingsRepository extends CrudRepository<Settings, Long> {

  Settings findFirstByOrderById();
}
