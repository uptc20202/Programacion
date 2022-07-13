package models;

import structures.SimpleList;

import java.util.Objects;

public class ChainOfStores {

    private SimpleList<Store> stores = new SimpleList<Store>((x, y)-> Integer.valueOf(x.getName()) -Integer.valueOf(y.getName()));

    public void createStore(String name , String address){ // 1. Crear un nuevo almacén
        Store newStore = new Store(name,address);
        stores.insert(newStore);
    }

    public String getStoreStock(){ //2. Visualizar la información del valor total del inventario de la cadena
        int stockValue = 0;
        for (Store store:stores) {
            stockValue += store.getInventoryValue();
        }
        return "VALOR DE TODO EL STOCK: "+stockValue;
    }

    public String showStores(){
        StringBuilder string = new StringBuilder();
        if(stores.isEmpty()){
            string.append("No hay tiendas");
        }else{
            for (Store store: stores) {
                string.append("Tienda: ").append(store.getName()).append(" Direccion: ").append(store.getAddress());
            }
        }
        return string.toString();
    }

    public Store storeGetter(String name){
        for (Store str:stores) {
            if(Objects.equals(name, str.getName())){
                return str;
            }
        }
        return null;
    }

    public SimpleList<Store> getStoreList() {
        return stores;
    }
}
