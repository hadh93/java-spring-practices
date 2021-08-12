package com.example.study.model;

public class SearchParam {

    // 모델에 필요한 정보를 아래 선언한다.

    private String account;
    private String email;
    private int page;

    // getter-setter는 Code-Generate- Getters and Setters에서 간편히 생성 가능하다.
    // 이하는 자동생성된 get/setters.

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
}
