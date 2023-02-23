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

<p>Missões aéreas são parte integrante das atividades militares em muitos países pelo mundo. Essas missões têm uma variedade de funções, incluindo defesa, reconhecimento e resgate. No entanto, algumas missões precisam ser realizadas em baixa altitude (no máximo 500 a 1000 pés) e, portanto, apresentam desafios significativos que precisam ser enfrentados para garantir o sucesso da missão e a segurança dos envolvidos.</p>

<br><p>Um dos principais desafios das missões de baixa altitude é a falta de bom reconhecimento do terreno e do relevo, o que pode aumentar significativamente o risco de colisão ou passagem por zonas de risco, como territórios inimigos ou áreas populacionais. Esses riscos podem levar à destruição da aeronave e/ou ao acidente do piloto, resultando em perdas significativas para a missão e para o país. Pesquisadores, como Adams, Kuang e Wang (2018), propõem soluções que utilizam análise espacial em 3D para lidar com esse problema e melhorar a segurança das missões.</p>

<br><p>Com base nas informações fornecidas sobre o terreno da área da missão, o algoritmo montará um grafo a partir dos nós e arestas inseridos pelo usuário, atribuindo pesos às arestas com base no cálculo balanceado entre distância e altitude. Uma vez que o grafo é montado, o sistema calcula o peso total das possíveis trajetórias e escolhe a de menor peso, disponibilizando para a equipe a melhor rota entre o ponto inicial e final.</p>

<br><p>Tendo esse contexto em vista, foi desenvolvida uma solução para missões de baixa altitude, permitindo que a melhor rota seja escolhida entre o ponto inicial e final, balanceando a distância, altitude e características específicas da missão, como a aeronave usada, áreas de exclusão (como zonas populadas que são colocadas em risco durante as missões), entre outros fatores. Além disso, altitudes elevadas devem ser evitadas ao máximo, e não excluídas, para manter a segurança do piloto e reduzir a visibilidade da nave para possíveis inimigos. Essa solução proposta por Liu, Wang, Zhou e Yang (2021) utiliza um sistema inteligente de planejamento de missões para drones de baixa altitude, levando em consideração diversos fatores para encontrar a melhor rota.</p>



# Trabalhos relacionados


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