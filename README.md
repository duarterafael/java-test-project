Estamos animadas para ver você em sua entrevista seguindo o formato de *pair programming.*

Este documento apresenta informações sobre o exercício de codificação que abordaremos durante a sua entrevista. Pedimos que você se familiarize com o problema, pense em abordagens para resolvê-lo, mas esteja ciente de que será necessário implementar uma solução do zero durante a entrevista. Vale ressaltar que, devido ao tempo limitado da entrevista, não é esperado que a tarefa seja concluída integralmente.

Caso você tenha alguma dúvida ou precise de esclarecimentos sobre a tarefa, podemos discutir esses assuntos durante a entrevista.

## URL do Github:
Java: https://github.com/duarterafael/java-test-project

## O que você precisa preparar antes da entrevista
1. Clonar o repositório a partir da URL do GitHub fornecida proporcionará um projeto inicial simples com um único teste de falha.
2.  Antes de se apresentar para a entrevista, certifique-se de conseguir executar o teste e trabalhar com o projeto em seu editor de texto ou IDE preferido. Isso garantirá que possamos dedicar a maior parte do tempo à codificação durante a entrevista.
3.  Caso prefira utilizar uma ferramenta de testes diferente, sinta-se à vontade para modificar o projeto conforme suas preferências. No entanto, solicitamos que mantenha um ambiente funcional com um teste resultando em falha.
3.  Lembre-se de que é permitido utilizar sites de busca para esclarecer dúvidas durante a entrevista.
4.  Certifique-se de estar em um ambiente confortável, silencioso e com acesso à internet ao realizar a ligação.
5.  Utilize um sistema operacional com o qual você esteja familiarizada. Leve em consideração a possibilidade de precisar ajustar configurações de rede, áudio, vídeo e opções do navegador.
6.  Durante a entrevista, esperamos que compartilhe sua tela usando o software indicado, conforme avançamos no exercício. Instruções específicas sobre como fazer isso serão fornecidas durante a entrevista.

## Exercício: Reserva de Hotel
A rede de hotelaria Gran Hotel RBD deseja desenvolver uma plataforma digital de reservas, considerando três estabelecimentos: Palm Plaza Resor, Elegance Haven Hotel e Azure Horizon Retreat. Cada hotel apresenta tarifas distintas para dias de semana e finais de semana, além de valores específicos para participantes do programa de VIP. Adicionalmente, a quantidade de estrelas de cada hotel reflete a excelência do serviço oferecido.

Detalhes específicos para cada hotel são os seguintes:

1\. **Palm Plaza Resor:**
- Quantidade de estrelas: 3
- Tarifas para dias de semana:
  - Cliente normal: R$110
  - Participante do programa de VIP: R$80
- Tarifas para finais de semana:
  - Cliente normal: R$90
  - Participante do programa de VIP: R$80

2\. **Elegance Haven Hotel**
- Quantidade de estrelas: 4
- Tarifas para dias de semana:
  - Cliente normal: R$160
  - Participante do programa de VIP: R$110
- Tarifas para finais de semana:
  - Cliente normal: R$60
  - Participante do programa de VIP: R$50
3\. **Azure Horizon Retreat**
- Quantidade de estrelas: 5
- Tarifas para dias de semana:
  - Cliente normal: R$220
  - Participante do programa de VIP: R$100
- Tarifas para finais de semana:
  - Cliente normal: R$150
  - Participante do programa de VIP: R$40

Essas informações fornecem a base para a implementação da plataforma digital de reservas, permitindo aos clientes escolherem entre as opções de acordo com suas preferências, dias da semana ou fins de semana, e status no programa de VIP.

|**Hotel**|**Quantidade de estrelas**|**Dia de semana**|**Dia de semana**|**Fim de semana**|**Fim de semana**|
| :-: | :-: | :-: | :-: | :-: | :-: |
|||(regular)|(VIP)|(regular)|(VIP)|
|<p></p><p>Palm Plaza Resor</p>|<p></p><p>3</p>|<p></p><p>R$110</p>|<p></p><p>R$80</p>|<p></p><p>R$90</p>|<p></p><p>R$80</p>|
|<p></p><p>Elegance Haven Hotel</p>|<p></p><p>4</p>|<p></p><p>R$160</p>|<p></p><p>R$110</p>|<p></p><p>R$60</p>|<p></p><p>R$50</p>|
|<p></p><p>Azure Horizon Retreat</p>|<p></p><p>5</p>|<p></p><p>R$220</p>|<p></p><p>R$100</p>|<p></p><p>R$150</p>|<p></p><p>R$40</p>|

Escreva um programa para encontrar o hotel mais barato. A entrada do programa será uma sequência de datas para um cliente participante ou não do programa de VIP. Utilize "Regular" para denominar um cliente normal e "VIP" para um cliente participante do programa de VIP. A saída deverá ser o hotel disponível mais barato e em caso de empate, o hotel com a maior quantidade de estrelas deverá ser retornado.
# **Formato da entrada:**
<tipo_do_cliente>: <data_1>, <data_2>, <data_3>, ...
# **Formato da saída:**
<nome_do_hotel_mais_barato>
  
# **Exemplos:**
**Entrada 1:**
Regular: 16Mar2020(mon), 17Mar2020(tues), 18Mar2020(wed)
# **Saída 1:**
Parque das flores

# **Entrada 2:**
Regular: 20Mar2020(fri), 21Mar2020(sat), 22Mar2020(sun)
# **Saída 2:**
Elegance Haven Hotel

# **Entrada 3:**
Fidelidade: 26Mar2020(thur), 27Mar2020(fri), 28Mar2020(sat)
# **Saída 3:**
Azure Horizon Retreat
