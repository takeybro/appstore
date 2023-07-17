package com.sr.store.mappertest;
import com.sr.store.entery.entity.user;
import com.sr.store.entery.mapper.user.userm;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class usermappertest {
    @Autowired
    private userm userm1;
    @Test
    public void insert(){
        user user2 = new user();
        user2.setUsername("timi");
        user2.setPassword("1234");
        Integer goal = userm1.insert(user2);
        System.out.println(goal);

    }
}
