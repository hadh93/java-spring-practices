package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.OrderDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class OrderDetailRepositoryTest extends StudyApplicationTests {

    @Autowired OrderDetailRepository orderDetailRepository;

    @Test
    public void create(){

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderAt(LocalDateTime.now());


        //어떤 사람?
        //orderDetail.setUserId(5L);

        //어떤 상품?
        //orderDetail.setItemId(1L);
        OrderDetail newOrderDetail = orderDetailRepository.save(orderDetail);
    }
}
