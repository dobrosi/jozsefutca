package com.github.jozsefutca.kaputelefon.controller;

import com.github.jozsefutca.kaputelefon.model.Intercom;
import com.github.jozsefutca.kaputelefon.model.WifiSettings;
import com.github.jozsefutca.kaputelefon.repository.SettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import static org.springframework.http.ResponseEntity.ok;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ApiController {
  @Autowired private SettingsRepository settingsRepository;

  @GetMapping("/restart")
  public ResponseEntity<String> restart() {
    return ok("OK restart");
  }

  @GetMapping("/testcall")
  public ResponseEntity<String> testCall() {
    return ok("OK testcall");
  }

  @GetMapping("/mac")
  public ResponseEntity<String> getMac() {
    return ok("OK mac");
  }

  @GetMapping("/factory_reset")
  public ResponseEntity<String> factoryReset() {
    return ok("OK factory_reset");
  }

  @GetMapping("/appversion")
  public ResponseEntity<String> getAppVersion() {
    return ok("OK appversion");
  }

  @GetMapping(value = "/auth")
  public ResponseEntity<WifiSettings> loadWifiSetting() {
    return ok(settingsRepository.findFirstByOrderById().getWifiSettings());
  }

  @PutMapping("/auth")
  @Transactional
  public ResponseEntity<String> saveWifiSetting(@ModelAttribute WifiSettings wifiSettings) {
    settingsRepository.findFirstByOrderById().setWifiSettings(wifiSettings);
    return ok("Saved");
  }

  @GetMapping(value = "/icom")
  public ResponseEntity<Intercom> loadIntercom() {
    return ok(settingsRepository.findFirstByOrderById().getIntercom());
  }

  @PutMapping(value = "/icom")
  @Transactional
  public ResponseEntity<String> saveIntercom(@ModelAttribute Intercom intercom) {
    settingsRepository.findFirstByOrderById().setIntercom(intercom);
    return ok("Saved");
  }

  @PutMapping(value = "/ota")
  @Transactional
  public ResponseEntity<String> ota(final HttpServletRequest request) {
    return ok("OK ota");
  }
}
