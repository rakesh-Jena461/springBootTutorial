package com.myproject.New_spring_application.Services;
import com.myproject.New_spring_application.Entyty.ManUser;
import com.myproject.New_spring_application.Repository.ManUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManServiceImpl implements ManService{
    @Autowired
    private ManUserRepository manUserRepository;

    @Override
    public ManUser saveMenUserData(ManUser manUser) {
        return manUserRepository.save(manUser);
    }

    @Override
    public List<ManUser> getDataFromDataBase() {
        return manUserRepository.findAll();

    }

    @Override
    public void deleteById(Long manId) {
        if (manId != null){
           manUserRepository.deleteById(manId);
        }
    }

    @Override
    public void findById(Long userId) {
        if (userId == null){
            throw new RuntimeException("user is null");
        }
        manUserRepository.findById(userId);
    }

    @Override
    public ManUser updateProduct(Long id, ManUser manUser) {
        ManUser manUser1 =
                manUserRepository.findById(id)
                        .orElseThrow(()->new RuntimeException("product not found"));
        manUser1.setFirstName(manUser.getFirstName());
        manUser1.setLastName(manUser.getLastName());

        return manUserRepository.save(manUser);
    }

}
