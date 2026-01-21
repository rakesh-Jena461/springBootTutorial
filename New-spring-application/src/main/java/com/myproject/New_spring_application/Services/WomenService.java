package com.myproject.New_spring_application.Services;

import com.myproject.New_spring_application.Entyty.WomenUser;

import java.util.List;

public interface WomenService {
    WomenUser saveDataOfWomen_User(WomenUser womenUser);

    List<WomenUser> getAllByWomenUser();
}
