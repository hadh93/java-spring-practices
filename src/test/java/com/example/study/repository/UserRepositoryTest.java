package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends StudyApplicationTests {

    // Dependency Injection (DI)는 @Autowired를 이용함.
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        // String sql = insert into user (%s, %s, %d) value (account, email, age);
        User user = new User();
        user.setAccount("TestUser01");
        user.setEmail("TestUser01@gmail.com");
        user.setPhoneNumber("010-1111-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin");

        User newUser = userRepository.save(user); // DB의 'CREATE' 동작
        System.out.println("newUser: "+newUser);
    }

    @Test
    @Transactional
    public void read(){
        Optional<User> user = userRepository.findById(5L);

        user.ifPresent(selectUser ->{
            selectUser.getOrderDetailList().forEach(detail -> {
                System.out.println(detail.getItem());
            });
        });
    }

    @Test
    public void update(){
        Optional<User> user = userRepository.findById(2L); // ID에 의한 SELECT문에 해당함.
        user.ifPresent(selectUser ->{ // Id(PK)로 접근했기 때문에, 객체 추가가 아니라 수정으로 진행됨
            selectUser.setAccount("PPPP");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("update method()");
            userRepository.save(selectUser);

        });
    }

    @Test
    @Transactional // 쿼리의 작동여부만 확인하고 실제로 테이블에 반영하지는 않게 하는 annotation.
    public void delete(){
        Optional<User> user = userRepository.findById(4L);

        //Assert.assertTrue(user.isPresent());
        user.ifPresent(selectUser ->{
            userRepository.delete(selectUser);
        });

        Optional<User> deleteUser = userRepository.findById(4L);
        if (deleteUser.isPresent()){
            System.out.println("데이터 존재 : "+deleteUser.get());
        } else{
            System.out.println("데이터 없음 (삭제됨)");
        }
        //Assert.assertFalse(deleteuser.isPresent());
    }

}
