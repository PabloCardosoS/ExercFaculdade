Exercício sobre Associação entre Classes
– Funcionário –
Crie um projeto no BlueJ. Crie (neste projeto) as classes solicitadas:
- Classe Calculadora:
- Uma calculadora possui uma memória e uma cor;
- Quando uma calculadora é criada, a memória deve ser inicializada com 0 e a cor deve ser recebida por parâmetro
(construtor);
- Crie os métodos de acesso para os atributos da classe (get e set);
- Crie os métodos: soma, subtrai, multiplica e divide. Todos recebem dois valores (double) por parâmetro e
retornam o valor da operação realizada.
- Crie os métodos elevaAoQuadrado e elevaAoCubo. Ambos recebem apenas um valor (int) e retornam o valor da
operação realizada.
- Crie um método “imprimeInfo”, que não recebe parâmetros e simplesmente imprime as informações da
calculadora de maneira legível e organizada.
- Classe FuncionarioCaixa:
- Possui um nome, um endereço, um sexo e uma calculadora;
- Crie dois construtores: um não recebe parâmetros (inicializa os atributos com algum valor padrão); o outro
recebe os parâmetros para inicializar todos os atributos;
- Crie os métodos de acesso dos atributos desta classe (get e set);
- Crie os métodos soma, subtrai, multiplica, divide, elevaAoQuadrado e elevaAoCubo. Cada método destes deve
chamar o método correspondente da calculadora, retornando o valor obtido na operação.
- Crie um método chamado “imprimeInfo”, que não recebe parâmetros de entrada e imprime na tela as
informações da classe, inclusive da calculadora (sem as operações, apenas os atributos).
- Classe Empresa:
- Uma empresa tem um nome e dois funcionários do caixa;
- Crie três construtores: um que recebe todos os parâmetros para inicializar os atributos; outro que recebe apenas
o nome da empresa, inicializando os funcionários em null; outro que não recebe parâmetros, inicializando os
funcionários em null e o nome com algum valor padrão.
- Crie os métodos de acesso dos atributos desta classe (get e set);
- Crie um método “imprimeInfo”, que imprime as informações da classe.
- Classe Teste:
- Esta classe possui apenas o método “public static void main(String args[])”;
- Neste método, crie um objeto do tipo FuncionarioCaixa, chamado funcionario. Tudo que for necessário para criar
este objeto, deve ser solicitado pelo Teclado.
- Imprima o resultado das operações: 2+2, 5-4, 2x3, 6/3, 72, 83. As operações devem ser feitas através da
calculadora do objeto funcionário criado.
- Neste método, crie um objeto do tipo Empresa chamado empresa1, com nome solicitado pelo usuário via
Teclado, com o funcionário criado anteriormente e um novo funcionário que deve ser criado. Tudo que for
necessário para criar esta empresa (que já não tenha sido criado) deve ser solicitado pelo Teclado.
- Imprima as informações desta empresa