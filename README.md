ENGENHARIA DE SOFTWARE III
 PLANEJAMENTO E DESENVOLVIMENTO DE UM SISTEMA WEB
  Jackson F. Magnabosco
Ciência da Computação – Universidade Regional Integrada do Alto Uruguai e das Missões Erechim (URI)
Caixa Postal 743 – 99709-910 –Erechim – RS – Brasil
jacksonmagnabosco@hotmail.com 



Resumo: O sistema desenvolvido tem como objetivo principal auxiliar no gerenciamento eficiente dos processos e nas tomadas de decisões, assim melhorando a administração, controle de clientes, funcionários, fornecedores, estoque e vendas de uma microempresa, proporcionando maior segurança, agilidade, produtividade e redução de custos. Este trabalho apresenta o desenvolvimento de um sistema de gerenciamento web onde foram utilizados, a metodologia orientada a objeto e as ferramentas Eclipse com a plataforma de desenvolvimento Java-EE, juntamente com o banco de dados, MySQL, frameworks JavaServer Faces, Primefaces, bootstrap, Hibernate, o Astah Community para modelagem dos diagramas UML(Unified Modeling Language) e o Trello com a metodologia Scrum para gerenciamento do projeto.

 

LISTA DE TABELAS 





Tabela 01- Descrição de caso de uso manter clientes..................................................11
Tabela 02- Descrição de caso de uso manter produto..................................................13
Tabela 03- Descrição do caso de uso efetuar login......................................................15
Tabela 04- Descrição do caso de uso manter funcionário............................................16
Tabela 05- Descrição do caso de uso cadastrar venda do produto...............................19 
Tabela 06- Descrição do caso de uso manter relatório………….................................21
 
LISTA DE ILUSTRAÇÕES 




Figura 01 – Diagrama geral de caso de uso................................................................   08
Figura 02 – Diagrama de caso de uso efetuar login....................................................   08
Figura 03 – Diagrama de caso de uso módulo gerente...............................................   09
Figura 04 – Diagrama de caso de uso módulo institucional........................................  09
Figura 05 – Diagrama de caso de uso módulo balconista............................................ 10
Figura 06 – Diagrama de caso de uso módulo administrador...................................... 10
Figura 07 – Diagrama de sequência manter login….……........................................... 23
Figura 08 – Diagrama de sequência manter cliente…….............................................  24
Figura 09 – Diagrama de sequência manter produto.…..............................................  25
Figura 10 – Diagrama de sequência manter funcionário……….…………………....  26
Figura 11 – Diagrama de sequência manter relatório………….…………………….  27
Figura 12 – Diagrama de classe……………….…………………………………….  28
Figura 13 – Diagrama entidade-relacionamento…………………………………….  29
Figura 14 – Diagrama de atividade do módulo administrativo.……………………..  30
Figura 15 – Diagrama de atividade módulo institucional...…………………………. 31
Figura 16 – Diagrama de atividade fazer login…....………………………………...  31
Figura 17 – Diagrama de atividade Módulo Balconista….……………………….…. 32
Figura 18 – Diagrama de atividade relatório………..…………………....…....…….  33
Figura 19 – Diagrama de atividade Módulo Gerente……………..…………………  34
Figura 20 – Diagrama de Componentes e Implantação….……………….…………  35
Figura 21 – Tela auteticação…………….…………………….………………..……  36
Figura 22 – Tela inicial……………....…..……..……………………………...…….  36
Figura 23 – Tela clientes……………………………..................................................  37
Figura 24 – Tela produtos……………………………................................................  37
Figura 25 – Tela fornecedores..……………………………….………………..……  38
Figura 26 – Tela funcionários…………....…..……..………………………………..  38
Figura 27 – Tela vendas.……………………………..................................................  39
Figura 28 – Tela relatório...…………………………..................................................  39
Figura 29 – Tela Sobre...……………………………………….………………..…… 40
Figura 30 – Tela contato...……………....…..……..…………………………………  41
Figura  31 - Tela FAQ...……………....………...…….…..…………………………………42
Figura  32 - Tela da arquitetura do sistema…...…….…..…………………………………43 

