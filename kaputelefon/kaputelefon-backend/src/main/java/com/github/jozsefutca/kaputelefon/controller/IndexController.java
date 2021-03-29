package com.github.jozsefutca.kaputelefon.controller;

import com.github.jozsefutca.kaputelefon.repository.SettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;

import static org.springframework.http.ResponseEntity.ok;

@CrossOrigin
@Controller
public class IndexController {
  @Autowired private SettingsRepository settingsRepository;

  @GetMapping(value = "/")
  public ResponseEntity<String> loadIndexPage() {
    return ok(settingsRepository.findFirstByOrderById().getIndexPage());
  }

  @PutMapping(value = "/")
  @Transactional
  public ResponseEntity<String> saveIndexPage(@RequestBody String indexPage) {
    settingsRepository.findFirstByOrderById().setIndexPage(indexPage);
    return ok("Saved");
  }
}
	