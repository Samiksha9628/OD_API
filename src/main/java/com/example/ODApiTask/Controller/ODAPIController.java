package com.example.ODApiTask.Controller;

import com.example.ODApiTask.Service.ODApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
public class ODAPIController {

    @Autowired
    ODApiService odApiService;

    @GetMapping(value = "/odapi")
    public ResponseEntity<String> index() throws IOException {
        return new ResponseEntity<>(odApiService.getResponseData(), HttpStatus.OK);
    }
}
