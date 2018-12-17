package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Optional;

public class Controller {

    @GetMapping(value = "/helloex", produces = "application/json")
    public ResponseEntity<String> controller() {
      return ResponseEntity.ok("Salamou Alaykom V1") ;
    }

}
