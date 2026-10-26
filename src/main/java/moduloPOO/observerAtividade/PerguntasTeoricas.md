1- Qual problema o padrão Observer resolve? Dê um exemplo do dia a dia que funcione como ele.<br>

<span style="color: green;">resolve o problema de manter vários objetos atualizados quando o estado de um objeto muda, sem que ele precise conhecer os detalhes de cada um que depende dele.<br>
Um exemplo: notificação de vagas no linkedin, eu ativei alertas de vagas de java + spring<br>
Subject: o sistema responsável pelas vagas e pelos alertas.<br>
Observer: você, como usuária inscrita para receber notificações.<br>
Evento: uma nova vaga compatível é publicada.<br>
Notificação: o LinkedIn envia um alerta sobre a oportunidade.</span><br><br>

2 - No Observer, o que é o Subject  e o que é o Observer? Como o Subject avisa os observadores sem conhecer as classes concretas deles? <br>

<span style="color: green;">Subject=> é quem tem o estado, guarda a lista de observers e oferece 3 operações: inscrever, desiscrever e notificar.<br>
Observer=> É o objeto que deseja receber notificações quando o estado do Subject mudar.<br>
avisa por meio de um interface, o Subject conhece apenas o contrato Observer, e não as classes concretas que implementam essa interface.</span><br><br>

3 - Se você precisar adicionar um novo interessado, por exemplo um Entregador que também precisa saber quando o pedido muda de status, o que é preciso alterar na classe Pedido? Por quê?



