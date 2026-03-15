package paranormal_order.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NpcGenerator {

    Random random = new Random();

    String[] nomes = {
            "João", "Gabriel", "Lucas", "Mateus", "Pedro",
            "Rafael", "Gustavo", "Felipe", "Bruno", "Daniel",
            "Marcos", "André", "Rodrigo", "Fernando", "Ricardo",
            "Eduardo", "Diego", "Thiago", "Leandro", "Vinícius",
            "Paulo", "Roberto", "Marcelo", "Alexandre", "Leonardo",
            "Maria", "Ana", "Juliana", "Fernanda", "Patrícia",
            "Camila", "Amanda", "Larissa", "Beatriz", "Carolina",
            "Gabriela", "Letícia", "Renata", "Vanessa", "Aline",
            "Bianca", "Daniela", "Natália", "Priscila", "Tatiane",
            "Mariana", "Isabela", "Bruna", "Cristiane", "Elaine"
    };

    String[] sobrenomes = {
            "Silva", "Santos", "Oliveira", "Souza", "Rodrigues",
            "Ferreira", "Alves", "Pereira", "Lima", "Gomes",
            "Ribeiro", "Carvalho", "Almeida", "Lopes", "Soares",
            "Fernandes", "Vieira", "Barbosa", "Rocha", "Dias",
            "Monteiro", "Cardoso", "Reis", "Araújo", "Nascimento",
            "Correia", "Teixeira", "Cavalcanti", "Moura", "Freitas",
            "Batista", "Campos", "Farias", "Medeiros", "Peixoto",
            "Rezende", "Borges", "Machado", "Queiroz", "Duarte",
            "Moreira", "Pacheco", "Tavares", "Mendes", "Castro",
            "Azevedo", "Brito", "Neves", "Coelho", "Aguiar"
    };

    String[] ocupacao = {
            "Pedreiro", "Servente de Pedreiro", "Eletricista", "Encanador", "Pintor",
            "Carpinteiro", "Mecânico", "Motorista Particular", "Motorista de Uber", "Motoboy",
            "Entregador", "Vendedor", "Vendedor Ambulante", "Caixa", "Atendente",
            "Garçom", "Cozinheiro", "Auxiliar de Cozinha", "Padeiro", "Confeiteiro",
            "Açougueiro", "Frentista", "Segurança", "Vigilante", "Porteiro",
            "Zelador", "Faxineiro", "Diarista", "Lavador de Carros", "Desempregado",
            "Cabeleireiro", "Barbeiro", "Manicure", "Costureira", "Agricultor",
            "Pescador", "Marceneiro", "Serralheiro", "Técnico de Informática", "Programador",
            "Designer Gráfico", "Fotógrafo", "Professor", "Professor Particular", "Enfermeiro",
            "Cuidador de Idosos", "Babá", "Taxista", "Caminhoneiro", "Empresário"};

    public String gerarPersonagem() {
        int idade = random.nextInt(50) + 14;
        String atributos = gerarAtributo();
        return "Nome: " + gerarNome() + "\n" +
                "Idade: " + idade + "\n" +
                "Ocupação: " + ocupacao[random.nextInt(ocupacao.length)] +
                "\n" + atributos +
                "\n" + gerarPersonalidade();
    }

    private String gerarNome() {
        return nomes[random.nextInt(nomes.length)] + " " + sobrenomes[random.nextInt(sobrenomes.length)];
    }

    private String gerarAtributo() {
        int forca = 1, destreza = 1, vigor = 1, presenca = 1, inteligencia = 1;
        
        for (int i = 1; i <= 4; i++) {
            int aleatorio = random.nextInt(5) + 1;
            
            if (aleatorio == 1) {
                if (forca < 3) {
                    forca++;
                } else {
                    i--;
                }
            } else if (aleatorio == 2) {
                if (destreza < 3) {
                    destreza++;
                }  else {
                    i--;
                }
            } else if (aleatorio == 3) {
                if (vigor < 3) {
                    vigor++;
                } else {
                    i--;
                }
            } else if (aleatorio == 4) {
                if (presenca < 3) {
                    presenca++;
                } else {
                    i--;
                }
            } else {
                if (inteligencia < 3) {
                    inteligencia++;
                } else {
                    i--;
                }
            }
        }

        String pericia = "";

        if (forca > destreza && forca >= 2) {
            pericia = "Luta + 5";
        } else if (destreza > forca && destreza >= 2) {
            pericia = "Pontaria + 5";
        } else if (destreza == forca && destreza >= 2 && forca >= 2) {
            pericia = "Luta + 5 \nPontaria + 5";
        } else {
            pericia = "Nenhuma perícia relevante";
        }

        return "\nForça: " + forca + " \n" +
                "Destreza: " + destreza + " \n" +
                "Vigor: " + vigor + " \n" +
                "Presença: " + presenca + " \n" +
                "Inteligencia: " + inteligencia + " \n\n" +
                pericia;
    }

    private String gerarPersonalidade() {

        String[] personalidades = {
                "Extrovertido", "Introvertido", "Calmo", "Ansioso", "Otimista",
                "Pessimista", "Carismático", "Tímido", "Impulsivo", "Racional",
                "Criativo", "Pragmático", "Teimoso", "Empático", "Competitivo"};

        int numeroAleatorio =  random.nextInt(personalidades.length);
        int numeroAleatorio2 = random.nextInt(personalidades.length);

        if (numeroAleatorio == numeroAleatorio2) {
            return "\nPersonalidade: " + personalidades[numeroAleatorio];
        } else {
            return "\nPersonalidade: " + personalidades[numeroAleatorio] + ", " + personalidades[numeroAleatorio2];
        }
    }
}
