package com.test;

import com.company.polymorphism01.Animal;
import com.company.polymorphism01.Penguin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PenguinTest {

    @Test
    void test1() {
        Penguin pororo = new Penguin();

        pororo.name = "뽀로로";
        pororo.habitat = "남극";

        pororo.showName(); // 어머 내 이름은~
        pororo.showName("초보람보"); // 너 이름은 어쩌구
        pororo.showHabitat();

        Animal pingu = new Penguin();

        pingu.name = "핑구";
        // 오버라이딩의 경우는 상위 타입의 객체 참조 변수를 사용해도 하위 타입에서 오버라이딩한 메서드가 실행된다.
        pingu.showName();
    }

}