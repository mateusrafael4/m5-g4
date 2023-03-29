---
title: Modelo para o artigo do Módulo 5
author:
 - "Gabriel Caetano Nhoncanse"
 - "Jonas Vianas Sales"
 - "Matheus Rafael Miranda da Silva"
 - "Raphael Lisboa Antunes"
 - "Sarah de Miranda Ribeiro"
 - "Sergio Brito Amorim Lucas"
 - "Thomas Frajhof Brand"
date: Março de 2023
abstract: Como parte das atividades do módulo 5, cada grupo deverá redigir um texto descrevendo os resultados do projeto no formato de um artigo científico. Este arquivo no formato markdown contém a estrutura básica deste artigo. Cada grupo deverá editar este arquivo com a descrição do projeto que desenvolveu.
---

# Introdução

<p>Este trabalho diz respeito ao projeto acadêmico realizado nas dependências da faculdade Inteli (Instituto de Tecnologia e Liderança) como parte do módulo 05 (03º semestre) da grade curricular do bacharelado em Ciência da Computação da instituição e em parceria com a empresa AEL Sistemas.</p>

<p>O propósito deste projeto é o desenvolvimento de um algoritmo que automatize o processo de escolha de um caminho ideal para missões aéreas militares quaisquer.</p>

<p>Missões aéreas são parte integrante das atividades militares em muitos países pelo mundo. Elas têm uma variedade de funções, incluindo defesa, reconhecimento e resgate. No entanto, algumas missões precisam ser realizadas em baixa altitude (no máximo 500 a 1000 pés) e, portanto, apresentam desafios significativos que precisam ser enfrentados para garantir o sucesso e a segurança dos envolvidos.</p>

<p>Um dos principais desafios das missões de baixa altitude é a falta de bom reconhecimento do terreno e do relevo, o que pode aumentar em grande escala o risco de colisão ou passagem por zonas de risco, como territórios inimigos ou áreas populacionais. Esses riscos podem levar à destruição da aeronave e/ou ao acidente do piloto, resultando em perdas para a missão e para o país. Pesquisadores, como Adams, Kuang e Wang (2018), propõem soluções que utilizam análise espacial em 3D para lidar com esse problema e melhorar a segurança das missões.</p>

<p> Com base nas informações fornecidas sobre o terreno da área da missão, o algoritmo montará um grafo a partir dos nós e arestas inseridos pelo usuário, atribuindo pesos às arestas com base no cálculo balanceado entre distância e altitude. Uma vez que o grafo é montado, o sistema calcula o peso total das possíveis trajetórias e escolhe a de menor peso, disponibilizando a rota mais eficiente para a equipe. </p>

<p> Tendo esse contexto em vista, foi desenvolvida uma solução para missões de baixa altitude, permitindo que a melhor rota seja escolhida entre o ponto inicial e final, balanceando a distância, altitude e características específicas da missão, como a aeronave usada, áreas de exclusão (como zonas populadas que são colocadas em risco durante as missões), entre outros fatores. Além disso, altitudes elevadas devem ser evitadas ao máximo, e não excluídas, para manter a segurança do piloto e reduzir a visibilidade da nave para possíveis inimigos. Essa solução proposta por Liu, Wang, Zhou e Yang (2021) utiliza um sistema inteligente de planejamento de missões para drones de baixa altitude, levando em consideração diversos fatores para encontrar a melhor rota.</p>



# Trabalhos relacionados

Pela natureza do projeto, não foi possível encontrar projetos que se aplicam a situações de missões militares em baixa altitude, no entanto, foi possível encontrar algo similar em um artigo sobre "Uma Abordagem de Risco Mínimo para Planejamento de Trajeto de VANTs (Veiculos Aéreos Não Tripulados)" (DE FILIPPIS; GUGLIERI; QUAGLIOTTI, 2010). 
Muitos dos conceitos utilizados no artigo são semelhantes aos utilizados no projeto, como a utilização de um grafo para representar o terreno e a utilização de um algoritmo de busca para encontrar a melhor rota, estas semelhanças serão discutidas mais a frente.

# Motivação

<p>Este projeto tem como finalidade o tracejamento de uma rota ideal para um piloto em operações militares, buscando priorizar sua segurança e a eficiência de sua missão.</p>

