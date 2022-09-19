package ui;

import java.util.Scanner;

public class ActionMenu extends UiUtil {
    void lerMenuPrincipal(){
        Scanner ler = new Scanner(System.in);

        int option = ler.nextInt();

        switch (option){
            case 1:
                menuAssociacao();
                break;

            case 2:
                menuParceiros();
                break;

            case 3:
                menuFuncionarios();
                break;

            case 4:
                menuDoacoes();
                break;

            default:
                clear();
                menuInicial();
                break;
        }
    }

    void lerMenuAssociacao(){
        Scanner ler = new Scanner(System.in);
        int option = ler.nextInt();

        switch (option){
            case 1:
                
        }
    }
}
