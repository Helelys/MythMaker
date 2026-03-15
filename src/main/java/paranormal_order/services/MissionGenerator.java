package paranormal_order.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MissionGenerator {
    Random random = new Random();

    private String gerarInformante() {
        String[] informante = {
                "Sobrevivente/Testemunha", "Policial", "Ocultista", "Inquisidores"};
        return "Toda missão é um caso com um começo... quem descobriu o caso: " + informante[random.nextInt(informante.length)];
    }

    private String responsavel() {
        String[] responsavel = {
                "Criatura de sangue", "Criatura de Morte", "Criatura de Conhecimento", "Criatura de Energia", "Ordem de Cultistas", "Criminoso", "Ocultista Poderoso", "Item Amaldiçoado", "Civil Curioso", "Grupo Convicto"};
        return "Principal responsável pelo surgimento do caso: " +  responsavel[random.nextInt(responsavel.length)];
    }

    private String acao() {
        String[] acao = {
                "Buscando Sacrifícios", "Invocando Criatura de Sangue",
                "Invocando Criatura de Morte", "Invocando Criatura de Conhecimento",
                "Invocando Criatura de Energia", "Caçando Agentes (Jogadores ou NPCs)",
                "Coletando Itens Paranormais", "Aterrorizando",
                "Completando um Ritual"
        };

        int acao1 = random.nextInt(acao.length);
        int acao2 = random.nextInt(acao.length);

        if (acao[acao1].equals(acao[acao2])) {
            return "O que foi feito para que o caso acontecesse: " + acao[acao1];
        } else {
            return "O que foi feito para que o caso acontecesse: " + acao[acao1] + ", " + acao[acao2];
        }
    }

    private String local() {
        String[] local = {
                "Hospital", "Ilha remota", "Pequeno vilarejo",
                "Becos e ruelas de cidade grande", "Prédio abandonado", "Condomínio fechado",
                "Escola", "Prédio histórico", "Zona rural da cidade",
                "Subterrâneo/Esgotos", "Floresta", "Deserto",
                "Pântano", "Montanhas", "Cemitério",
                "Cidade Grande", "Cidade pequena"
        };

        return "Onde o caso se passa: " + local[random.nextInt(local.length)];
    }

    private String situacaoDoLocal() {
        String[] situacao = {
                "Abandonado", "Levemente ocupado", "Ocupado", "Interditado"
        };

        return "Situação do local: " +  situacao[random.nextInt(situacao.length)];
    }

    private String regiao() {
        String[] regiao = {
          "Norte", "Nordeste", "Centro-Oeste", "Sudeste", "Sul"
        };

        if (regiao[random.nextInt(regiao.length)].equals("Norte")) {
            String[] estado = {
                    "Acre", "Amapá", "Amazonas",
                    "Pará", "Rondônia", "Tocantins"
            };

            return "A missão será no: " +  estado[random.nextInt(estado.length)];
        } else if (regiao[random.nextInt(regiao.length)].equals("Nordeste")) {
            String[] estado = {
                    "Alagoas", "Bahia", "Ceará",
                    "Maranhão", "Paraíba", "Pernambuco",
                    "Piauí", "Rio Grande do Norte", "Sergipe"
            };

            return "A missão será no: " +  estado[random.nextInt(estado.length)];
        } else if (regiao[random.nextInt(regiao.length)].equals("Centro-Oeste")) {
            String[] estado = {
                    "Goiás", "Mato-Grosso", "Mato Grosso do Sul", "Distrito Federal"
            };

            return "A missão será no: " +   estado[random.nextInt(estado.length)];
        } else if (regiao[random.nextInt(regiao.length)].equals("Sudeste")) {
            String[] estado = {
                    "Espírito Santo", "Minas Gerais", "Rio de Janeiro", "São Paulo"
            };

            return "A missão será no: " +  estado[random.nextInt(estado.length)];
        } else {
            String[] estado = {
                    "Paraná", "Santa Catarina", "Rio Grande do Sul"
            };

            return "A missão será no: "  +  estado[random.nextInt(estado.length)];
        }
    }

    public String gerarMissao() {
        return gerarInformante() + "\n" +
                responsavel() + "\n" +
                acao() + "\n" +
                local() + "\n" +
                situacaoDoLocal() + "\n" +
                regiao();
    }
}
