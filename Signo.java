import java.util.Scanner;

public class Signo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;
        do {
            System.out.println(" Mes de 01 a 12 e dia: 01 a 30 ou 31 dependendo do mes");
            int mes = 0;
            System.out.print(" Digite a data de aniversario:");
            int data = in.nextInt();
            System.out.print(" Digite o mes de aniversario:");
            mes = in.nextInt();
            switch (mes) {
                case 1:
                    if (data >= 1 && data <= 20) {
                        System.out.println(" O seu signo é Capricornio: 21/01 - 18/02");
                    } else if (data >= 21 && data <= 31) {
                        System.out.println(" O seu signo é Aquario 21/01 - 18/02");
                    } else {
                        System.out.println(" Data invalida: " + data);
                    }
                    break;
                case 2:
                    if (data >= 1 && data <= 18) {
                        System.out.println(" O seu signo é Aquario 21/01 - 18/02 ");
                    } else if (data >= 19 && data <= 28) {
                        System.out.println(" O seu signo é Peixes: 19/02 - 20/03");
                    } else {
                        System.out.println("Data invalida:" + data);
                    }
                    break;
                case 3:
                    if (data >= 1 && data <= 20) {
                        System.out.println(" O seu signo é Peixes: 19/02 - 20/03");
                    } else if (data >= 21 && data <= 31) {
                        System.out.println(" O seu signo é Áries: 21/03 - 20/04");
                    } else {
                        System.out.println(" Data invalida: " + data);
                    }
                    break;
                case 4:
                    if (data >= 1 && data <= 20) {
                        System.out.println(" O seu signo é Áries: 21/03 - 20/04");
                    } else if (data >= 21 && data <= 30) {
                        System.out.println(" O seu signo é Touro: 21/04 - 20/05");
                    } else {
                        System.out.println(" Data invalida: " + data);
                    }
                    break;
                case 5:
                    if (data >= 1 && data <= 20) {
                        System.out.println(" O seu signo é Touro: 21/04 - 20/05 ");
                    } else if (data >= 21 && data <= 31) {
                        System.out.println(" O seu signo é Gemeos: 21/05 - 20/06");
                    } else {
                        System.out.println(" Data invalida: " + data);
                    }
                    break;
                case 6:
                    if (data >= 1 && data <= 20) {
                        System.out.println(" O seu signo é Gemeos: 21/05 - 20/06 ");
                    } else if (data >= 21 && data <= 30) {
                        System.out.println(" O seu signo é Cancer: 21/06 - 22/07");
                    } else {
                        System.out.println(" Data invalida: " + data);
                    }
                    break;
                case 7:
                    if (data >= 1 && data <= 22) {
                        System.out.println(" O seu signo é Cancer: 21/06 - 22/07 ");
                    } else if (data >= 23 && data <= 31) {
                        System.out.println(" O seu signo é Leão: 23/07 - 22/08");
                    } else {
                        System.out.println(" Data invalida: " + data);
                    }
                    break;
                case 8:
                    if (data >= 1 && data <= 22) {
                        System.out.println(" O seu signo é Leão: 23/07 - 22/08 ");
                    } else if (data >= 23 && data <= 31) {
                        System.out.println(" O seu signo é Virgem: 23/08 - 22/09");
                    } else {
                        System.out.println(" Data invalida: " + data);
                    }
                    break;
                case 9:
                    if (data >= 1 && data <= 22) {
                        System.out.println(" O seu signo é Virgem: 23/08 - 22/09 ");
                    } else if (data >= 23 && data <= 30) {
                        System.out.println(" O seu signo é Libra: 23/09 - 22/10");
                    } else {
                        System.out.println(" Data invalida: " + data);
                    }
                    break;
                case 10:
                    if (data >= 1 && data <= 22) {
                        System.out.println(" O seu signo é Libra: 23/09 - 22/10");
                    } else if (data >= 23 && data <= 31) {
                        System.out.println(" O seu signo é Escorpião: 23/10 - 21/11 ");
                    } else {
                        System.out.println(" Data invalida: " + data);
                    }
                    break;
                case 11:
                    if (data >= 1 && data <= 21) {
                        System.out.println(" O seu signo é Escorpião: 23/10 - 21/11 ");
                    } else if (data >= 22 && data <= 30) {
                        System.out.println(" O seu signo é Sargitario: 22/11 - 21/12 ");
                    } else {
                        System.out.println(" Data invalida: " + data);
                    }
                    break;
                case 12:
                    if (data >= 1 && data <= 21) {
                        System.out.println(" O seu signo é Sargitario: 22/11 - 21/12  ");
                    } else if (data >= 22 && data <= 31) {
                        System.out.println(" O seu signo é Capricornio: 22/12 - 20/01 ");
                    } else {
                        System.out.println("Data invalida: " + data);
                    }
                    break;
                default:
                    System.out.println(" Mes invalido!! OBS: meses de 01 a 12");
            }
            System.out.println(" Deseja continuar o programa?");
            System.out.println(" 1 - sim");
            System.out.println(" 2 - não");
            System.out.println(" Digite a opção: ");
            opcao = in.nextInt();
        }
            while (opcao == 1) ;
            System.out.println(" Programa encerrado");
    }
}
