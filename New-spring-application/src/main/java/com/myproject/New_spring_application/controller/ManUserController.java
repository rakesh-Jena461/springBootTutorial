package com.myproject.New_spring_application.controller;
import com.myproject.New_spring_application.Entyty.ManUser;
import com.myproject.New_spring_application.Repository.ManUserRepository;
import com.myproject.New_spring_application.Services.ManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ManUserController {

    @Autowired
    private ManService manService;



    @PostMapping("/saveUserData")
    public ManUser saveData(@RequestBody ManUser manUser){
        return manService.saveMenUserData(manUser);
    }

    @GetMapping("/api/getData/From/DataBase")
    public List<ManUser> getDataFromDataBase(){
        return manService.getDataFromDataBase();
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Long manId){
        manService.deleteById(manId);

        return "delete successful";
    }

    @GetMapping("/findById/{id}")
    public String findById(@PathVariable("id") Long userId){
        manService.findById(userId);
        return "Successful";
    }

    @PutMapping("/updateProduct/{id}")
    public ResponseEntity<ManUser> updateProduct(@PathVariable("id") Long id,
                                                 @RequestBody ManUser manUser){
        ManUser manUser1 = manService.updateProduct(id,manUser);
        return ResponseEntity.ok(manUser1);
    }

}