SUMÁRIO
1. Introdução	5
1.2 Objetivos	5
1.2.1 Objetivos específicos	5
1.3 Justificativa	6
2 Desenvolvimento	6
2.1 Levantamento de requisitos	6
2.2 Metodologia de análise	6
2.2.1 Descrição da UML	6
2.2.2 Descrição do gerenciamento	7
2.2.3 Descrição dos Usuários	7
3 Modulos	7
3.1 Perspectiva do Produto: Módulo Institucional	7
3.2 Perspectiva do Produto: Módulo Gerente	7
3.3 Perspectiva do Produto: Módulo Balconista	7
3.4 Perspectiva do Produto: Módulo Administrativo	7
4 Diagrama de Caso de Uso  ( Use Case)	8
4.1 Diagrama de Caso de uso geral	8
4.1.1 Efetuar login	8
4.1.2 Módulo Gerente	9
4.1.3 Módulo Institucional	9
4.1.4 Módulo Balconista	10
4.1.5 Módulo Administrador	10
4.2 Diagrama de sequência	23
4.2.1 Manter login	23
4.2.2 Manter cliente	24
4.2.3 Manter Produto	25
4.2.4 Manter funcionário	26
4.2.5 Manter relatório	27
4.3 Diagrama de Classes	28
4.4 Diagrama Entidade-Relacionamento	29
4.5 Diagrama de atividade	30
4.5.1 Módulo Administrativo	30
4.5.2 Módulo Institucional	31
4.5.3 Módulo Balconista	32
4.5.4 Relatório	33
4.5.3 Módulo Gerente	34
4.6 Diagrama de Componentes e Implantação	35
5 Desenvolvimento do sistema	35
6 Resultados	36
6.1 Tela de autenticação	36
6.2 Tela inicial	36
6.3 Tela clientes	37
6.4 Tela produtos	37
6.5 Tela fornecedores	38
6.6 Tela funcionários	38
6.7 Tela vendas	39
6.8 Tela relatório	39
6.9 Tela sobre	40
6.10 Tela contato	41
6.11 Tela FAQ	42
6.11 Tela Plataforma	43
Figura  32 - Tela da arquitetura do sistema	43
7 Conclusão	44
8 Referência	45
 

1. Introdução

Já sabemos que o uso de sistemas é indispensável em todas as áreas de atuação do ser humano, sendo elas comerciais, industriais e governamentais. 
A partir dessa necessidade o software vem se desenvolvendo para atender melhor seus clientes e trazer um controle mais adequado de toda a movimentação de uma microempresa.
Neste trabalho é desenvolvido um sistema web, utilizando a linguagem Java-EE com a IDE Eclipse com frameworks JavaServer Faces, Primefaces, bootstrap, Hibernate e o banco de dados MySQL que tem uma interface simples, objetiva e intuitiva.
Há várias vantagens em se adotar a abordagem de desenvolvimento web pois é multiplataforma não depende de sistema operacional ou navegador, removendo uma barreira entre ambientes computacionais quanto à barreira física à utilização do software.
A principal vantagem é a facilidade no acesso, em qualquer local é possível facilmente acessar as informações contidas na aplicação.
Optou-se pelo modelo orientado à objetos pela sua facilidade e modularização dos componentes. 
Para modelagem dos diagramas foi utilizada a ferramenta Astah Community.
Para a emissão de relatórios foi utilizado o framework JasperReports e iReport, gerando relatórios eficientes e precisos, além de oferecer uma boa visualização dos dados desejados.

1.2 Objetivos

O objetivo da realização do trabalho foi o de proporcionar aos acadêmicos situações de contato com a importância do planejamento, desenvolvimento até a implantação de um sistema web, de modo que, estes adquiram experiência e conhecimento na área de Engenharia de Software III. 

1.2.1 Objetivos específicos

Pesquisar o funcionamento de um sistema completo de gerenciamento de dados, observando as necessidades operacionais básicas de cada setor. 
Fazer o levantamento de requisitos completo com diagramas de casos de uso e descrição deles, diagrama de classes, diagramas de sequência, diagramas de atividades, diagrama entidade-relacionamento, diagrama de componentes e Implantação.  
Implementar um sistema online que irá gerenciar os dados importantes para a microempresa, possibilitando a manipulação destes dados através de inserções, alterações e exclusões. 

