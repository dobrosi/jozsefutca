package com.github.jozsefutca.kaputelefon.controller;

import static org.springframework.http.ResponseEntity.ok;
import javax.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@Transactional
public class AppController {
  @GetMapping("/test")
  public ResponseEntity<String> list() {
    return ok("OK");
  }
}
