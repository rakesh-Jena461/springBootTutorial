package com.myproject.New_spring_application.Services;
import com.myproject.New_spring_application.Entyty.WomenUser;
import com.myproject.New_spring_application.Repository.WomenUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WomenServiceImpl implements WomenService{
    @Autowired
    private WomenUserRepository womenUserRepository;

    @Override
    public WomenUser saveDataOfWomen_User(WomenUser womenUser) {
        if (womenUser == null){
            System.out.println("Data not found on database");
        }
        return womenUserRepository.save(womenUser);
    }

    @Override
    public List<WomenUser> getAllByWomenUser() {
        return womenUserRepository.findAll();
    }
}
