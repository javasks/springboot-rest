package com.java.sks.rest.controller;


import com.java.sks.rest.model.Feature;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/feature")
public class FeatureController {

    @PostMapping( consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> createFeature(@RequestBody Feature feature){
        System.out.println("email:::"+  feature.getEmail());
        System.out.println("featurename:::"+  feature.getFeatureName());
        System.out.println("enable:::"+  feature.isEnable());
        return ResponseEntity.ok("Hello feature has been created");
    }

    @GetMapping(params = {"email","featureName"})
    public ResponseEntity<Object> getProductByOwnerEmailID(@RequestParam String email, @RequestParam String featureName){
        System.out.println("email:::"+email);
        System.out.println("featureName:::"+featureName);

        return ResponseEntity.ok("fetched");
    }


}
