package arrayDequeAtividade;

import java.util.ArrayDeque;
import java.util.List;

public class Main {
    public static void main(String[] args) {


//        1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila
//        e quantas pessoas tem.
        ArrayDeque<String> pessoa = new ArrayDeque<>();

        pessoa.addAll(List.of("Pamela", "João", "Maria"));
        System.out.println(pessoa);
        System.out.println(pessoa.size());

//        2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
//        imprima a fila logo depois. Repare que ela não mudou.
        System.out.println(pessoa.peek());
        System.out.println(pessoa);

//        3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila
//        depois. Compare com o exercício 2.
        System.out.println(pessoa.poll());
        System.out.println(pessoa);


//        4. Crie uma fila com três nomes e atenda todos usando
//        while (!fila.isEmpty()). No final, imprima "Fila vazia!".
        pessoa.add("Márcia");
        System.out.println(pessoa);

        while(!pessoa.isEmpty()){
            pessoa.poll();
        }

        System.out.println("Fila vazia " + pessoa);

//        5. Crie uma fila com três nomes e use contains para responder duas
//        perguntas: se "Bia" está na fila e se "Zoe" está.
        pessoa.addAll(List.of("Pedro", "Marilia", "Bia"));

        System.out.println("Bia está na fila? " + pessoa.contains("Bia") + " Zoe está na fila? " + pessoa.contains("Zoe"));

//        6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
//        - se estiver vazia  -> "Não tem ninguém na fila."
//                - se tiver gente    -> "Próximo: [nome]"
//        Depois adicione uma pessoa e teste de novo.
        ArrayDeque<String> filavazia = new ArrayDeque<>();
        // Teste com a fila vazia
        if(filavazia.isEmpty()){
            System.out.println("Não tem ninguém na fila.");
        }else {
            System.out.println("Próximo: " + filavazia.peek());
        }

        filavazia.add("Pamela");

        // Teste novamente
        if (pessoa.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + filavazia.peek());
        }


    }
}
