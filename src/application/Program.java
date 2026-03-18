package application;

import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos contribuintes você vai digitar? ");
        int n = sc.nextInt();
        List<TaxPayer> taxPayerList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("");
            System.out.println("Digite os dados do " + (i+1) + "o contribuinte: ");
            System.out.print("Renda anual com salário: ");
            double salaryIncome = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            double servicesIncome = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double capitalIncome = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            double healthSpending = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            double educationalSpending = sc.nextDouble();
            taxPayerList.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationalSpending));
        }

        for (int i = 0; i < taxPayerList.size(); i++) {
            System.out.println("");
            System.out.println("Resumo do " + (i+1) + "o contribuinte: ");
            System.out.printf("Imposto bruto total: %.2f%n", taxPayerList.get(i).grossTax());
            System.out.printf("Abatimento: %.2f%n", taxPayerList.get(i).taxRebate());
            System.out.printf("Imposto devido: %.2f%n", taxPayerList.get(i).netTax());
        }

        sc.close();
    }

}
