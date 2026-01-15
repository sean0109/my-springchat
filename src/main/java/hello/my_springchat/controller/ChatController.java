package hello.my_springchat.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class ChatController {

    @GetMapping({"/", "/enter"})
    public String enter() {
        return "enter";
    }

    @PostMapping("/chat")
    public String chat(@RequestParam(name = "nickname", required = false) String nickname) {
        log.info("/chat Controller 진입");
        log.info("nickname: {}", nickname);

        if (!StringUtils.hasText(nickname)) {
            return "redirect:/enter";
        }

        return "chat";
    }
}
