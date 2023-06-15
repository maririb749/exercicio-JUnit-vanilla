
<h1 align="center">Exercício: JUnit vanilla</h1>


### Diagrama de classes:
###

![financing](https://github.com/maririb749/exercicio-JUnit-vanilla/assets/85500087/5e2908e5-96ed-4f74-9aae-a0f84b00f5bd)

###

## Um financiamento possui três dados:
<ul>
  <li>totalAmont: valor total de dinheiro financiado</li>
  <li>income: renda mensal do cliente que está financiando</li>
  <li>months: número de meses do financiamento</li>
</ul>

###

## E dois métodos:

<ul>
  <li>entry: entrada do financiamento, igual a 20% do valor total</li>
  <li>quota: prestação mensal do financiamento (sem juros)</li>
</ul>

###

Há ainda uma regra: o valor da prestação não pode ser maior que metade da renda mensal do cliente. A seguir alguns exemplos de financiamentos para ajudar a entender a regra:

###

Exemplo 1: { totalAmount: 100000, income: 2000, months: 20 }
Este exemplo é <em>**INVÁLIDO**<em> porque com esses dados a entrada seria 20000 e a prestação seria 4000. Porém a prestação não pode passar de 1000, que é a metade da renda do cliente.

Exemplo 2: { totalAmount: 100000, income: 2000, months: 80 }
Já este exemplo é <em>**VÁLIDO**<em> porque a entrada seria 20000 e a prestação seria 1000. Neste caso, a prestação é menor ou igual a metade da renda do cliente, satisfazendo a regra.

 ###
  
## Você deve implementar os seguintes testes para validar esta classe (total = 10 testes):
  
## **Construtor**
  <ul>
  <li>Deve criar o objeto com os dados corretos quando os dados forem válidos</li>
  <li>Deve lançar IllegalArgumentException quando os dados não forem válidos</li>
</ul>
  
###  
  ## **setTotalAmount**
  <ul>
  <li>Deve criar o objeto com os dados corretos quando os dados forem válidos</li>
  <li>Deve lançar IllegalArgumentException quando os dados não forem válidos</li>
</ul>
  
  ###
  
 ## **setIncome**
  
  <ul>
  <li>Deve criar o objeto com os dados corretos quando os dados forem válidos</li>
  <li>Deve lançar IllegalArgumentException quando os dados não forem válidos</li>
 </ul>
  
  ###
  
  ## **setMonths**
  
  ###
  
  <ul>
  <li>Deve criar o objeto com os dados corretos quando os dados forem válidos</li>
  <li>Deve lançar IllegalArgumentException quando os dados não forem válidos</li>
 </ul>
  
  ###
  
  ## **entry**
  
  ###
  
  <ul>
  <li>Deve calcular corretamente o valor da entrada</li>
 </ul>
  
  ###
  
 ##  **quota**
  
  ###
  
 <ul>
  <li>Deve calcular corretamente o valor da prestação</li>
</ul>
  
  
  
  
  
















  
  









