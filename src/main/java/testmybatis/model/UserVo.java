package testmybatis.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserVo implements Serializable {
    private List<User> userList;
}