<p>A segurança do piloto nestes voos pode ser violada de diversas maneiras dependendo das características específicas do voo que está sendo realizado; forças opositoras, características topográficas e propriedades da nave estão entre as possíveis causas deste problema.</p>

<p>De acordo com dados publicamente disponibilizados por orgãos públicos, voos em baixa altura (LALT) compõem grande parte dos tipos de ocorrência (Taxonomia SIPAER) dos acidentes aéreos nos segmentos agrícolas, tendo feito parte dos fatores destaque em múltiplas edições da RASO (Relatório Anual de Segurança Operacional) da ANAC (Agência Nacional de Aviação Civil) e no Sumário Estatístico da Aviação Agrícola realizado entre 2010 e 2019 da CENIPA (Centro de Investigação e Prevenção de Acidentes Aeronáuticos).</p>

<p>Apesar deste trabalho estar focado em operações militares, que por sua natureza lidam com situações confidenciais e de restrito acesso, podemos inferir o risco de acidentes aéreos em baixa altitude visto que o segmento agrícola, ao contrário das outras categorias de voo, comumente adota a prática do voo em baixa altitude para realizar suas operações, e serve como um ponto de atenção aos riscos envolvidos com voos desta natureza.</p>

<p>Estes riscos, por sua vez, não levam em conta a presença de forças opositoras, visto que foram voos não militares realizados em território nacional. Não há dados publicamente disponíveis para corroborar este problema, mas é de senso comum inferir que naves militares em território clandestino serão tratadas como hostís e recebidas de acordo.</p>

<p>Um sistema de mapeamento de terreno poderia contribuir na mitigação ou eliminação destes problemas entregando ao piloto e ao time de operações mais consciência situacional do terreno em que ele se encontra; o caminho deverá, idealmente, levar vantagem do terreno para diminuir o risco de detecção visual, entregar um caminho que não se encontra com áreas ou terrenos que apresentam risco ao piloto, e instruir ao condutor para que sua elevação se mantenha ideal para a missão, mantendo a baixa altitude e sua segurança.</p>

<p>No assunto de eficiência, este trabalho busca tomar vantagem das capacidades matemáticas de um computador para gerar um caminho ideal agregando informações sobre o terreno e comprovando, matematicamente, qual é o melhor caminho a se seguir. Utilizando de diversos parâmetros e fórmulas que do contrário, em utilização manual ou auxiliada, se provaria mais exigente e custoso para o time de planejamento. </p>

<p>Logo, as motivações deste trabalho podem ser resumidas nos quesitos de segurança e eficiência, buscando que o resultado de qualquer missão que utilize este algoritmo tenha o resultado ideal de um piloto seguro e o terreno mapeado.</p>



# Metodologia

<p>Como já mencionado na introdução, este projeto faz parte da grade curricular do bacharelado em Ciência da Computação do Inteli, logo, as decisões de quais métodos serão utilizados também leva em conta o aprendizado que será adquirido com a utilização das ferramentas.</p>

<p>Logo, é possível afirmar que este processo pode ser replicado por quaisquer outras ferramentas similares, visto que cumpram os mesmos objetivos relatados.</p>

<p>A linguagem de programação escolhida neste projeto foi o Java, devido a sua ampla aplicação no mercado e o repertório de conteúdo didático disponível para a linguagem. </p>

<p>Dentro do Java, também é utilizado a ferramenta de gerenciamento e construção de projetos Apache Maven, que tem a finalidade de facilitar o gerenciamento de dependências, a construção, o teste e a implementação de projetos Java. Em nosso caso específico, a utilizamos para gerenciar importantes dependências para nosso projeto</p>

<p>Uma dessas dependências é o GDAL (Geospacial Data Abstraction Library / Biblioteca de Abstração de Dados Geospaciais), que é uma biblioteca que permite a leitura e gravação de dados geoespaciais em vários formatos.
Em nosso caso específico, utilizamos o GDAL para ler arquivos DTED.</p>

<p> Arquivos DTED (Digital Terrain Elevation Data / Dados Digitais de Elevação de Terreno) é um padrão de dados geoespaciais utilizado pelo Departamento de Defesa dos Estados Unidos para representar dados de elevação de terreno. Em nosso caso, utilizamos 4 conjuntos de dados que representam as localizações Rio de Janeiro, São Paulo, Yosemite e Vale da Morte. </p> 

