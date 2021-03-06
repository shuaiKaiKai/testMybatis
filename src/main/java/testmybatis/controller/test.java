package testmybatis.controller;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testmybatis.configuration.ParamsConfig;
import testmybatis.model.Enable;
import testmybatis.model.User;
import testmybatis.model.UserVo;
import testmybatis.respository.UserMapper;
import testmybatis.test.testaop.LogAspects;
import testmybatis.test.testaop.MathCalculator;

import javax.servlet.http.HttpServletRequest;
import javax.xml.soap.SOAPPart;
import java.util.*;
import java.util.stream.Collectors;

@RestController
public class test {

    @Autowired
    private LogAspects logAspects;

    @Autowired
    private MathCalculator mathCalculator;

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

    @GetMapping("/test7")
    public void testAop() {
        mathCalculator.div(6, 3);
    }
//    public static void main(String[] args) {
//
//        // list转成map
//        Map<Long, User> list1 = list.stream().collect(Collectors.toMap(User :: getId, a -> a, (k1, k2) -> k1));
//        // list去重
//        list.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparingLong(User::getId))), ArrayList::new));
//    }

    public static void main(String[] args) {
        Long id = 10L;
        System.out.println(id.hashCode());

    }
}
