package hello.my_springchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebSocket {

    @GetMapping("/testHwang")
    public static void testHwang() {

        System.out.println("Contoller request test");
    }
}