1.3 Justificativa

	Com o aumento do número de clientes e a falta de controle e segurança no armazenamento de dados importantes e controle de prazos, foi criado este sistema para proporcionar mais conforto, dedicação e segurança para o cliente e a microempresa.
A motivação para o desenvolvimento deste projeto é propor uma alternativa web para gerenciar todo o sistema de uma  microempresa. 
Esta nova plataforma online propõe gerenciar os fornecedores, funcionários, clientes, produtos e vendas assim permitindo um acompanhamento total com relatórios sobre cada aplicação.
Para maior segurança, diferentes níveis de acesso estão em vigor, permitindo que diferentes usuários tenham acesso. Os níveis de acesso incluem gerentes, administradores e balconistas.

2 Desenvolvimento

2.1 Levantamento de requisitos

	Levantamento de requisitos é primordial para um bom planejamento, pois dele deriva as demais etapas na construção de um sistema. Nenhuma outra parte do trabalho inutiliza o sistema se for feita de forma errada. 
Todo o sistema é baseado nos requisitos levantados, os requisitos levantados são divididos em funcionais que descrevem explicitamente os serviços do sistema e não funcionais que estão relacionados ao uso da aplicação em termos de desempenho, usabilidade, confiabilidade, segurança, disponibilidade e tecnologias envolvidas. 

2.2 Metodologia de análise

A metodologia do sistema foi modelada através da análise orientada a objetos, que constitui uma linguagem de análise chamada UML (Unified Modeling Language).

2.2.1 Descrição da UML

Em portugûes (linguagem de modelagem unificada), é uma linguagem visual para modelagem de softwares baseada no paradigma da orientação a objetos,  usada para especificar, construir, visualizar e documentar um sistema de software.
A UML permite que os desenvolvedores visualizem os seus trabalhos em diagramas.

2.2.2 Descrição do gerenciamento

Para a gestão e o gerenciamento do projeto foi utilizado o método ágil Scrum, o projeto foi dividido em ciclos (com duração máxima de 2 a 4 semanas) chamados de Sprints.
As funcionalidades a serem implementadas no projeto são mantidas em uma lista de requisições abertas que se encontram na fila de atendimento chamada de Backlog.
As  funcionalidades a serem finalizadas vão para a Aprovação onde é a parte da revisão, logo após a aprovação as funcionalidades vão para o Concluído.

2.2.3 Descrição dos Usuários

Os usuários do sistema proposto serão os gerentes, administradores, balconista os quais serão responsáveis por grande parte do acompanhamento e atualização dos dados dos do sistema.

3 Modulos

3.1 Perspectiva do Produto: Módulo Institucional

O Módulo Institucional nada mais é do que a microempresa em um todo. Cada setor tem seu papel, que irá conter alguns dados sobre o mesmo, como nome, endereço, telefone e os serviços prestados. Este módulo visa permitir que clientes atuais ou futuros clientes entrem facilmente em contato com a microempresa.

3.2 Perspectiva do Produto: Módulo Gerente

O Módulo do Gerente é responsável por controlar todas as operações do sistema. 

3.3 Perspectiva do Produto: Módulo Balconista

O Módulo da balconista permitirá que a mesma faça vendas, cadastre e atualize os dados dos clientes, consulte relatórios, cadastre e atualize os produtos.

3.4 Perspectiva do Produto: Módulo Administrativo

O Módulo Administrativo desta plataforma serve para administrar os funcionários, fornecedores para que se obtenha dados gerais sobre o uso do sistema. Ele também é encarregado de administrar as categorias de produtos disponíveis e evitando, assim, nomenclaturas semelhantes para mesmos procedimentos, por exemplo. Por questões de privacidade o administrador não tem acesso a dados dos clientes e fornecedores e vendas. 

4 Diagrama de Caso de Uso  ( Use Case)

4.1 Diagrama de Caso de uso geral

 
Figura 01 - Diagrama geral de caso de uso

4.1.1 Efetuar login

 
Figura 02 - Diagrama de caso de uso efetuar login 

4.1.2 Módulo Gerente

 
Figura 03- Diagrama de caso de uso módulo gerente

4.1.3 Módulo Institucional

 
 Figura 04- Diagrama de caso de uso módulo institucional
4.1.4 Módulo Balconista
 
Figura 05- Diagrama de caso de uso módulo balconista

4.1.5 Módulo Administrador
 
