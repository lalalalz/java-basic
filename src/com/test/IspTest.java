package com.test;

import com.company.객체와_자료구조.solid.isp.BoyFriend;
import com.company.객체와_자료구조.solid.isp.Man;
import com.company.객체와_자료구조.solid.isp.Son;
import org.junit.jupiter.api.Test;

public class IspTest {

    @Test
    void 여자친구() {
        BoyFriend boyFriend = new Man();

        boyFriend.기념일챙기기();
        boyFriend.키스하기();


        // 접근할 수 없음
        // 여자친구 입장에서는 남자친구 역할만을 안다.
        // boyFriend.용돈드리기();
        // boyFriend.효도하기();
    }

    @Test
    void 엄마() {
        Son son = new Man();

        son.용돈드리기();
        son.효도하기();

        // 접근할 수 없음
        // 엄마 입장에서는 아들의 역할만을 안다.
        // son.기념일챙기기();
    }

}