<p>Estes dados são, na verdade, um conjunto de arquivos .DT2, que é um componente do formato DTED e significa a resolução espacial dos dados de elevação dos terrenos citados, no caso, a extensão .DT2 armazena a grade com a maior resolução (aproximadamente 0,25 km x 0,25 km na linha do equador).</p>

<p>Dependendo das necessidades do projeto, o formato DTED oferece outras 2 resoluções, sendo estas representadas por arquivos de extensão .DT0 e .DT1, sendo .DT0 o nível mais baixo de resolução (aproximadamente 1 km x 1 km na linha do equador) e .DT1 o nível intermediário (aproximadamente 0,75 km x 0,75 km na linha do equador), todas as extensões utilizam de uma grade de células, e cada célula representa uma área de 30 segundos de latitude por 30 segundos de longitude.</p>

<p>Outra dependência necessária é o Neo4j Driver, que realiza a conexão e a comunicação do algoritmo com o banco de dados Neo4j e permite as manipulações de CRUD (Create, Read, Update, Delete / Criar, Ler, Atualizar e Deletar) no banco.</p>

<p>O banco de dados Neo4j é um banco de dados de grafo, que se difere de um banco de dados regular por utilizar um modelo que consiste em nós (representando objetos ou entidades) conectados por arestas (representando relacionamentos entre esses objetos ou entidades) ao invés de tabelas e linhas, como bancos de dados relacionais tradicionais.</p>

<p>O Neo4j não só nos auxilia com o armazenamento das informações, que será instrumental na integração com a aplicação web, porém também irá nos auxiliar com a visualização dos dados inseridos, dando aos desenvolvedores uma maneira de imaginar como o grafo deveria ser visto.</p>

<p>Porém, não é ideal que o usuário interaja com o algoritmo diretamente, e para remediar este problema, utilizamos de uma solução web integrada com o banco de dados Neo4j e o algoritmo em Java.</p>

<p>O usuário terá acesso a uma página web (Utilizando das tecnologias HTML e CSS) conectada ao banco de dados Neo4j, onde ele irá enviar, primeiramente, os parâmetros para um MBR (Minimum Bounding Rectangle), que consiste do Ponto Superior Esquerdo e Ponto Inferior Direto(Em graus de latitude e longitude), após isto ele irá inserir o ponto inicial e o ponto final da trajetória, e terá a opção de executar o algoritmo em Java com estes argumentos.</p>

<p>A comunicação entre a aplicação web e o algoritmo em Java é feita pelo framework Spring, outra dependência inserida em nosso arquivo pom.xml, que representa o Apache Maven.</p>

<p>Spring é um framework para desenvolvimento de aplicações Java que facilita o desenvolvimento de aplicações web, desktop e móveis. 
Em nosso caso, estamos utilizando o Spring Boot , que serve para enviar utilizar as informações obtidas na aplicação web para utilizar como parâmetro em nosso algoritmo de busca do melhor caminho.</p>

<p>O algoritmo de melhor caminho é constituido de algumas partes; primeiramente, precisamos saber qual a área de operações (delimitada por meio de entradas do usuário, posteriormente as transformando em um MBR), e baseado nela, podemos dizer se temos dados sobre o terreno especificado ou não (Limitado pelos arquivos DTED em possessão; como citado anteriormente, temos acesso a coordenadas dentro de São Paulo, Rio de Janeiro, Yosemite e Vale da Morte)</p>

<p>Feito esta verificação, podemos atuar na criação da grade, onde cercaremos o MBR criado a partir da entrada do usuário, que será referido como área de operações, em vértices espalhados em 120m de distância máxima horizontal e vertical (Vértices relacionados pela diagonal terão uma distância de ~~ 169,71m) populando toda a área de operações e salvando estas informações em um array.</p>

<p>Após isto, é implementado o algoritmo A*, que é uma extensão do algoritmo de Dijkstra, este que é um algoritmo de busca em grafo que encontra o caminho mais curto entre dois pontos em um grafo com pesos positivos.</p>

<p>A razão pela escolha do algoritmo A* sobre o algoritmo de Dijkstra é pela sua adequação ao projeto; enquanto o algoritmo de Dijkstra se comporta melhor com grafos menores onde os pesos são positivos e iguais, o algoritmo A* consegue lidar com grafos maiores e de pesos diferentes pela sua implementação de uma heurística.</p>

