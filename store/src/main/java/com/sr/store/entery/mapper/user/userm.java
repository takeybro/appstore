package com.sr.store.entery.mapper.user;
import com.sr.store.entery.entity.user; // 导入实体类

public interface userm {
    /**
     * 插入用户
     * @param user1 要插入的用户对象
     * @return 受影响的行数
     */
    Integer insert(user user1);

    /**
     *
     * @param username
     * @return
     */
    user findByUsername(String username);

}