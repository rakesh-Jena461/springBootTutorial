package com.myproject.New_spring_application.Services;

import com.myproject.New_spring_application.Entyty.ManUser;

import java.util.List;

public interface ManService {
    ManUser saveMenUserData(ManUser manUser);

    List<ManUser> getDataFromDataBase();

    void deleteById(Long manId);

    void findById(Long userId);

    ManUser updateProduct(Long id, ManUser manUser);
}
