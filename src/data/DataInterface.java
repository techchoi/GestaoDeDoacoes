package data;

import models.AssosiacoesModel;

import java.util.ArrayList;

public interface DataInterface {

    public void save(AssosiacoesModel assosiacoesModel); // isso é uma assinatura
    public ArrayList<AssosiacoesModel> getAll();
    public void delete(int cnpj);
    public void update(int cnpj,AssosiacoesModel associacaoModelNovo);

}