Figura 06- Diagrama de caso de uso módulo administrador 

Caso de Uso:	Manter Cliente
Ator(es):	Balconista, Gerente
Pré-condições:	O usuário deve estar logado no sistema.
Pós-condições:	O usuário deve ser cadastrado, consultado, alterado ou excluído
 
 	Ator	 	Sistema	 
1	O caso de uso inicia quando o ator solicita a manutenção de clientes	 	 	 
 	 	2	Sistema oferece a interface de manutenção de clientes.	 
3	O Ator seleciona as operações de novo registro.	 	 	A1
 	 	4	Ativa o formulário para registro.	 
5	Preenche os dados da venda.	 	 	 
 	 	6	Grava os dados.	 
 	 	7	Encerra o caso de uso.	 
8	Informa os dados para a busca dos clientes.	 	 	 
 	 	9	Busca e mostra os dados dos clientes.	 
10	Atualiza os dados previamente cadastrados.	 	 	 
11	Confirma alteração.	 	 	A2
 	 	12	Grava os dados.	 
 	 	13	Encerra o caso de uso.	 
14	Ativa a interface para visualização dos clientes.	 	 	 
 	 	15	Busca e mostra os dados dos clientes.	 
 	 	16	Encerra o caso de uso.	 
17	Informa os dados para busca dos clientes.	 	 	 
 	 	18	Busca e mostra os dados dos clientes.	 
19	Ator seleciona a operação de exclusão. Utiliza “Excluir clientes.”.	 	 	 
 	 	20	Excluir os clientes.	R1
 	 	21	Encerra o caso de uso.	
                               	        	
A1	O Ator seleciona a operação de alteração. Utiliza “Alterar clientes” (linha 8). / seleciona a operação. Utiliza “Buscar clientes” (linha 14), seleciona a operação de exclusão. Utiliza “Excluir clientes (linha 17).
A2	Cancela caso de uso.
A3	Cancela caso de uso.
E1	O Ator não preenche corretamente todos os campo.
R1	Só e possível excluir um registro que seja feito por um Gerente.
 Tabela 01- Descrição de caso de uso manter clientes 

Caso de Uso:	Manter Produto.
Ator(es):	Administrador, Gerente, Balconista.
Pré-condições:	O usuário deve estar logado no sistema.
Pós-condições:	O produto deve ser cadastrado, consultado, alterado ou excluído.
 
 	Ator	 	Sistema	 
1	O caso de uso inicia quando o ator solicita a manutenção de produtos	 	 	 
 	 	2	Sistema oferece a interface de manutenção de produtos.	 
3	O Ator seleciona as operações de novo registro.	 	 	A1
 	 	4	Ativa o formulário para registro.	 
5	Preenche os dados do produto	 	 	 
 	 	6	Grava os dados.	 
 	 	7	Encerra o caso de uso.	 
8	Informa os dados para a busca dos produtos.	 	 	 
 	 	9	Busca e mostra os dados dos produtos.	 
10	Atualiza os dados previamente cadastrados.	 	 	 
11	Confirma alteração.	 	 	A2
 	 	12	Grava os dados.	 
 	 	13	Encerra o caso de uso.	 
14	Ativa a interface para visualização dos produtos.	 	 	 
 	 	15	Busca e mostra os dados dos produtos.	 
 	 	16	Encerra o caso de uso.	 
17	Informa os dados para busca dos produtos.	 	 	 
 	 	18	Busca e mostra os dados dos produtos.	 
19	Ator seleciona a operação de exclusão. Utiliza “Excluir produtos”.	 	 	R1 
 	 	20	Excluir os produtos.	A3
 	 	21	Encerra o caso de uso.	
                               	        	
A1	O Ator seleciona a operação de alteração. Utiliza “Alterar produtos” (linha 8). / seleciona a operação. Utiliza “Buscar produtos” (linha 14), seleciona a operação de exclusão. Utiliza “Excluir produtos (linha 17).
A2	Cancela caso de uso.
A3	Cancela caso de uso.
E1	O Ator não preenche corretamente todos os campo.
R1	Só e possível excluir um registro que seja feito por um Gerente.
Tabela 02- Descrição de caso de uso manter produto 

