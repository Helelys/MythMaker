package paranormal_order.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import paranormal_order.services.NpcGenerator;

@RestController
@RequiredArgsConstructor
public class NpcController {

    private final NpcGenerator npcGenerator;

    @GetMapping("npc")
    public String npc() {
        return npcGenerator.gerarPersonagem();
    }
}
