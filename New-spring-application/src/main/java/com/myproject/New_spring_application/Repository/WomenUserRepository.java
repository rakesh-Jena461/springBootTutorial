package com.myproject.New_spring_application.Repository;


import com.myproject.New_spring_application.Entyty.WomenUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WomenUserRepository extends JpaRepository<WomenUser,Long> {
}
