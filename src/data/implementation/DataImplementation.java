package data.implementation;

import data.DataInterface;
import models.AssosiacoesModel;

import java.util.ArrayList;

public class DataImplementation implements DataInterface {

    ArrayList<AssosiacoesModel> dados = new ArrayList<>();




    @Override
    public void save(AssosiacoesModel assosiacoesModel){
        dados.add(assosiacoesModel);
    }

    @Override
    public ArrayList<AssosiacoesModel> getAll() {
        return dados;

    }

    @Override
    public void delete(int cnpj) {
        for(AssosiacoesModel assosiacoesModel : dados){
            if (assosiacoesModel.getCnpj()== cnpj){
                dados.remove(assosiacoesModel);
            }
        }

    }

    @Override
    public void update() {

    }
    //metodos que irão retornar listas, usarei como banco de dados simples

}
