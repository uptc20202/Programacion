package models;

public class Product {
    private int id;
    private String name;
    private int ammount;
    private int unitValue;

    public Product(int id, String name, int ammount, int unitValue) {
        this.id = id;
        this.name = name;
        this.ammount = ammount;
        this.unitValue = unitValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public int getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(int unitValue) {
        this.unitValue = unitValue;
    }

    @Override
    public String toString() {
        return "Producto: "+name+" id= "+id+", Unidades= "+ammount+", precio=" + unitValue;
    }
}