<p>Esta escolha entra em concordância com nossa revisão bibliográfica; "*O algoritmo A* representa um dos métodos mais amplamente utilizados para geração de caminhos, sendo aplicado a problemas de ciência robótica, exploração espacial e videogames.
Este algoritmo combina características dos algoritmos Djikstra e Bellman-Ford, porém,
foi mais especificamente desenvolvido para analisar de forma mais eficaz o domínio a fim de para evitar obstáculos distribuídos. Na presença de ameaças passivas, como cânions e
armadilhas, A* associa uma função de custo heurística combinada com uma varredura aprimorada do
domínio, aprimorando o processo de solução com mais eficiência do que os métodos Djikstra e Bellman-Ford podem fazer*" (DE FILIPPIS; GUGLIERI; QUAGLIOTTI, 2010) </p>

<p>A heurística no algoritmo A* é utilizada para estimar a distância restante do nó atual ao nó de destino. Esta heurística se prova muito adequada a este projeto, visto que utilizaremos da variação de altitude entre diferentes pontos, e este valor será alterado dependendo se estamos subindo, ou descendo.</p>

<p>Neste caso, utilizaremos como heurística a fórmula X * distancia + Y * altura, sendo que X + Y = 1. Desta forma, podemos ponderar melhor as possíveis opções do algoritmo e obter a melhor trajetória.</p>

<p>Estamos, então, procurando o menor valor de peso; visto que quanto maior a distância/altura, o menos desejável é aquela trajetória.</p>

<p>Quando finalizada a execução do algoritmo, e encontrada a melhor trajetória, o algoritmo irá enviar armazenar este resultado no banco de dados Neo4j, que irá, por sua vez, atualizar a solução web, que está conectada a ele.</p>

<p>Após atualizado o banco de dados, a solução web irá exibir um grafo, utilizando da biblioteca D3.js, que oferece uma visualização de dados interativa e dinâmica através da web.</p>

<p>E estas são nossas metodologias e ferramentas utilizadas para a realização da solução. Podemos resumi-las nas seguintes camadas: </p>

<p>Front-End (Web): D3.js, HTML, CSS</p>
<p>Back-End (Web): Spring Boot, Node.js</p>
<p>Banco de Dados: Neo4j</p>
<p>Back-End (Algoritmo): Java, Maven, GDAL</p>

# Análise da complexidade da solução proposta

Neste artigo, cada grupo precisará fazer a análise de complexidade da solução proposta, utilizando as notações $O(.)$, $\Omega(.)$ e $\Theta(.)$.

A seguir temos a citação de alguns trechos de DASGUPTA et. al. (2011) para mostrar como estas notações são em \LaTeX. 

> Sejam $f(n)$ e $g(n)$ duas funções de inteiros positivos em reais positivos. Dizemos que $f = O(g)$ (que significa que "$f$ não cresce mais rápido do que $g$") se existe uma constante $c > 0$ tal que $f(n) \leq c \cdot g(n)$.

Ainda em outro trecho de DASGUPTA et. al. (2011), temos:

> Assim como $O(.)$ é análogo a $\leq$, podemos definir análogos de $\geq$ e $=$ como se segue:

> $f = \Omega(g)$ significa $g = O(f)$

# Análise da corretude da solução proposta

## **Conceitos gerais**

<p> A prova da "corretude" de um algoritmo consiste em mostrar que ele executa
corretamente o processo desejado, isto é, que chega à solução procurada Existem
métodos de prova formal da corretude, empregando Lógica Matemática. Nessa área há
duas dasses de problemas: a prova da execução correta e a prova de que a execução
termina para quaisquer dados de entrada. Esta última questão é denominada o
problema da parada. (Setzer V.W. e Carvalheiro F.H. ALGORITMO E SUA ANÁLISE
(Uma Introdução Didática); Agosto 1993) </p>

<p> Para a analise de corretude, existem vários métodos matemáticos para se provar que um algoritmo funciona para todo e qualquer caso, um deles que pode ser utilizado é a "Regra do laço", na qual o método busca encontrar a invariante do laço, e assim é aplicado o "Teorema da indução finita" a fins de provar a veracidade dessa equação. </p>

