import java.util.Date;

public class Lloguer {
    private String  data;
    private int dies;
    public Vehicle vehicle;

    public Lloguer(String data,int dies, Vehicle vehicle){
        this.data=data;
        this.dies=dies;
        this.vehicle=vehicle;
    }

    public String  getData() {
        return data;
    }

    public int getDies() {
        return dies;
    }

    public void setDies(int dies) {
        this.dies = dies;
    }

    public void setData(String  data) {
        this.data = data;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public double quantitat() {
        double quantitat = 0;
        switch (getVehicle().getCategoria()) {
            case Vehicle.BASIC:
                quantitat += 3;
                if (getDies() > 3) {
                    quantitat += (getDies() - 3) * 1.5;
                }
                break;
            case Vehicle.GENERAL:
                quantitat += 4;
                if (getDies() > 2) {
                    quantitat += (getDies() - 2) * 2.5;
                }
                break;
            case Vehicle.LUXE:
                quantitat += getDies() * 6;
                break;
        }
        return quantitat;
    }

    public int bonificacions(){
        int bonificacions=0;
        bonificacions ++;

        // afegeix bonificació per dos dies de lloguer de Luxe
        if (getVehicle().getCategoria() == Vehicle.LUXE &&
                getDies()>1 ) {
            bonificacions ++;
        }
        return bonificacions;
    }
}
