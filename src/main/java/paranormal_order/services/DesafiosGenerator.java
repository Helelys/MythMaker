package paranormal_order.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DesafiosGenerator {

    Random random = new Random();

    public String complicacoes() {
        String[] desafios = {
                "Nada", "Criatura de Sangue Surge",
                "Criatura de Morte", "Criatura de Energia",
                "Criatura de Conhecimento", "Inocentes em Perigo",
                "Outros Investigadores Tentam Atrapalhar", "Criminosos Surgem",
                "Emboscada", "Armadilhas",
                "Mentiroso Surge"
        };
        return "Complicações: " + desafios[random.nextInt(desafios.length)];
    }
}