> Segundo Y. Gástev, (apud SOMINSKI, 1996), indução significa o raciocínio que vai do particular ao geral e desempenha papel fundamental nas ciências experimentais. Assim, apesar do nome lembrar algo empírico (que se apóia na experiência e na observação), a indução finita é considerada um método dedutivo. De acordo com o mesmo autor, a demonstração desse método constaria de duas partes: uma base, ou seja, a demonstração dedutiva da proposição para um número natural e o passo indutivo que consistiria na demonstração, também dedutiva, da proposição geral: para todo n é correto que a validade da proposição para n implica a validade para n+1. Afirma ainda que a expressão “indução finita” deve-se simplesmente à associação, em nossa consciência, com as argumentações “indutivas” tradicionais. (SAVIOLI, A.M.P.D; Uma Reflexão sobre a Indução Finita: relato de uma experiência; novembro de 2006)

<p> Dada a explicação, primeiro vamos buscar dentro do nosso algoritmo qual seria a nossa invariante do laço, isto é, uma propriedade que permanece verdadeira em todas as iterações do laço do algoritmo. A invariante do laço é uma expressão algébrica que descreve o objetivo do algoritmo e é utilizada na demonstração e prova de que tal algoritmo é funcional e pode ser usado para todo e qualquer n input, mesmo que tendermos esse n ao infinito. É uma técnica muito usada em algoritmos que realizam iterações, como por exemplo algoritmos de ordenação, busca, entre outros. No caso, iremos utilizar essa técnica de demonstração para provar a corretude do algoritmo A*.

Temos a nossa invariante do laço definida por $f_{score} = g_{score} + h_{score}$

Onde:

* $g_{score} =$ Custo do início até o nó analizado na iteração atual
* $h_{score} =$ Distancia, calculada pela fórmula de haversine, entre  nó analizado na iteração atual até o nó de destino
* $f_{score} =$ A estimativa do custo total indo do nó de partida ao nó de destino passando pelo nó da iteração atual

Para o funcionamento do algoritmo de A* se faz necessario a utilização de conceitos como a zona de exclusão; para cada nó, uma lista de nós vizinhos; além de 2 listas: uma de nós já visitados e nós que ainda não foram visitados, mas foram descobertos. A zona de exclusão são pontos especificados pelo cliente que indicam um peso limite, tudo que ultrapassa esse peso é automaticamente recusado quando é encontrado, já a lista de nós vizinhos é usada para que o algoritmo saiba para onde ir e com isso analise o peso das arestas para percorrer no menor peso, por fim as listas são usadas para evitar que haja loopings.

## **Indução Finita**

<p> Como explicado anteriormente pelo artigo (SAVIOLI, 2006) precisamos de 3 suposições para que a expressão se prove correta, são elas: a suposição para n = 1, caso correta suponhamos para n = k e n = k+1, seja n a grandeza qualquer do número de iterações que serão necessárias para o funcionamento do algoritmo. Caso for possível chegarmos no resultado da iteração sucessora ou predecessora a partir da outra, podemos afirmar que o algoritmo se encontra correto.</p>

* **Para n = 1**

    Como a nossa suposição considera apenas 1 iteração, podemos dizer que o nó de partida e o nó de destino é o mesmo, dito isso, podemos definir que $g_{score} = 0$ e $h_{score} = 0$, ja que não há um peso do início até o atual, nem do atual até o final por isso afirmamos que:

    > $f_{score} = g_{score} + h_{score}$
    <br>
    $f_{score} = 0 + 0$
    <br>
    $f_{score} = 0$

    Podemos verificar que de fato confere, pois o custo total para ir de um ponto até ele mesmo, de fato é 0.
<br>

* **Para n = k**

    Agora vamos tentar generalizar supondo um número de iterações igual à um k qualquer, na qual a afirmação que $\forall k \mid k  \in \mathbb{N}*$ se faz verdadeira. Assim assumimos:

    >$f_{score} = f_k$
    <br>
    $g_{score} = g_k$
    <br>
    $h_{score} = h_k$
    <br>
    <br>
    $f_k = g_k + h_k$

    Note que as variáveis estão no índice k, pois são variáveis que mudam justamente em função do número da iteração, portanto colocamos elas em função de k.