Caso de Uso:	Efetuar Login.
Ator(es):	Administrador, Gerente, Balconista.
Pré-condições:	O usuário deve estar cadastrado no sistema.
Pós-condições:	Usuário logado.
 
 	Ator	 	Sistema	 
1	Abre interface de login	 	 	 
 	 	2	Usuário informa login e senha	A1
3	Preenche e seleciona dados	 	 	 
 	 	4	Verifica os registros selecionados	E1
E2
 	 	5	Efetua login	A2
 	 	6	Encerra caso de uso	 
                               	
E1	O usuário digita login ou senha incorreta, volta ao passo 3
E2	O Sistema emite mensagem de usuário não existente, volta ao passo 3
A1	O usuário cancela a entrada ao sistema.
A2	O sistema encerra
Tabela 03- Descrição do caso de uso efetuar login 
 
Caso de Uso:	Manter Funcionário
Ator(es):	Gerente, Administrador.
Pré-condições:	O usuário (Gerente, Administrador) deve estar logado no sistema.
Pós-condições:	O usuário deve ser cadastrado, consultado, alterado ou excluído
 
 	Ator	 	Sistema	 
1	O caso de uso inicia quando o ator solicita “Manter Funcionário”.	 	 	 
 	 	2	Sistema oferece a interface de manutenção de funcionário.	 
3	O Ator seleciona as operações de novo registro.	 	 	A1
R1
R2
 	 	4	Ativa o formulário para registro.	 
5	Preenche os dados do funcionário.	 	 	E1
E2
 	 	6	Grava os dados do funcionário	 
 	 	7	Encerra o caso de uso.	 
8	Informa os dados para a busca do funcionário.	 	 	R3
 	 	9	Busca e mostra os dados do funcionário.	 
10	Atualiza os dados previamente cadastrados.	 	 	 
11	Confirma alteração.	 	 	A2
 	 	12	Grava os dados.	 
 	 	13	Encerra o caso de uso.	 
14	Informa os dados para busca do funcionário.	 	 	R4
 	 	15	Busca e mostra os dados do funcionário.	 
 	 	16	Encerra o caso de uso.	 
17	Informa os dados para busca do funcionário.	 	 	R5
 	 	18	Busca e mostra os dados do funcionário.	 
19	Ator seleciona a operação de exclusão. Utiliza “Excluir funcionário”.	 	 	A3
 	 	20	Excluir o funcionário.	 
 	 	21	Encerra o caso de uso.	 
                               	        	
A1	O Ator seleciona a operação de alteração. Utiliza “Alterar funcionário” (linha 8). / seleciona a operação de busca. Utiliza “Buscar funcionário” (linha 14), seleciona a operação de exclusão. Utiliza “Excluir funcionário (linha 17).
A2	Cancela caso de uso.
A3	Cancela caso de uso.
E1	O Ator não preenche corretamente todos os campo.
E2	Sistema emite uma mensagem de falha.
R1	Gerente e Administrador podem cadastrar novos funcionários do tipo Balconista,Gerente e Administrador. Balconista não podem cadastrar novos Funcionários.
R2	Somente se o usuário for do tipo Gerente/Administrador poderão adicionar novos Funcionários.
R3	Gerente/Administrador podem alterar dados dos seus Funcionários. Balconista só podem alterar os seus próprios dados e dos clientes.
R4	Gerente pode buscar dados dos seus Funcionários e dos Clientes. Funcionários só podem visualizar dados do seu próprio usuário e dos Clientes.
R5	Gerente pode excluir seus Funcionários e Clientes. Os Funcionários não podem excluir nenhum usuário.
Tabela 04- Descrição do caso de uso manter funcionário 
 
Caso de Uso:	Manter Venda
Ator(es):	Gerente, Balconista
Pré-condições:	O usuário deve estar logado no sistema.
Pós-condições:	A venda deve ser cadastrada, consultada, alterada ou excluída
 
 	Ator	 	Sistema	 
1	O caso de uso inicia quando o ator solicita “Vender um produto”.	 	 	 
 	 	2	Sistema oferece a interface de venda do produto.	 
3	O Ator seleciona as operações de novo registro.	 	 	A1
 	 	4	Ativa o formulário para registro.	 
5	Preenche os dados da venda.	 	 	 
 	 	6	Grava os dados.	 
 	 	7	Encerra o caso de uso.	 
