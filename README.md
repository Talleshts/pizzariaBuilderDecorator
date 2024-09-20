# Projeto Pizzaria com Builder e Decorator

Este projeto em Java implementa um sistema de construção de pizzas utilizando os padrões de projeto Builder e Decorator. O sistema permite a criação de diferentes tipos de pizzas e a adição de ingredientes extras de maneira flexível e organizada.

## Estrutura do Projeto

A estrutura do projeto é composta pelas seguintes classes:

- **Principal**: Classe principal que executa o programa e demonstra a funcionalidade de construção de pizzas.
- **builder**: Contém classes responsáveis pela construção das pizzas (`PizzaBuilder`, `PizzaMargheritaBuilder`, `PizzaCalabresaBuilder`, `Pizzaiolo`).
- **componente**: Define a estrutura da pizza (`Pizza`, `PizzaSimples`).
- **decorator**: Implementa os ingredientes extras (`Cebola`, `Pepperoni`, `QueijoExtra`, `IngredienteDecorator`).

## Funcionalidades

- **Construção de Pizzas**: O sistema permite construir pizzas Margherita e Calabresa com suas respectivas massas e queijos.
- **Adição de Ingredientes Extras**: Após a construção da pizza base, é possível adicionar ingredientes extras como cebola, pepperoni e queijo extra.
- **Cálculo do Preço**: O preço total da pizza é atualizado automaticamente conforme os ingredientes são adicionados.

## Como Usar

1. Clone ou baixe o repositório.
2. Abra o projeto em sua IDE preferida.
3. Execute a classe `Principal` para ver a construção das pizzas e a adição dos ingredientes.

### Exemplo de Execução

Ao executar o programa, você verá a seguinte saída:

```
Pizza: Massa de Margherita, Molho de Tomate, Queijo, Cebola
Preço: R$ 10.50
Pizza: Massa de Calabresa, Molho de Tomate, Queijo, Pepperoni
Preço: R$ 13.50
```

## Detalhes de Implementação

### Classes de Builder

- **PizzaBuilder**: Classe abstrata que define os métodos para construir uma pizza (preparar massa, adicionar molho e queijo).
- **PizzaMargheritaBuilder** e **PizzaCalabresaBuilder**: Implementações específicas do `PizzaBuilder` para construir pizzas Margherita e Calabresa.

### Classe `Pizzaiolo`

- A classe `Pizzaiolo` orquestra a construção da pizza utilizando um builder específico.

### Classes de Componente

- **Pizza**: Classe abstrata que define a estrutura básica da pizza, com métodos para obter descrição e preço.
- **PizzaSimples**: Implementação concreta da classe `Pizza`, representando uma pizza básica.

### Classes de Decorator

- **IngredienteDecorator**: Classe abstrata que permite adicionar ingredientes extras às pizzas.
- **Cebola**, **Pepperoni**, **QueijoExtra**: Implementações do `IngredienteDecorator` que adicionam funcionalidades específicas às pizzas.

## Requisitos

- Java 17 ou superior.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request ou relatar problemas.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
