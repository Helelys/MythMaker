package paranormal_order.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import paranormal_order.services.DesafiosGenerator;
import paranormal_order.services.MissionGenerator;

@RestController
@RequestMapping("gerador")
@RequiredArgsConstructor
public class MissionController {

    private final MissionGenerator missionGenerator;
    private final DesafiosGenerator desafiosGenerator;

    @GetMapping("missao")
    public String gerarMissao(){
        return missionGenerator.gerarMissao();
    }

    @GetMapping("desafio")
    public String gerarDesafio(){return desafiosGenerator.complicacoes();}
}
