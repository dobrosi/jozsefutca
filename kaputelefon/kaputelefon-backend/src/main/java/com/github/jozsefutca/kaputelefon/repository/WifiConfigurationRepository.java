package com.github.jozsefutca.kaputelefon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.github.jozsefutca.kaputelefon.model.WifiConfiguration;

@CrossOrigin(origins = {"http://localhost:3000", "http://localhost"})
public interface WifiConfigurationRepository extends CrudRepository<WifiConfiguration, Long> {}
