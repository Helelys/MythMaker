package paranormal_order.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import paranormal_order.services.MissionGenerator;

@RestController
@RequiredArgsConstructor
public class MissionController {

    private final MissionGenerator missionGenerator;
}
