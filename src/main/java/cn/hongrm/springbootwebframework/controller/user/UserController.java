package cn.hongrm.springbootwebframework.controller.user;

import cn.hongrm.springbootwebframework.po.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * created by hongrm on 2017/11/18 20:26
 */
@RestController
public class UserController {
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        System.out.println("id is "+id);
        if (id != 1){
            return new User(3,"hah",23);
        }
        return new User(1,"Hello world",18);
    }

}
