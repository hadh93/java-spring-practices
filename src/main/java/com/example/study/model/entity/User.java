package com.example.study.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

// Java는 변수이름을 CamelCase Notation을 사용. -> e.g. createdAt
// DB는 변수이름을 snake_case notation을 사용. -> e.g. created_at

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String account;
    private String email;
    private String phoneNumber; // DB VARCHAR -> Java String

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;


    // 1 : N
    @OneToMany(fetch=FetchType.LAZY, mappedBy = "user")
    private List<OrderDetail> orderDetailList;

}
