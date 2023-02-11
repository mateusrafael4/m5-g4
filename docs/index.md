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

>*Observação 1: A estrutura inicial deste documento é só um exemplo. O seu grupo deverá alterar esta estrutura de acordo com o que está sendo solicitado nos artefatos.*

>*Observação 2: O índice abaixo não precisa ser editado se você utilizar o Visual Studio Code com a extensão **Markdown All in One**. Essa extensão atualiza o índice automaticamente quando o arquivo é salvo.*

**Conteúdo**

- [Autores](#autores)
- [Visão Geral do Projeto](#visão-geral-do-projeto)
  - [Empresa](#empresa)
  - [O Problema](#o-problema)
  - [Objetivos](#objetivos)
    - [Objetivos gerais](#objetivos-gerais)
    - [Objetivos específicos](#objetivos-específicos)
  - [Partes interessadas](#partes-interessadas)
- [Análise do Problema](#análise-do-problema)
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
  - [Modelo Conceitual](#modelo-conceitual)
  - [Modelo Lógico](#modelo-lógico)
- [Teste de Software](#teste-de-software)
  - [Testes Unitários](#testes-unitários)
  - [Teste de Usabilidade](#teste-de-usabilidade)
- [Análise de Dados](#análise-de-dados)
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

A empresa parceira AEL Sistemas, apesar de sua alta requisição de sistemas pelo mercado civil e militar, aéreo, terrestre ou naval, ainda encontra desafios em desenvolver um recurso de mapeamento e sugestão de trajetória para terrain following e vôos em baixa altitude, ao qual possa ser otimizada a viagem e o uso de recursos de forma automatizada ou automática. Assim, trouxe o problema até o Instituto de Tecnologia e Liderança (INTELI), fechando uma parceria para aprendizado dos alunos da instituição e desenvolvimento de um protótipo para o problema apresentado pela tal.

## Objetivos

### Objetivos gerais

Este projeto tem como objetivo principal desenvolver um algoritmo base para desenvolvimento de sistemas embarcados para missões ar-ar, ar-solo e solo-solo.

### Objetivos específicos

*Desenvolver uma interface a partir de uma sequência de grafos gerada por um banco de dados de elevação, o qual foi fornecido pela empresa parceira no projeto;*



## Partes interessadas

*AEL Sistemas;*
*Instituto de Tecnologia e Liderança (INTELI);*
*Alunos/autores do projeto.*

# Análise do Problema

*Descrição_da_análise_do_problema*

## Análise da área de atuação

*Descrição_da_análise_da_área_de_atuação*

## Análise do cenário: Matriz SWOT

 A meta da análise SWOT é facilitar na identificação de características que ajudem o desenvolvimento do projeto. Assim, ela pode potencializar suas forças, mitigar suas fraquezas e minimizar erros, procurar oportunidades para melhorar seus produtos ou criar novos e se manter alerta às ameaças.
 
<p align="center">
<img width="730" height="470" src="img/Swot.PNG.jpg">
</p>


## Proposta de Valor: Value Proposition Canvas

Analisando a proposta de valor, é possível identificar facilmente quais foram as dores trazidas pela empresa parceira e, analisando cada aspecto, quais foram os pontos que o grupo identificou para sanar essa dor. O conteúdo apresentado a seguir, foi apresentado e validado com os parceiros de projeto, para norteamento do grupo ao iniciar o desenvolvimento do algoritmo a partir da validação.

<p align="center">
<img width="950" height="530" src="img/CanvasVP.png.jpg">
</p>


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

As user stories serão o norte do grupo para o desenvolvimento do algoritmo, uma vez que será a base de informações do público que queremos atingir através da solução. Tendo isto em vista, o grupo entendeu que deveria escalar as user stories da nossa persona em 5 tópicos, que serão apresentados a seguir:

  **User Stories Roger Augusto**
*Eu, como Head da Equipe de Tráfego Aéreo Militar, quero o algoritmo proposto, para me auxiliar no traçamento de rotas mais eficazes.*

*Eu, como Head da Equipe de Tráfego Aéreo Militar, quero saber os possíveis obstáculos na trajetória, para garantir a segurança do piloto e da aeronave levando em conta aspectos naturais, como relevo e clima.*

*Eu, como Head da Equipe de Tráfego Aéreo Militar, quero integrar os dados da aeronave, para saber quando alterar o percurso e os recursos necessários para isso.*

*Eu, como Head da Equipe de Tráfego Aéreo Militar, quero adicionar áreas de exclusão, para que a trajetória não considere esse caminho.*

*Eu, como Head da Equipe de Tráfego Aéreo Militar, quero analisar a trajetória para poder discutir sobre os riscos e ganhos dessa missão.*


# Arquitetura do Sistema

## Módulos do Sistema e Visão Geral (Big Picture)

## Descrição dos Subsistemas

### Requisitos de software


## Tecnologias Utilizadas


# UX e UI Design

## Wireframe + Storyboard

## Design de Interface - Guia de Estilos


# Projeto de Banco de Dados

## Modelo Conceitual

## Modelo Lógico


# Teste de Software

## Testes Unitários

## Teste de Usabilidade


# Análise de Dados


# Manuais

## Manual de Implantação

## Manual do Usuário

## Manual do Administrador


# Referências
