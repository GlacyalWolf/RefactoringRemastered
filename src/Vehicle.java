public class Vehicle {
    private String model;
    private String marca;
    private int categoria;
    public static final int BASIC=0;
    public static final int GENERAL=1;
    public static final int LUXE=2;

    public Vehicle(String marca,String model,int categoria){
        this.model=model;
        this.marca=marca;
        this.categoria=categoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
