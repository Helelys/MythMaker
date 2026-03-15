# MythMaker

Uma incrível ferramenta para auxiliar na construção de narrativas para jogar RPG de mesa. Como ferramentas para criar NPCs, missões e afins.

## Funcionalidades

- Gerar NPCs
- Gerar Missões

## Funcionalidades Futuras

- Gerar Itens
- Gerar Desafios

## Como utilizar

1. Clone o repositório: `git clone https://github.com/Helelys/MythMaker.git`
2. Navegue até o diretório do projeto
3. Extraia o arquivo `MythMaker.zip`
4. Execute em uma IDE

## Endpoints

### Gerar NPC
- **URL:** `http://localhost:8080/npc`
- **Método:** `GET`
- **Descrição:** Gera um NPC aleatório, com personalidade, status e perícia.

### Gerar Missão
- **URL:** `http://localhost:8080/missao`
- **Método:** `GET`
- **Descrição:** Gera uma missão aleatória, com descrição, objetivos e causa.

## Tecnologias Utilizadas
- Java
- Spring Boot