8	Informa os dados para a busca da venda.	 	 	 
 	 	9	Busca e mostra os dados da venda.	 
10	Atualiza os dados previamente cadastrados.	 	 	 
11	Confirma alteração.	 	 	A2
 	 	12	Grava os dados.	 
 	 	13	Encerra o caso de uso.	 
14	Ativa a interface para visualização das vendas.	 	 	 
 	 	15	Busca e mostra os dados da vendas.	 
 	 	16	Encerra o caso de uso.	 
17	Informa os dados para busca das vendas.	 	 	 
 	 	18	Busca e mostra os dados das vendas.	 
19	Ator seleciona a operação de exclusão. Utiliza “Excluir venda”.	 	 	R1 
 	 	20	Excluir a venda	A3
 	 	21	Encerra o caso de uso.	
                               	        	
A1	O Ator seleciona a operação de alteração. Utiliza “Alterar venda” (linha 8). / seleciona a operação. Utiliza “Buscar venda” (linha 14), seleciona a operação de exclusão. Utiliza “Excluir venda (linha 17).
A2	Cancela caso de uso.
A3	Cancela caso de uso.
E1	O Ator não preenche corretamente todos os campo.
R1	Só e possível excluir um registro que seja feito por um Gerente.
Tabela 05- Descrição do caso de uso manter venda. 
 
Caso de Uso:	Manter relatório
Ator(es):	Gerente
Pré-condições:	O usuário deve estar logado no sistema.
Pós-condições:	O usuário deve alterar, consultar e excluir os relatórios
 
 	Ator	 	Sistema	 
1	O caso de uso inicia quando o ator solicita “Manter relatório”.	 	 	 
 	 	2	Sistema oferece a interface dos relatórios.	 
3	O Ator seleciona as operações de novo relatório.	 	 	A1
 	 	4	Ativa o formulário para o relatório.	 
5	Preenche os dados do relatório.	 	 	 
 	 	6	Grava os dados.	 
 	 	7	Encerra o caso de uso.	 
8	Informa os dados para a busca do relatório	 	 	 
 	 	9	Busca e mostra os dados do relatório	 
10	Atualiza os dados previamente cadastrados.	 	 	 
11	Confirma alteração.	 	 	A2
 	 	12	Grava os dados.	 
 	 	13	Encerra o caso de uso.	 
14	Ativa a interface para visualização dos relatório.	 	 	 
 	 	15	Busca e mostra os dados do relatório.	 
 	 	16	Encerra o caso de uso.	 
17	Informa os dados para busca do relatório.	 	 	 
 	 	18	Busca e mostra os dados do relatório.	 
19	Ator seleciona a operação de exclusão. Utiliza “Excluir relatório”.	 	 	R1 
 	 	20	Excluir a relatório	A3
 	 	21	Encerra o caso de uso.	
	        	
A1	O Ator seleciona a operação de alteração. Utiliza “Alterar relatório” (linha 8). / seleciona a operação. Utiliza “Buscar relatório” (linha 14), seleciona a operação de exclusão. Utiliza “Excluir relatório (linha 17)”.
A2	Cancela caso de uso.
A3	Cancela caso de uso.
E1	O Ator não preenche corretamente todos os campo.
R1	Só e possível excluir um relatório com o nível de acesso Gerente.
 Tabela 06- Descrição do caso de uso manter venda.
 

4.2 Diagrama de sequência 

4.2.1 Manter login
Os funcionários realizam o login se a senha estiver correta a interface do usuário realiza o acesso ao sistema, se a senha estiver errada o sistema informa senha inválida.

 
Figura 07 - Diagrama de sequência manter login 

4.2.2 Manter cliente
O gerente ou balconista acessam cadastrar novo cliente, a interface do sistema habilita as atualizações, o sistema informa ao usuário que o cadastro foi concluído com sucesso.

 
Figura 08 - Diagrama de sequência manter cliente 

4.2.3 Manter Produto

O funcionário acessa cadastrar novo produto, a interface do sistema habilita as atualizações, o sistema informa ao usuário que o cadastro foi concluído com sucesso.

 
Figura 09 - Diagrama de sequência manter produto 

4.2.4 Manter funcionário

O gerente ou administrador realizam o login, a interface do sistema habilita a opção de editar ou cadastrar novo usuário, o sistema informa que o usuário foi cadastrado com sucesso

 
Figura 10 - Diagrama de sequência manter funcionário 

