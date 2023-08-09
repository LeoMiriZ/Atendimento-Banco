# Atendimento-Banco
Exercício em Java utilizando fila (=queue)

## Proposta

Escreva um programa em Java que simule uma agência de banco que possua três caixas atendendo
uma fila única de clientes, de forma a determinar o tempo médio de espera do cliente na fila, para
cada transação realizada (conforme tabela abaixo). À medida que qualquer um dos caixas fique livre,
o primeiro cliente da fila o utiliza. Quando o cliente entra na fila, o horário é anotado. Quando ele
sai, verifica-se o tempo que ele aguardou. O tempo que o cliente vai demorar no caixa vai depender
da transação a ser realizada. Na simulação, essa transação deverá ser aleatória e escolhida na tabela
abaixo. Use um cronômetro para simular o tempo. Quando terminar o expediente (a ser definido
pelo usuário e controlado pelo cronômetro), o processo de atendimento é imediatamente
interrompido. Além de mostrar o tempo médio de espera do cliente na fila, mostre quantas vezes
cada transação foi feita, quantos clientes foram atendidos e quantos clientes não foram atendidos
(os que estavam na fila na hora que terminou o expediente).

<b>Transação - Código - Tempo</b>

Saldo -  0 - 10

Saque - 1 -  20

Aplicação - 2 - 30

Extrato semanal - 3 - 40

Extrato mensal - 4 - 50

Pagamento de conta com dinheiro - 5 - 60

Pagamento de conta com cheque - 6 - 70

Pagamento de conta com saque - 7 - 80
