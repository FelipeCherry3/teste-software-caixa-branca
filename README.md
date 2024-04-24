# teste-software-caixa-branca

# Problemas e Erros Identificados

## 1. Falta de Tratamento de Exceção:
O código captura exceções, mas não faz nada além de imprimir uma mensagem de erro. É importante adicionar tratamento adequado para lidar com as exceções de forma apropriada.

## 2. Problema de Segurança:
Construção de query SQL utilizando concatenação de strings torna o código vulnerável a injeção de SQL. É preferível utilizar PreparedStatement para evitar esse tipo de problema.

## 3. Nomenclatura e Organização
O Código não apresenta uma nomeação para suas variáveis e não possui organização, prejudicando o funcionamento e a manutenção do código

## 4.Conexão com o banco
O Código não fecha as conexões com o banco, prejudicando o desempenho e tornando novamente o código vulnerável

# OS NÓS ESTÃO COMENTADOS NO CÓDIGO => [User.java](https://github.com/FelipeCherry3/teste-software-caixa-branca/blob/main/qtsCaixaBranca/src/main/java/facens/qtscaixabranca/User.java)

# Cenários Identificados

## Cenário 1 (conexão com o banco funciona, login e senha corretos)
1 -2 -3 -4 -6 -7 -8 - 9 - 12

## Cenário 2 (conexão com o banco não funciona)
1 - 2 - 3 - 5 (Sem tratamento)

## Cenário 3 (conexão com o banco funciona, login e senha incorretos)
1 - 2 - 3 - 4 - 6 - 7 - 8 - 10 - 11 - 12 (Sem tratamento)

## Cenário 4 (conexão com o banco funciona, login correto senha incorreta)
1 - 2 - 3 - 4 - 6 - 7 - 8 - 10 - 11 - 12 (Sem tratamento)

![qtscaixabranca](https://github.com/FelipeCherry3/teste-software-caixa-branca/assets/118016424/172c7b77-198f-479d-bebc-c55d7aa7a77f)

# V(G) = 14(arestas) - 12(nós) + 2
# V(G) = 3(nós predicados) + 1
# V(G) = 4 


# V(G) = 3(Nós Predicados) + 1
