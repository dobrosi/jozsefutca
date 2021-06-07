package com.github.jozsefutca.kaputelefon.controller;

import com.github.jozsefutca.kaputelefon.repository.SettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import static org.springframework.http.ResponseEntity.ok;

@CrossOrigin
@Controller
public class IndexController {
  @Autowired private SettingsRepository settingsRepository;

  @GetMapping(value = "/")
  public ResponseEntity<byte[]> loadIndexPage() {
    HttpHeaders responseHeaders = new HttpHeaders();
    responseHeaders.add("Content-Encoding","gzip");
    return ok().headers(responseHeaders).body(settingsRepository.findFirstByOrderById().getIndexPage());
  }
}
	