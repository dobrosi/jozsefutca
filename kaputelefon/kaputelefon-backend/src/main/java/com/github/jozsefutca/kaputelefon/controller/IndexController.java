package com.github.jozsefutca.kaputelefon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin
@Controller
public class IndexController {
  @GetMapping("/")
  public String index() {
    return "index";
  }
}
	