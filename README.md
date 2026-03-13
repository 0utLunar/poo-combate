# POO - Combate de Campeões

Este projeto é um desafio de programação orientada a objetos em Java.
O programa simula um combate entre dois campeões em turnos, onde cada campeão possui atributos de ataque, armadura e vida.

## 💡 Como funciona

1. O usuário informa os dados de dois campeões:

    * Nome
    * Vida inicial
    * Ataque
    * Armadura

2. Em seguida, é informado o número de turnos do combate.

3. A cada turno:

    * Os dois campeões atacam um ao outro.
    * O dano é calculado com base no ataque do oponente e na armadura do campeão.

4. Regras de dano:

    * O dano é calculado como **ataque do oponente - armadura do campeão**.
    * O campeão sempre perde **pelo menos 1 de vida**, mesmo que a armadura seja maior que o ataque.
    * A vida nunca pode ser menor que **0**.

5. Se um dos campeões morrer (vida = 0), o combate termina.

## 🧱 Estrutura do projeto

```
src
 ├─ application
 │   └─ Program.java
 │
 └─ entities
     └─ Champion.java
```

* **Program.java** → responsável pela execução do programa e interação com o usuário.
* **Champion.java** → classe que representa o campeão e contém a lógica de combate.

## 🛠 Tecnologias utilizadas

* Java
* Programação Orientada a Objetos (POO)

## ▶ Exemplo de execução

```
Digite os dados do primeiro campeão:
Nome: Darius
Vida inicial: 50
Ataque: 8
Armadura: 1

Digite os dados do segundo campeão:
Nome: Fiora
Vida inicial: 40
Ataque: 10
Armadura: 2

Quantos turnos você deseja executar? 2

Resultado do turno 1:
Darius: 41 de vida
Fiora: 34 de vida

Resultado do turno 2:
Darius: 32 de vida
Fiora: 28 de vida

FIM DO COMBATE
```

## 📚 Conceitos praticados

* Classes e objetos
* Construtores
* Encapsulamento
* Interação entre objetos
* Lógica de combate em turnos
