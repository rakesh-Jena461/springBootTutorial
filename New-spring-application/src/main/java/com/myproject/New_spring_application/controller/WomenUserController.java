package com.myproject.New_spring_application.controller;
import com.myproject.New_spring_application.Entyty.WomenUser;
import com.myproject.New_spring_application.Services.WomenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class WomenUserController {

    @Autowired
    private WomenService womenService;

    @PostMapping("/api/saveData/Of/WomenUser")
    public WomenUser saveDataOfWomen_User(@RequestBody WomenUser womenUser){
        return womenService.saveDataOfWomen_User(womenUser);
    }
    @GetMapping("/api/getAllByWomenUser")
    public List<WomenUser> getAllByWomenUser(){
        return womenService.getAllByWomenUser();
    }
}