4.2.5 Manter relatório

O gerente acessa a interface do sistema e solicita emitir relatórios o sistema gera o relatório e o usuário imprime os dados desejados.

 
Figura 11 - Diagrama de sequência manter relatório 

4.3 Diagrama de Classes

 
Figura 12 - Diagrama de classe 

4.4 Diagrama Entidade-Relacionamento

 

Figura  13 - Diagrama entidade-relacionamento 

4.5 Diagrama de atividade

4.5.1 Módulo Administrativo

 
Figura  14 - Diagrama de atividade do módulo administrativo 
4.5.2 Módulo Institucional

 
Figura 15 - Diagrama de atividade módulo institucional

4.5.3 Fazer Login
 
Figura 16 - Diagrama de atividade fazer login
4.5.3 Módulo Balconista
 
Figura 17 - Diagrama de atividade Módulo Balconista

4.5.4 Relatório

 
Figura  18 - Diagrama de atividade relatório
4.5.3 Módulo Gerente 
 
Figura 19 - Diagrama de atividade Módulo Gerente

4.6 Diagrama de Componentes e Implantação

 
Figura  20 - Diagrama de Componentes e Implantação

5 Desenvolvimento do sistema

O sistema de gestão de dados Online cujo nome fantasia escolhido foi Cronus, desenvolvido a partir da análise do projeto apresentado até então.
Assim como foi modelado o Cronus é composto por 4 áreas: Módulo Institucional, Módulo do Administrador, Módulo do Gerente, Módulo da Balconista. Nos próximos itens serão demonstrados através de screenshots retirados da aplicação final as principais funcionalidades (telas) de cada módulo. 

6 Resultados

6.1 Tela de autenticação
 
Figura  21 - Tela auteticação

Ao acessar o sistema através do navegador, a primeira página que aparece para o funcionário é a tela de autenticação, o funcionário informará seus dados para login e clica em “Entrar” (Figura 15) sendo redirecionado para qual área vai ter acesso (Gerente, Balconista ou Administrador) sendo que em todas as páginas de acesso estará o nome do usuário logado no momento.

6.2 Tela inicial
 
Figura  22 - Tela inicial

Após a autenticação ser feita vai acontecer um redirecionamento para a página inicial do website (Figura 16) e o funcionário poderá acessar os menus: “Arquivo”, “Cadastros” “Vendas”, “Relatórios”.

6.3 Tela clientes
 
Figura  23 - Tela clientes

O cadastro de clientes é composto pelos dados pessoais dos clientes da microempresa. sendo que todos os dados são de preenchimento obrigatório.

6.4 Tela produtos
 
Figura  24 - Tela produtos

Esta tela é usada para cadastrar os produtos da microempresa. É obrigatório cadastrar o nome, preço, quantidade e atribuir a um fornecedor existente.

6.5 Tela fornecedores
 
Figura  25 - Tela fornecedores

Esta tela é usada para cadastrar os fornecedores da microempresa. É obrigatório cadastrar a descrição.

6.6 Tela funcionários
 
Figura  26 - Tela funcionários

Esta tela é usada para cadastrar os funcionários da microempresa. É obrigatório cadastrar o nome, CPF e cargo que ele ocupa.
6.7 Tela vendas
 
Figura  27 - Tela vendas

Tela gestão de vendas com relatório de acompanhamento.

6.8 Tela relatório
 
Figura  28 - Tela relatório

Esta tela é usada para relatar de modo fácil os dados cadastrados nas determinadas áreas.

6.9 Tela sobre
 
Figura  29 - Tela Sobre

Esta tela descreve sobre a empresa e o time que faz parte dela. 

6.10 Tela contato
 
Figura  30 - Tela contato

Um simples formulário de contato que serve para tirar as dúvidas ou contatar algum problema no sistema. 

6.11 Tela FAQ

 

Figura  31 - Tela FAQ

Esta tela serve para mostrar as dúvidas mais frequentes, é utilizado para reduzir o número de perguntas semelhantes repetidamente enviadas por e-mail ou mensagens.
Nesta tela os próprios funcionários criam suas perguntas com respostas para agilizar no suporte ao cliente. 
6.12 Tela Plataforma
 
