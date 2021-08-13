package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {

    /*
     *
     * HTTP – POST Method
     *      -	주소 창에 파라미터가 노출되지 않는다.
     *           	E.g. https://www.google.com/search
     *      -   Body에 데이터가 존재
     *      -   주소 창에 사용자의 요청사항이 노출되지 않는다.
     *          Get방식에서는 주소길이 제한이 있지만 POST에서는 그보다 길게 사용가능 (제한 존재)
     *      -	브라우저가 주소 캐시를 하지 못하는 특성이 있다.
     *
     * */

    // @RequestMapping(method = RequestMethod.POST, path = "postMethod")
    // 윗 줄과 @PostMapping("/postMethod")는 정확히 같은 역할을 한다.
    // 보다 간결한 코딩을 위해 PostMapping을 사용.

    // POST는
    // - HTML <form> 태그나
    // - ajax 검색 등에 사용한다.

    // json, xml, multipart-form / text-plain

    /*
    *
    * REST의 개념
    *   - HTTP 프로토콜에 있는 Method를 활용한 아키텍쳐 스타일이다.
    *   - HTTP Method를 통해서 Resource를 처리한다.
    *   - CRUD를 통한 Resource 조작을 할 때 사용한다.
    *
    *
    * REST API 정리 (HTTP Method / 동작 / URL 형태)
    *
    * GET       / 조회 (SELECT * READ)  /  /user/{id}
    * POST      / 생성 (CREATE)         /  /user
    * PUT/PATCH / 수정 (UPDATE) *CREATE /  /user
    * DELETE    / 삭제 (DELETE)         /  /user/{1}
    *
    * */

    @PostMapping("/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){


        return searchParam;
    }
}
