package paranormal_order.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MissionGenerator {
    Random random = new Random();

    String[] informante = {
            "Sobrevivente/Testemunha", "Policial", "Ocultista", "Inquisidores"};


}