* **Para n = k+1**

    Tendo definido a generalização de n = k, vamos tentar alcançar o resultado de n = k+1 a partir do resultado obtido por n = k. Para isso, vamos determinar os valores das nossas variáveis:

    > $f_{score} = f_{k+1}$
    <br>
    $g_{score} = g_{k+1}$
    <br>
    $h_{score} = h_{k+1}$
    <br>
    <br>
    $f_{k+1} = g_{k+1} + h_{k+1}$

    Porém, podemos reescrever $g_{k+1}$ e $h_{k+1}$ de outra forma a fim de deixá-los em relação à $k$. Portanto, podemos assumir que:

    > $g_{k+1} = g_{k} + \omega_{k, k+1}$
    
    * sendo $\omega_{k, k+1}$ o peso da aresta entre o nó $k$ e o nó $k+1$.
  
    <br>

    > $h_{k+1} = h_{k} - C$

    * considerando que $C$ é uma constante que decorre em relação à distancia, visto que todos os nós da malha analizada se encontram distribuidos uniformemente à uma distancia de 120m entre eles.
    
    Por conclusão substituimos a nova relação encontrada para cada um dos termos na equação geral de $f_{k+1}$

    > $f_{k+1} = g_{k+1} + h_{k+1}$
    <br>
    $f_{k+1} = (g_k + \omega_{k, k+1}) + (h_k - C)$
    <br>
    $f_{k+1} = g_k + h_k + \omega_{k, k+1} - C$
    <br>
    $f_{k+1} = f_k + \omega_{k, k+1} - C$

# Resultados obtidos

# Conclusão

# Referências Bibliográficas
//
Referenciar artigos de grafos e sua eficiência
//

Adams, C., Kuang, Y. D., & Wang, S. (2018). Routing of low-altitude flights for UAVs based on a 3D spatial analysis. Journal of Intelligent & Robotic Systems, 89(1), 139-155. doi:10.1007/s10846-017-0691-9

Liu, Y., Wang, J., Zhou, Y., & Yang, Y. (2021). An Intelligent Mission Planning System for Low-Altitude Unmanned Aerial Vehicles. Aerospace, 8(7), 196. doi:10.3390/aerospace8070196

DASGUPTA, S.; Papadimitriou, C.; Vazirani, U. **Algoritmos.** Porto Alegre: AMGH, 2011. 1 recurso online. ISBN 9788563308535. Disponível em: https://integrada.minhabiblioteca.com.br/books/9788563308535. Acesso em: 17 jan. 2023.

AGÊNCIA NACIONAL DE AVIAÇÃO CIVIL (ANAC). RASO - Relatório Anual de Segurança Operacional. [S. l.], 7 out. 2022. Disponível em: https://www.gov.br/anac/pt-br/assuntos/seguranca-operacional/informacoes-de-seguranca-operacional/relatorio-anual-de-seguranca-operacional. Acesso em: 5 mar. 2023.

CENTRO DE INVESTIGAÇÃO E PREVENÇÃO DE ACIDENTES AERONÁUTICOS (CENIPA). DADOS ESTATÍSTICOS. [S. l.], 2019. Disponível em: https://www2.fab.mil.br/cenipa/index.php/prevencao/dados-estatisticos. Acesso em: 5 mar. 2023.

OPEN SOURCE GEOSPATIAL FOUNDATION. GDAL Documentation. [S. l.], 2023. Disponível em: https://gdal.org/index.html. Acesso em: 5 mar. 2023.

NEO4J. Neo4j Graph Database. [S. l.], 2023. Disponível em: https://neo4j.com/product/neo4j-graph-database/. Acesso em: 10 mar. 2023.

VMTANZU. Spring. Why Spring?. [S. l.], 2023. Disponível em: https://spring.io/why-spring. Acesso em: 10 mar. 2023.

BOSTOCK, Mike. D3.js - Data-Driven Documents. [S. l.], 2021. Disponível em: https://d3js.org/. Acesso em: 12 mar. 2023.

DE FILIPPIS, Luca; GUGLIERI, Giorgio; QUAGLIOTTI, Fulvia. A Minimum Risk Approach for Path Planning of UAVs. Journal of Intelligent & Robotic Systems, Holanda, ano 2011, v. 61, n. 1-4, p. 203 - 219, Disponível em: https://doi.org/10.1007/s10846-010-9493-9 Acesso em: 12 mar. 2023.