package service;

import data.implementation.DataImplementation;
import models.AssosiacoesModel;

import java.util.ArrayList;
import java.util.Scanner;

public class AssociacaoService {
    DataImplementation dataImplementation = new DataImplementation();
    public void pegaInformacoesESalva(){
        Scanner ler = new Scanner(System.in);
        AssosiacoesModel model = new AssosiacoesModel();
        System.out.println("\nDigite o CNPJ: ");
        int cnpj = ler.nextInt();
        model.setCnpj(cnpj);
        System.out.println("\nDigite a Razão Social: ");
        model.setRazaoSocial(ler.next());
        System.out.println("\nDigite o nome do Presidente: ");
        model.setPresidente(ler.next());
        System.out.println("\nDigite o nome do Vice Presidente: ");
        model.setVicePresidente(ler.next());
        System.out.println("\nDigite o nome do Secretário: ");
        model.setSecretario(ler.next());
        System.out.println("\nDigite o nome dos Parceiros: ");
        model.setParceiros(ler.next());

        dataImplementation.save(model);
        System.out.println("Salvo com sucesso !!!");


    }
    public void listar(){
        ArrayList<AssosiacoesModel> listar = dataImplementation.getAll();
        for (AssosiacoesModel assosiacoesModel : listar){
            System.out.println(assosiacoesModel.toString());
        }
    }
}
