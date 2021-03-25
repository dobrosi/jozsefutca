package com.github.jozsefutca.kaputelefon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.github.jozsefutca.kaputelefon.model.Settings;

@CrossOrigin(origins = {"http://localhost:3000", "http://localhost"})
public interface SettingsRepository extends CrudRepository<Settings, Long> {

  Settings findFirstByOrderById();
}
