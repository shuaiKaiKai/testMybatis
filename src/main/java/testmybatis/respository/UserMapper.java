package testmybatis.respository;

import org.apache.ibatis.annotations.Mapper;
import testmybatis.model.User;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();

    List<User> findByName(String userName);

    Boolean updateById(User user);

    int insert(User user);

    void inserts(List<User> userList);

    User findUser(Long id);
}
