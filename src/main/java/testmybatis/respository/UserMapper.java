package testmybatis.respository;

import org.apache.ibatis.annotations.Mapper;
import testmybatis.model.User;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();

}
