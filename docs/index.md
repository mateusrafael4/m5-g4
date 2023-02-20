<table>
<tr>
<td>
<a href= "https://ael.com.br/"><img src="https://www.ael.com.br/images/ael.png" alt="AEL Sistemas" border="0" width="70%"></a>
</td>
<td><a href= "https://www.inteli.edu.br/"><img src="https://www.inteli.edu.br/wp-content/uploads/2021/08/20172028/marca_1-2.png" alt="Inteli - Instituto de Tecnologia e Liderança" border="0" width="30%"></a>
</td>
</tr>
</table>

<font size="+12"><center>
Planejador de trajetórias para voos em baixa altitude
</center></font>

- [Autores](#autores)
- [Visão Geral do Projeto](#visão-geral-do-projeto)
  - [Empresa](#empresa)
  - [O Problema](#o-problema)
    - [Contexto do problema](#contexto-do-problema)
    - [Variáveis de decisão do problema](#variáveis-de-decisão-do-problema)
    - [Limitações](#limitações)
  - [Objetivos](#objetivos)
    - [Objetivos gerais](#objetivos-gerais)
    - [Objetivos específicos](#objetivos-específicos)
  - [Partes interessadas](#partes-interessadas)
  - [Análise da área de atuação](#análise-da-área-de-atuação)
  - [Análise do cenário: Matriz SWOT](#análise-do-cenário-matriz-swot)
  - [Proposta de Valor: Value Proposition Canvas](#proposta-de-valor-value-proposition-canvas)
  - [Matriz de Risco](#matriz-de-risco)
      - [Ameaças:](#ameaças)
      - [Oportunidades:](#oportunidades)
- [Requisitos do Sistema](#requisitos-do-sistema)
  - [Personas](#personas)
  - [Histórias dos usuários (user stories)](#histórias-dos-usuários-user-stories)
- [Arquitetura do Sistema](#arquitetura-do-sistema)
  - [Módulos do Sistema e Visão Geral (Big Picture)](#módulos-do-sistema-e-visão-geral-big-picture)
  - [Descrição dos Subsistemas](#descrição-dos-subsistemas)
    - [Requisitos de software](#requisitos-de-software)
  - [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [UX e UI Design](#ux-e-ui-design)
  - [Wireframe + Storyboard](#wireframe--storyboard)
  - [Design de Interface - Guia de Estilos](#design-de-interface---guia-de-estilos)
- [Projeto de Banco de Dados](#projeto-de-banco-de-dados)
  - [Modelagem inicial](#modelagem-inicial)
  - [Modelo Conceitual](#modelo-conceitual)
  - [Modelo Lógico](#modelo-lógico)
- [Teste de Software](#teste-de-software)
  - [Testes Unitários](#testes-unitários)
  - [Teste de Usabilidade](#teste-de-usabilidade)
- [Análise de Dados](#análise-de-dados)
  - [Visão geral](#visão-geral)
- [Manuais](#manuais)
  - [Manual de Implantação](#manual-de-implantação)
  - [Manual do Usuário](#manual-do-usuário)
  - [Manual do Administrador](#manual-do-administrador)
- [Referências](#referências)


# Autores

* Gabriel Caetano Nhoncanse
* Jonas Viana Sales
* Mateus Rafael Miranda da Silva
* Raphael Lisboa Antunes
* Sarah Ribeiro
* Sergio Brito Amorim Lucas
* Thomas Frajhof Brand


# Visão Geral do Projeto

## Empresa

A AEL Sistemas é uma empresa brasileira nos seguimentos Aeroespacial, Defesa e Segurança. É baseada na prestação de serviços de tecnologia da informação, incluindo consultoria, projeto, fabricação, implantação e suporte logístico de sistemas eletrônicos militares e espaciais, para aplicações em plataformas aéreas, marítimas e terrestres. Faz parte do grupo Elbit Systems e, também, atua em projetos estratégicos das Forças Armadas Brasileiras como Gripen NG, KC-390, Guarani e SISFRON - Sistema Integrado de Monitoramento de Fronteiras. É pioneira na modernização de várias aeronaves da FAB, Embraer EMB-314 Super Tucano, AMX, F-5EM que leva também o suprimento de peças.

## O Problema

### Contexto do problema
Existem missões áereas que tem a necessidade de serem feitas em baixa altitude, sejam missões defensivas, de reconhecimento, etc., por buscarem um maior sigilo e segurança. <br>Com isso, surgiu um obstáculo nessas missões, visto que sem um bom reconhecimento do terreno/relevo, o risco da aeronave colidir ou passar por zonas de risco, como território inimigo, são aumentados. <br>Tendo esse contexo em vista, surgiu a necessidade de um sistema que reconheça o terreno e auxilie o piloto e o time no traçar da rota da missão, centralizando informações de terreno, da aeronave e de possíveis obstáculos.

### Variáveis de decisão do problema
Tudo que irá compor o peso das arestas será utilizado na solução, sendo a distância entre os nós, diferença de altura e intensidade da curva.

### Limitações

<li>Áreas de exclusão, sendo:
<ul>
<li>Áreas com radares;
<li>Áreas povoadas;
<li>Áreas de patrulha;
<li>Entre outras que o usuário pode designar.
</ul>
<li>Necessidade do algoritmo de dados prévios sobre a aeronave.

## Objetivos

### Objetivos gerais

<b> Qual o objetivo da solução ? </b>

A solução envisa aumentar a confiança em operações de infiltração e reconhecimento utilizando aeronaves de alta velocidade (jatos) em voo baixo, por meio de planejamento estratégico de trajetória de voo, sendo este alimentado por informações de bancos de dados diversos com informações de topografia, da aeronave, e de possíveis forças opositoras. 

O código, de maneira direta, envisona reduzir os riscos de CFIT (Colisão com o solo em voo controlado) e de abatimento por forças opositoras, respondendo a trajetória mais segura e eficiente possível, e com isso, aumentando a confiança das forças armadas brasileiras para esses tipos de missão. 

### Objetivos específicos

*Lista_de_objetivos específicos*

## Partes interessadas

*Lista_e_apresentação_das_partes_interessadas*

## Análise da área de atuação

*Descrição_da_análise_da_área_de_atuação*

## Análise do cenário: Matriz SWOT

 A meta da análise SWOT é facilitar na identificação de características que ajudem o desenvolvimento do projeto. Assim, ela pode potencializar suas forças, mitigar suas fraquezas e minimizar erros, procurar oportunidades para melhorar seus produtos ou criar novos e se manter alerta às ameaças.
 
<p align="center">
<img width="730" height="470" src="img/Swot.PNG.jpg">
</p>


## Proposta de Valor: Value Proposition Canvas

*Value_Proposition_Canvas*


## Matriz de Risco

 O principal objetivo da matriz de risco e oportunidades é a clareza oferecida ao grupo em relação à eventuais problemas que possam ocorrer ao decorrer do desenvolvimento do projeto, possibilitando ao grupo a possibilidade de se previnir dos riscos e buscar as melhores oportunidades.
 
 #### Ameaças:
 <p align="center">
<img width="705" height="480" src="img/Ameaças.jpg">
</p>

 #### Oportunidades:
 <p align="center">
<img width="650" height="480" src="img/Oportunidades.jpg">
</p>

# Requisitos do Sistema

*Descrição_dos_requisitos*

## Personas

*Descrição_das_personas*


## Histórias dos usuários (user stories)

*Descrição_das_histórias_dos_usuários*


# Arquitetura do Sistema

## Módulos do Sistema e Visão Geral (Big Picture)

## Descrição dos Subsistemas

### Requisitos de software


## Tecnologias Utilizadas


# UX e UI Design

## Wireframe + Storyboard

## Design de Interface - Guia de Estilos


# Projeto de Banco de Dados

## Modelagem inicial

<p align="center">
<img width="730" height="470" src="img/Grafo_inicial.jpg">
</p>

<li>No modelo inicial da modelagem dos dados, temos um grafo composto por cidades de São Paulo (Nós em azul) e do Rio de Janeiro (Nós verdes). As arestas representam caminhos que podem ser feitos e, as ligações em vermelho, representam o melhor caminho possível, considerando os pesos das arestas, os quais são calculados pela diferença de altitude entre um nó e outro. Segue abaixo o código usado para criar o grafo.

``` Cypher 
CREATE
(c1:city_rj_great {name: 'Angra dos Reis'}),
(c2:city_rj {name: 'Barra Grande'}),
(c3:city_rj {name: 'Paraty'}),
(c4:city_rj {name: 'Mangaratiba'}),
(c5:city_rj_great {name: 'Duque de Caxias'}),
(c6:city_sp {name: 'Ubatuba'}),
(c7:city_sp {name: 'Caraguatatuba'}),
(c3)-[:alt_3]->(c2),
(c2)-[:alt_3]->(c1),
(c3)-[:alt_6]->(c1),
(c1)-[:alt_8]->(c4),
(c3)-[:alt_2]->(c4),
(c4)-[:alt_6_]->(c5),
(c6)-[:alt_1]->(c3),
(c6)-[:alt_5]->(c1),
(c7)-[:alt_4]->(c6)
SET
c1.degreesSouth = 23, c1.minutesSouth = 0, c1.secondsSouth = 24, c1.degreesWest = 44, c1.minutesWest = 19, c1.secondsWest = 6, c1.altura = 10,
c2.degreesSouth = 23, c2.minutesSouth = 6, c2.secondsSouth = 0, c2.degreesWest = 44, c2.minutesWest = 42, c2.secondsWest = 25, c2.altura = 7,
c3.degreesSouth = 23, c3.minutesSouth = 13, c3.secondsSouth = 11, c3.degreesWest = 44, c3.minutesWest = 42, c3.secondsWest = 59, c3.altura = 4,
c4.degreesSouth = 22, c4.minutesSouth = 56, c4.secondsSouth = 30, c4.degreesWest = 44, c4.minutesWest = 2, c4.secondsWest = 30, c4.altura = 2,
c5.degreesSouth = 22, c5.minutesSouth = 47, c5.secondsSouth = 12, c5.degreesWest = 43, c5.minutesWest = 18, c5.secondsWest = 47, c5.altura = 8,
c6.degreesSouth = 23, c6.minutesSouth = 26, c6.secondsSouth = 4, c6.degreesWest = 45, c6.minutesWest = 5, c6.secondsWest = 5, c6.altura = 5,
c7.degreesSouth = 23, c7.minutesSouth = 37, c7.secondsSouth = 12, c7.degreesWest = 45, c7.minutesWest = 24, c7.secondsWest = 43, c7.altura = 1
RETURN c1, c2, c3, c4, c5, c6, c7 
```

## Modelo Conceitual

## Modelo Lógico


# Teste de Software

## Testes Unitários

## Teste de Usabilidade


# Análise de Dados

## Visão geral
  Atualmente, temos 4 arquivos contendo dados em formato .dt2, os quais, tendo em vista o que foi explorado até o momento, são compostos por longitude, latitude e relevo. Dentre os arquivos, estão listados:
  <li>DeathValley
  <ul>
  <li>W117_N35.dt2
  <li>W117_N36.dt2
  <li>W118_N35.dt2
  <li>W118_N36.dt2
  </ul>
  <li>Rio
  <ul>
  <li>W043_S23.dt2
  <li>W043_S24.dt2
  <li>W044_S23.dt2
  <li>W044_S24.dt2
  </ul>
  <li>SaoPaulo
  <ul>
  <li>W045_S23.dt2
  <li>W045_S24.dt2
  <li>W046_S23.dt2
  <li>W046_S24.dt2
  <li>W047_S23.dt2
  <li>W047_S24.dt2
  </ul>
  <li>Yosemite
  <ul>
  <li>W119_N37.dt2
  <li>W119_N38.dt2
  <li>W120_N37.dt2
  <li>W120_N38.dt2
  <li>W121_N37.dt2
  <li>W121_N38.dt2
  </ul>


# Manuais

## Manual de Implantação

## Manual do Usuário

## Manual do Administrador


# Referências
