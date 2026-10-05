package repeticaoAtividade;

public class Main {
    public static void main(String[] args) {

        for(int i=0; i < 30; i++){
            System.out.println((i + 1));
        }

        System.out.println("*------------------------------------*");
        for (int i = 10; i > 0; i--) {
            System.out.println((i));
        }
        System.out.println(("Fim"));

        System.out.println("*------------------------------------*");
        int i = 1;
        while (i <= 10){
            System.out.println((i));
            i++;
        }

        System.out.println("*------------------------------------*");
        int num = 2;
        for(int a=1; a <= 10; a++){
            System.out.println(num + " x " + a + " = " + (num * a));
        }


    }
}
