package com.msr.tacocloud.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yogahapriana
 * @created 27/02/2022 - 23.27
 */
@Controller
public class HomeController {

  @GetMapping("/")
  public String home() {
    return "home";
  }
}
