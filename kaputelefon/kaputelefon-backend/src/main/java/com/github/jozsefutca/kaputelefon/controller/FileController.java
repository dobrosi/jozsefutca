package com.github.jozsefutca.kaputelefon.controller;

import static org.springframework.http.ResponseEntity.ok;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.github.jozsefutca.kaputelefon.repository.SettingsRepository;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

@CrossOrigin
@RestController
@RequestMapping("/file")
public class FileController {
  @Autowired private SettingsRepository settingsRepository;

  @GetMapping(value = "/contacts")
  public ResponseEntity<String> loadContacts() {
    return ok(settingsRepository.findFirstByOrderById().getContacts());
  }

  @PutMapping(value = "/contacts")
  @Transactional
  public ResponseEntity<String> saveContacts(@RequestBody String contacts) {
    settingsRepository.findFirstByOrderById().setContacts(contacts);
    return ok("Saved");
  }

  @GetMapping(value = "/accounts")
  public ResponseEntity<String> loadAccounts() {
    return ok(settingsRepository.findFirstByOrderById().getAccounts());
  }

  @PutMapping(value = "/accounts")
  @Transactional
  public ResponseEntity<String> saveAccounts(@RequestBody String accounts) {
    settingsRepository.findFirstByOrderById().setAccounts(accounts);
    return ok("Saved");
  }

  @GetMapping(value = "/config")
  public ResponseEntity<String> loadConfig() {
    return ok(settingsRepository.findFirstByOrderById().getConfig());
  }

  @PutMapping(value = "/config")
  @Transactional
  public ResponseEntity<String> saveConfig(@RequestBody String config) {
    settingsRepository.findFirstByOrderById().setConfig(config);
    return ok("Saved");
  }

  @PutMapping(value = "/html")
  @Transactional
  public ResponseEntity<String> saveIndexPage(final HttpServletRequest request) throws IOException {
    settingsRepository.findFirstByOrderById().setIndexPage(request.getInputStream().readAllBytes());
    return ok("Saved");
  }
}