Figura  32 - Tela da arquitetura do sistema

A arquitetura de software, construída com micro serviços, utiliza o poder da computação em nuvem para oferecer uma solução escalável de alta disponibilidade. 

7 Conclusão

 	O intuito da realização da documentação foi o de proporcionar aos acadêmicos situações de contato com a importância do planejamento até a implantação de um sistema web, de modo que, estes adquiram experiência e conhecimento na área de Engenharia de Software III.
Por intermédio das pesquisas realizadas, e a partir delas a realização da modelagem foi possível implementar uma ferramenta que atenda os pequenos empreendedores deste ramo. 
Para efetuar a modelagem foram utilizadas ferramentas eficientes que forneceram uma interação fácil do usuário com o sistema como MySQL, Eclipse com os frameworks JavaServer Faces, Primefaces, Bootstrap Hibernate, JasperReports e iReport para a gerar os relatórios.
 No processo de desenvolvimento deste trabalho ocorreu um grande enriquecimento em relação à modelagem orientada a objetos, e de um modo geral a realização deste trabalho, permitiu ampliar conhecimentos adquiridos durante o decorrer do semestre.
Para empreendimentos futuros pretendemos implantar um controle de vendas a prazo, para dar mais comodidade a cada cliente, e um fluxo de caixa completo com parcelamento e lançamento de nota fiscal, buscando trazer para a microempresa e para seus colaboradores controle e segurança sobre cada movimentação melhorando o desempenho de sistema e a satisfação dos clientes.
 	O fato de desenvolver um artigo é sempre empolgante assim aproveitamos toda a criatividade e inteligência, rendendo um comprometimento extraordinário.
 	Com certeza que, as aulas feitas antes e depois do artigo, foram essenciais para a evolução dos alunos e compreensão da disciplina.
 	Por isso, acredito que, o aproveitamento das aulas foi total devido à um grande conjunto de fatores, os quais ocorreram durante o semestre inteiro. 

8 Referência
NOGUEIRA, Admilson. UML - Unified Modeling Language - Introdução e Histórico. Disponível em: <http://www.linhadecodigo.com.br/artigo/853/uml-unified-modeling-language-atores-atividades-e-componentes.aspx>. Acesso em: 04 abril. 2019

ROCHA, Givanaldo. Engenharia de Software, Diagrama de classe. Disponível em: <https://docente.ifrn.edu.br/givanaldorocha/disciplinas/engenharia-de-software-licenciatura-em-informatica/diagrama-de-classes> . Acesso em: 10 abril. 2019 

SOMMERVILLE, Ian. Engenharia de Software. 8. Ed. São Paulo: Pearson Addison Wesley, 2007

TARIFA, Alexandre. Padrões de nomenclaturas – Guia de consulta rápida. Disponível em:<http://www.linhadecodigo.com.br/artigo/253/padroes-de-nomenclaturas-guia-de-consultarapida.aspx>. Acesso em: 18 abril. 2019

MAGALHÃES, Guilherme. Como Funciona o Processo de Desenvolvimento de Software. Disponível em: <https://www.teses.usp.br/teses/disponiveis/3/3136/tde-11042017-143311/publico/GuilhermeAugustoMachadodeAlmeidaCorr17.pdf> . Acesso em: 25 abril. 2019

MACEDO, Diego. Administração de Usuários e Privilégios no Banco de Dados. Disponível em:<https://www.diegomacedo.com.br/administracao-de-usuarios-e-privilegios-no-banco-de-dados/> . Acesso em: 02 maio. 2019

MEDEIROS, Ernani Sales de. Desenvolvendo Software com UML 2.0: definitivo.1. ed. São Paulo, 2004 MEIRA, Fabio. Sistemas de Bancos de Dados

DEVMEDIA. Desenvolvimento de Software Dirigido por Caso de Uso. Disponível em: . Acesso em: <https://www.devmedia.com.br/desenvolvimento-de-software-dirigido-por-caso-de-uso/9148> 03 maio. 2019

GURGEL, Bruno. Análise e Projeto Orientados a Objetos - Requisitos. Disponível em:<http://docente.ifrn.edu.br/brunogurgel/disciplinas/2013/apoo/aulas/1-IntroAPOO.pdf> . Acesso em 02 maio 2019.
