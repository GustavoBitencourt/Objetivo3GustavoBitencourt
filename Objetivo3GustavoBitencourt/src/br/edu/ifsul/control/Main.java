package br.edu.ifsul.control;

import br.edu.ifsul.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {



    public static List<AssociadoVip> main(String[] args) {

        ContaPoupanca contap1 = new ContaPoupanca(1, 200);
        ContaPoupanca contap2 = new ContaPoupanca(2, 300);
        ContaPoupanca contap3 = new ContaPoupanca(3, 400);
        System.out.println("\nContas Poupança:\n" + contap1 +  contap2 +  contap3);

        ContaCorrente contac1 = new ContaCorrente(4, 500, 1, 100);
        ContaCorrente contac2 = new ContaCorrente(5, 600, 1, 400);
        ContaCorrente contac3 = new ContaCorrente(6, 700, 1, 600);
        System.out.println("\nContas Corrente:\n" + contac1 + contac2 + contac3);

        Associado assoc1 = new Associado(7, 600, 1);
        Associado assoc2 = new Associado(8, 300, 1);
        Associado assoc3 = new Associado(9, 600, 1);
        System.out.println("\nAssociados:\n" +assoc1 + assoc2 + assoc3);

        List<Conta> contas = new ArrayList<>();
        contas.add(contac1);
        contas.add(contac2);
        contas.add(contac3);
        contas.add(contap1);
        contas.add(contap2);
        contas.add(contap3);
        System.out.println("\nContas :\n" + contas);

        List<AssociadoVip> vips = new ArrayList<>();
        vips.add(contac1);
        vips.add(contac2);
        vips.add(contac3);
        vips.add(assoc1);
        vips.add(assoc2);
        vips.add(assoc3);
        System.out.println("\nAssociados Vip: \n"+ vips);

        //Movimentação Conta Poupança

        contap1.deposita(1000);
        contap1.atualiza(0.05);
        contap1.saca(50);
        System.out.println(contap1);

        //Movimentação Conta Corrente

        contac1.deposita(500);
        contac1.saca(400);
        System.out.println(contac1);

        //Cotas Vip

        // assoc1.lucros(100, 1);
        // assoc2.lucros(400, 1);
        // assoc3.lucros(600, 1);
        // contac1.lucros(300, 1);
        // contac2.lucros(600, 1);
        // contac3.lucros(600, 1);
        System.out.println("Coleções Vips");
        System.out.println(vips);

        // Ordenando

        System.out.println("\nOrdenação pelo número de Cotas Descrescente\n");

        vips.sort(Comparator.comparingInt(AssociadoVip::getqdeCotas).reversed());
        System.out.println(vips);

       // System.out.println("\nAssociado com maior número de cotas no sistema\n" + Collections.max(vips, Comparator.comparingDouble(AssociadoVip::getqdeCotas)));

        System.out.println("\nAssociados com o maior número de cotas" + Main.getMaxVips(vips));

        private static List<AssociadoVip> getMaxVips(List<AssociadoVip> vips){
            List<AssociadoVip> maxs = new ArrayList<>();
            if(!vips.isEmpty()){
                AssociadoVip invMax =  Collections.max(vips, Comparator.comparingInt(AssociadoVip::getqdeCotas));
                maxs.add(invMax);
                for (int i = 1; i < vips.size(); i++) {
                    if(invMax.getqdeCotas() == vips.get(i).getqdeCotas()){
                        maxs.add(vips.get(i));
                    }
                }
            }
            return maxs;
        }


        System.out.println("\nContas cadastradas, ordenada por saldo em ordem decrescente\n");
        contas.sort(Comparator.comparingInt(Conta:getSaldo).reversed());
        System.out.println(contas);

    }
}
