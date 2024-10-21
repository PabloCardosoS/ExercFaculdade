Exercício sobre Associação entre Classes
– Mercado –
Crie um projeto no BlueJ. Crie (neste projeto) as classes solicitadas.
Classe Data:
• uma data possui um dia, um mês e um ano
• crie um construtor que recebe parâmetros para inicializar todos os
atributos
• crie o método toString e os métodos GET e SET dos atributos
Classe Produto:
• um produto possui um nome, um preço e uma data de validade
(objeto do tipo Data)
• crie um construtor que recebe parâmetros para inicializar todos os
atributos
• crie o método toString e os métodos GET e SET dos atributos
• crie um método chamado verificaProdutoVencido, que recebe uma
Data por parâmetro. Este método compara a data recebida por
parâmetro com a data de vencimento do produto, retornando
verdadeiro caso o produto esteja vencido naquela data e falso caso
contrário
Classe Prateleira:
• uma prateleira pode armazenar 3 produtos
• crie um construtor que recebe parâmetros para inicializar todos os
atributos
• crie um construtor que não recebe parâmetros (ou seja, uma
prateleira criada sem produtos)
• crie os métodos de acesso dos atributos (GET e SET)
• crie um método chamado produtoMaisCaro, que retorna o
produto mais caro da prateleira (caso haja produtos). Atenção: este
método retorna o produto mais caro, ou seja, um objeto do tipo
Produto
• crie o método toString
Classe Mercado:
• um mercado possui 2 prateleiras
• crie um construtor que recebe parâmetros para inicializar todos os
atributos
• crie os métodos GET dos atributos (não é necessário fazer SET)
• crie o método mediaValorProdutos, que retorna a média do preço
dos produtos que estão nas prateleiras do mercado. Atenção:
algumas prateleiras podem ter 1, 2 ou até mesmo não ter produtos
Classe Principal:
Nesta classe, crie o método main. No main, faça o que se pede:
• crie uma prateleira com 3 produtos, conforme listagem abaixo:
o Produto 1: amaciante, preço solicitado pelo Teclado,
validade 10/4/2014
o Produto 2: creme dental, preço solicitado pelo Teclado,
validade 5/5/2015
o Produto 3: leite condensado, preço solicitado pelo
Teclado, validade 4/12/2012
Atenção: garanta que o preço de cada produto será maior
do que zero
• crie uma prateleira sem produto algum. Em seguida, insira nesta
prateleira o produto "cortina", que custa R$167,98 e tem data de
validade 13/10/2025
• crie um mercado com estas duas prateleiras
• mostre na tela as informações dos produtos vencidos, supondo a
data 25/04/2023
• imprima as informações do produto mais caro do mercado
• imprima a média de preço dos produtos do mercado

