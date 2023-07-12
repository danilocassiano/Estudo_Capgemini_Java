public class Aritmeticos {
    public static void main(String[] args) throws Exception {
        int num1, num2, num3;       

        num1 = 10;
        num2 = 20;
        num3 = num1 + num2;

        System.out.println("A soma é: " + num3);

        num1 = 10;
        num2 = 20;
        num3 = num1 - num2;

        System.out.println("A subtração é: " + num3);

        num1 = 10;
        num2 = 20;
        num3 = num1 * num2;

        System.out.println("A multiplicação é: " + num3);

        num1 = 20;
        num2 = 2;
        num3 = num1 / num2;

        System.out.println("A divisão é: " + num3);


        System.out.println("__________Adicionando +1 na contagem_________________________");

        num1 = 1;
        
        while (num1 <= 10){
            System.out.println(num1);
            num1++;
        }

        System.out.println("_________Subtraindo +1 na contagem__________________________");

        num1 = 10;
        
        while (num1 >= 1){
            System.out.println(num1);
            num1--;
        }

    }
}
