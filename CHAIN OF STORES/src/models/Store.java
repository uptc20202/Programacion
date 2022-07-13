package models;

import structures.DoubleLinkedList;

public class Store {
    private String name;
    private String adress;
    private Product targeterHelper = new Product(-1,"default",0,0);
    private int idForProducts = 0;
    private DoubleLinkedList<Product> productList = new DoubleLinkedList<>((x,y)-> x.getId()-y.getId());

    public Store(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public void addProduct(String name,int amount, int unitValue){
        idForProducts++;
        productList.insert(new Product(idForProducts,name,amount,unitValue));
    }

    public String getProductListAsString(){
        StringBuilder string = new StringBuilder();
        for (Product product:productList) {
            string.append(product.toString()).append("\n");
        }
        return string.toString().toString();
    }

    public Product getProductByID(int id){
        targeterHelper.setId(id);
        return productList.get(targeterHelper);
    }

    public void removeProductByID(int id, int amount){
        getProductByID(id).setAmmount(getProductByID(id).getAmmount() - amount);
    }

    public int getInventoryValue(){
        int inventoryValue = 0;
        for (Product product:productList) {
            inventoryValue += product.getUnitValue() * product.getAmmount();
        }
        return inventoryValue;
    }

    public String getAddress() {
        return adress;
    }

    public String getName() {
        return name;
    }

    public DoubleLinkedList getProductList(){
        return productList;
    }
}
