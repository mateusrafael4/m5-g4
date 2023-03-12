---
title: Modelo para o artigo do Módulo 5
author: 
 - "Sergio Brito Amorim Lucas"
 - "Gabriel Caetano Nhoncanse"
 - "Thomas Frajhof Brand"
date: Janeiro de 2023
abstract: Como parte das atividades do módulo 5, cada grupo deverá redigir um texto descrevendo os resultados do projeto no formato de um artigo científico. Este arquivo no formato markdown contém a estrutura básica deste artigo. Cada grupo deverá editar este arquivo com a descrição do projeto que desenvolveu.
---

# Introdução

<p>Este trabalho diz respeito ao projeto acadêmico realizado nas dependências da faculdade Inteli (Instituto de Tecnologia e Liderança) como parte do currículo do bacharelado em Ciência da Computação da instituição e em parceria com a empresa AEL Sistemas.</p>

<p>O propósito deste projeto é o desenvolvimento de um algoritmo que automatize o processo de escolha de um caminho ideal para missões aéreas militares quaisquer.</p>

<p>Missões aéreas são parte integrante das atividades militares em muitos países pelo mundo. Elas têm uma variedade de funções, incluindo defesa, reconhecimento e resgate. No entanto, algumas missões precisam ser realizadas em baixa altitude (no máximo 500 a 1000 pés) e, portanto, apresentam desafios significativos que precisam ser enfrentados para garantir o sucesso e a segurança dos envolvidos.</p>

<p>Um dos principais desafios das missões de baixa altitude é a falta de bom reconhecimento do terreno e do relevo, o que pode aumentar em grande escala o risco de colisão ou passagem por zonas de risco, como territórios inimigos ou áreas populacionais. Esses riscos podem levar à destruição da aeronave e/ou ao acidente do piloto, resultando em perdas para a missão e para o país. Pesquisadores, como Adams, Kuang e Wang (2018), propõem soluções que utilizam análise espacial em 3D para lidar com esse problema e melhorar a segurança das missões.</p>

<p> Com base nas informações fornecidas sobre o terreno da área da missão, o algoritmo montará um grafo a partir dos nós e arestas inseridos pelo usuário, atribuindo pesos às arestas com base no cálculo balanceado entre distância e altitude. Uma vez que o grafo é montado, o sistema calcula o peso total das possíveis trajetórias e escolhe a de menor peso, disponibilizando a rota mais eficiente para a equipe. </p>

<p> Tendo esse contexto em vista, foi desenvolvida uma solução para missões de baixa altitude, permitindo que a melhor rota seja escolhida entre o ponto inicial e final, balanceando a distância, altitude e características específicas da missão, como a aeronave usada, áreas de exclusão (como zonas populadas que são colocadas em risco durante as missões), entre outros fatores. Além disso, altitudes elevadas devem ser evitadas ao máximo, e não excluídas, para manter a segurança do piloto e reduzir a visibilidade da nave para possíveis inimigos. Essa solução proposta por Liu, Wang, Zhou e Yang (2021) utiliza um sistema inteligente de planejamento de missões para drones de baixa altitude, levando em consideração diversos fatores para encontrar a melhor rota.</p>



# Trabalhos relacionados



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



# Análise da complexidade da solução proposta

Neste artigo, cada grupo precisará fazer a análise de complexidade da solução proposta, utilizando as notações $O(.)$, $\Omega(.)$ e $\Theta(.)$.

A seguir temos a citação de alguns trechos de DASGUPTA et. al. (2011) para mostrar como estas notações são em \LaTeX. 

> Sejam $f(n)$ e $g(n)$ duas funções de inteiros positivos em reais positivos. Dizemos que $f = O(g)$ (que significa que "$f$ não cresce mais rápido do que $g$") se existe uma constante $c > 0$ tal que $f(n) \leq c \cdot g(n)$.

Ainda em outro trecho de DASGUPTA et. al. (2011), temos:

> Assim como $O(.)$ é análogo a $\leq$, podemos definir análogos de $\geq$ e $=$ como se segue:

> $f = \Omega(g)$ significa $g = O(f)$

# Análise da corretude da solução proposta

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
