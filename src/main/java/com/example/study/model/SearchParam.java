package com.example.study.model;


import lombok.AllArgsConstructor;
import lombok.Data;


/* 아래의 두 줄의 annotation이 'Lombok'이라는 기술로,
 * Getter와 Setter들을 작성할 필요 없도록 해주어 코드의 가독성을 매우매우 높여준다.
 *
 * 단, 다음과 같은 세팅이 필요하다.
 *
 * 1. 다음 두 줄을 build.gradle에 추가한다
 *      - annotationProcessor 'org.projectlombok:lombok:1.18.20'
 *      - implementation 'org.projectlombok:lombok:1.18.20'
 *
 * 2. IntelliJ File -> Settings -> Build, Execution, Deployment
 *    -> Annotation Processors 에서 Enable Annotation Processors 체크하고 Apply & OK.
 *
 * */

@Data
@AllArgsConstructor // 왼쪽 Structure창에 Getters/Setters가 정상 작동하는 것을 확인.
public class SearchParam {

    // 모델에 필요한 정보를 아래 선언한다.
    private String account;
    private String email;
    private int page;

    // getter-setter는 Code-Generate- Getters and Setters에서 간편히 생성 가능하다.
    // 이하는 자동생성된 get/setters.
    /*
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    */
}
