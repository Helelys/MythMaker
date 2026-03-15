# MythMaker

Uma incrível ferramenta para auxiliar na construção de narrativas para jogar RPG de mesa. Como ferramentas para criar NPCs, missões e afins.

## Funcionalidades

- Gerar NPCs
- Gerar Missões
- Gerar Desafios

## Funcionalidades Futuras

- Gerar Itens
- Gerar Cidades/Vilas
- Gerar Lugares
- Gerar Encontros Aleatórios

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
- **URL:** `http://localhost:8080/gerador/missao`
- **Método:** `GET`
- **Descrição:** Gera uma missão aleatória, com descrição, objetivos e causa.

### Gerar Desafio
- **URL:** `http://localhost:8080/gerador/desafio`
- **Método:** `GET`
- **Descrição:** Gera um desafio aleatório.

## Tecnologias Utilizadas
- Java
- Spring Boot