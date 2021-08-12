package com.example.study.controller;
import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // Localhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path="getMethod") // localhost:8080/api/getMethod
    public String getRequest(){
        // 단순한 GET 방식은 이렇게 작성하면 된다.
        return "Hi getMethod";
    }

    /*
    *
    * HTTP – GET Method
    *      -	주소 창에 파라미터가 노출된다.
    *           	E.g. https://www.abcdefg.com/api/?id=1234
    *      -	브라우저에서 주소에 대한 캐시가 이루어지므로, 정보를 얻을 때 사용한다.
    *
    * */

    @GetMapping("/getParameter") // localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameters(@RequestParam String id, @RequestParam(name = "password") String pwd){
        // 파라미터를 한 개 받는다면 getParameters에 @RequestParam으로 단일 파라미터를 정의해주면 된다.
        System.out.println("id: "+id);
        System.out.println("pw: "+pwd);
        return id + pwd;
    }

    // localhost:8080/api/multiParameter?account=abcd&email=study@gmail.com&page=10

    @GetMapping("/getMultiParameter") // 여러 정보를 파라미터로 받는다면, model을 정의하면 된다.
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        return searchParam; // model 자체를 return하면 자동으로 JSON으로 변환됨.

    }

}
