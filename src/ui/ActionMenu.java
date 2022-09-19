package ui;

import java.util.Scanner;

public class ActionMenu extends UiUtil {
    public void lerMenuPrincipal(){
        menuInicial();
        Scanner ler = new Scanner(System.in);

        int option = ler.nextInt();

        switch (option){
            case 1:
                menuAssociacao();
                lerMenuAssociacao();
                break;

            case 2:
                menuParceiros();
                lerMenuParceiros();
                break;

            case 3:
                menuFuncionarios();
                lerMenuFuncionarios();
                break;

            case 4:
                menuDoacoes();
                lerMenuDoacoes();
                break;

            default:
                clear();
                lerMenuPrincipal();
                break;
        }
    }

    public void lerMenuAssociacao(){

        Scanner ler = new Scanner(System.in);
        int option = ler.nextInt();

        switch (option){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            case 4:
                lerMenuPrincipal();
                break;

            default:
                clear();
                lerMenuPrincipal();
        }
    }

    public void lerMenuParceiros(){
        Scanner ler = new Scanner(System.in);
        int option = ler.nextInt();
        switch (option){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            case 4:
                lerMenuPrincipal();
                break;
            default:
                clear();
                lerMenuPrincipal();
        }
    }
    public void lerMenuFuncionarios(){
        Scanner ler = new Scanner(System.in);
        int option = ler.nextInt();
        switch (option){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            case 4:
                lerMenuPrincipal();
                break;
            default:
                clear();
                lerMenuPrincipal();
        }
    }
    public void lerMenuDoacoes(){
        Scanner ler = new Scanner(System.in);
        int option = ler.nextInt();
        switch (option){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            case 4:
                lerMenuPrincipal();
                break;
            default:
                clear();
                lerMenuPrincipal();
        }
    }
}
