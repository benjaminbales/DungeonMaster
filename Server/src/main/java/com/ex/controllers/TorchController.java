package com.ex.controllers;

import com.ex.pojos.items.Torch;
import com.ex.services.TorchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TorchController {

    private TorchService service;

    public TorchController() {
    }

    @Autowired
    public TorchController(TorchService torchService) {
        this.service = torchService;
    }
    /*
        This requests a comment of some kind. This contrller controller and interfaces
        between the service and the repository for your viewing pleasure
         */
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/Torches")
    public @ResponseBody ResponseEntity getAllTorches(){
        List<Torch> torches = service.getAllTorches();
        return new ResponseEntity(torches.get(0), HttpStatus.OK);
    }
}