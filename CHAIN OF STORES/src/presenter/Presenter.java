package presenter;

import models.ChainOfStores;
import models.Store;
import views.GUI;

public class Presenter  {

    ChainOfStores stores;
    GUI view;

    public Presenter() {
        stores = new ChainOfStores();
        view = new GUI();
        view.printWaterMark();
        start();
    }

    private void start(){
        view.showMenu();
        int option = view.getOption();
        while (option != 4){
            if(option == 1){
                createStore();
            }else if(option == 2){
                printStock();
            }else if(option == 3){
                if(stores.getStoreList().isEmpty()){
                    view.printMessage("No hay tiendas");
                }else{
                    view.printMessage(stores.showStores());
                    enterStore();
                }
            }else{
                view.printMessage("Seleccione una opction correcta");
            }
            view.showMenu();
            option = view.getOption();
        }
    }

    private void enterStore() {
        view.printMessage("Inserte el nombre de la tienda a acceder... ");
        Store store = stores.storeGetter(view.getMessage());
        view.printMessage("Tienda accedida --> " + store.getName());
        view.printMenuForStore();
        int choice = view.getOption();
        while (choice != 7){
            if(choice == 1){
                view.printMessage("Diguite el nombre del producto");
                String name = view.getMessage();
                view.printMessage("Diguite la cantidad de producto");
                int amount = view.getOption();
                view.printMessage("Diguite el valor de producto");
                int unitValue = view.getOption();
                store.addProduct(name,amount,unitValue);

            }else if(choice == 2){
                if(store.getProductList().isEmpty()){
                    view.printMessage("No hay productos");
                }else{
                    view.printMessage("Diguite el id del producto que busca");
                    view.printMessage(store.getProductListAsString());
                    view.printMessage(store.getProductByID(view.getOption()).toString());
                }
            }else if(choice == 3) {
                view.printMessage(store.getProductListAsString());
            }else if(choice ==4){
                view.printMessage(Integer.toString(store.getInventoryValue()));
            }else if(choice == 5){
                view.printMessage("Diguite el producto vendido");
                int target = view.getOption();
                int ammount = view.getOption();
                store.removeProductByID(target,ammount);
            }else{
                view.printMessage("Seleccione una opction correcta");
            }
            view.printMenuForStore();
            choice = view.getOption();
        }
    }

    private void printStock() {
        view.printMessage(stores.getStoreStock());
    }

    private void createStore() {
        view.printMessage("Diguite el nombre de la tienda");
        String name = view.getMessage();
        view.printMessage("Diguite la direccion de la tienda");
        String adress = view.getMessage();
        stores.createStore(name,adress);
        view.printMessage("Tienda creada...");
    }


}
