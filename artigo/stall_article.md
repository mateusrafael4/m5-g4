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

<p>Missões aéreas são parte integrante das atividades militares de muitos países em todo o mundo. Essas missões desempenham uma variedade de funções, incluindo defesa, reconhecimento e resgate. No entanto, algumas missões necessitam de serem feitas em baixa altitude e, por isso, apresentam desafios significativos que precisam ser enfrentados para garantir o sucesso da missão e a segurança dos envolvidos. Um dos principais desafios das missões de baixa altitude é a falta de um bom reconhecimento do terreno e do relevo, o que pode aumentar significativamente o risco de colisão ou passagem por zonas de risco, como territórios inimigos ou áreas populacionais. Esses riscos podem levar à destruição da aeronave e/ou ao acidente do piloto, podendo resultar em perdas significativas para a missão e para o país.
</p>
<br><p>A partir das informações concedidas sobre o terreno da área da missão, o algoritmo montará um grafo a partir dos nós e arestas inseridos pelo usuário, atribuindo pesos às arestas com base no cálculo balanceado entre distância e altitude.</p>
<br><p>Uma vez montado o grafo, o sistema calculará o peso total das possíveis trajetórias e escolherá a de menor peso, assim disponibilizando para a equipe a melhor rota entre o ponto inicial e final.</p>
<br><p>Tendo esse contexto em vista, desenvolveu-se uma solução para missões de baixa altitude, possibilitando que seja escolhida a melhor rota entre o ponto inicial e final, balanceando a distância, altitude e características específicas da missão, como a aeronave usada, áreas de exclusão (como zonas populadas que são colocadas em risco durante as missões), etc. Além disso, têm-se que altas altitudes devem ser evitadas ao máximo, não excluídas, com a finalidade de manter a segurança do piloto e diminuir a visibilidade da nave à possíveis inimigos. </p>



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

DASGUPTA, S.; Papadimitriou, C.; Vazirani, U. **Algoritmos.** Porto Alegre: AMGH, 2011. 1 recurso online. ISBN 9788563308535. Disponível em: https://integrada.minhabiblioteca.com.br/books/9788563308535. Acesso em: 17 jan. 2023.