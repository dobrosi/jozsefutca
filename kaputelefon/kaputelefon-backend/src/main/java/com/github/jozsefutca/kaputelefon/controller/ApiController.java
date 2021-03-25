package com.github.jozsefutca.kaputelefon.controller;

import static org.springframework.http.ResponseEntity.ok;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.github.jozsefutca.kaputelefon.model.Gate;
import com.github.jozsefutca.kaputelefon.model.WifiSettings;
import com.github.jozsefutca.kaputelefon.repository.SettingsRepository;

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

  @GetMapping(value = "/wifi_settings")
  public ResponseEntity<WifiSettings> loadWifiSetting() {
    return ok(settingsRepository.findFirstByOrderById().getWifiSettings());
  }

  @PutMapping("/wifi_settings")
  @Transactional
  public ResponseEntity<String> saveWifiSetting(@RequestBody WifiSettings wifiSettings) {
    settingsRepository.findFirstByOrderById().setWifiSettings(wifiSettings);
    return ok("Saved");
  }

  @GetMapping(value = "/gate")
  public ResponseEntity<Gate> loadGate() {
    return ok(settingsRepository.findFirstByOrderById().getGate());
  }

  @PutMapping(value = "/gate")
  @Transactional
  public ResponseEntity<String> saveGate(@RequestBody Gate gate) {
    settingsRepository.findFirstByOrderById().setGate(gate);
    return ok("Saved");
  }
}
