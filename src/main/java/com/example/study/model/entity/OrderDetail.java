package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // order_detail에 자동 연동됨
@ToString(exclude = {"user","item"})
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime orderAt;
    
    // N : 1
    @ManyToOne
    private User user; // hibernate 사용시? 반드시 id가 아니라 객체 자체를 받아야 함.

    // N : 1
    @ManyToOne
    private Item item;


}
