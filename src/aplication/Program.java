package aplication;

import entities.Funcionario;
import entities.FuncionarioTercerizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        List<Funcionario> list = new ArrayList<>();


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o numero de funcionarios? ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            System.out.print("Funcionarios #"+ i + " dados: ");
            System.out.print("funcionario Tercerizado: [y/n] ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por horas: ");
            double valorPorHoras = sc.nextDouble();
            if (ch == 'y'){
                System.out.print("Taxas adicionais: ");
                double horasAdicionais = sc.nextDouble();
                Funcionario fun = new FuncionarioTercerizado(nome, horas, valorPorHoras,horasAdicionais);
                list.add(fun);

            }
            else {
                Funcionario fun = new Funcionario(nome, horas, valorPorHoras);
                list.add(fun);

            }
            System.out.println();
            for(Funcionario fun : list){
                System.out.println(fun.getNome() + " - r$: " + String.format("%.2f%n",fun.pagamento()));
            }

        }
        sc.close();
    }
}
