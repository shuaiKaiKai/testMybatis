package testmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import testmybatis.configuration.ParamsConfig;
import testmybatis.model.User;
import testmybatis.respository.UserMapper;

import java.util.List;

@RestController
public class test {

    @Autowired
    private ParamsConfig paramsConfig;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/test")
    public String test() {
        return paramsConfig.getName();
    }

    @GetMapping("/test1")
    public List<User> test1() {
        return userMapper.findAll();
    }

}
