package testmybatis.controller;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testmybatis.configuration.ParamsConfig;
import testmybatis.model.Enable;
import testmybatis.model.User;
import testmybatis.model.UserVo;
import testmybatis.respository.UserMapper;

import javax.servlet.http.HttpServletRequest;
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

    @PostMapping(value = "/test2")
    public List<User> test2(@RequestParam String userName, @RequestBody User user, HttpServletRequest httpServletRequest) {
        return userMapper.findByName(user.getUserName());
    }

    @PostMapping("/test3")
    public Boolean test3(@RequestBody User user) {
        return userMapper.updateById(user);
    }

    @PostMapping(value = "/test4")
    public User test4(@RequestBody User user) {
        userMapper.insert(user);
        return user;
    }

    @PostMapping(value = "/test5")
    public List<User> test5(@RequestBody UserVo userVo) {
        List<User> users = userVo.getUserList();
        userMapper.inserts(users);
        return users;
    }

    @GetMapping("/test6")
    public User test6(@RequestParam Long id) {
        return userMapper.findUser(id);
    }
}
