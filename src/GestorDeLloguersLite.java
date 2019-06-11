import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class GestorDeLloguersLite {
    public static void main(String[] args) throws ParseException {


        Client a = new Client("1233211L","Josep","123321112");
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);

        // demostració de construccuó d'un lloguer amb una data

        Lloguer lloguerBasic = new Lloguer("2/8/2013", 2, vehicleBasic);

        a.afegeix(lloguerBasic);

        lloguerBasic = new Lloguer("8/8/2013", 2, vehicleBasic);


        a.afegeix(lloguerBasic);



        imprimir(a,a.lloguers);
    }
    private static void imprimir(Client client, Vector<Lloguer> lloguers){
        System.out.println("Informació del Client");
        System.out.println("Nom: " + client.getNom());
        System.out.println("Nif: "+ client.getNif());
        System.out.println("Telefon: "+ client.getTelefon());

        System.out.println("\nInformació del lloguers");
        System.out.println("Lloguers: " + client.lloguers.size());
        for (int i = 0; i < client.lloguers.size(); i++) {
            System.out.println("Marca: " + client.lloguers.get(i).vehicle.getMarca());
            System.out.println("Model: " + client.lloguers.get(i).vehicle.getModel());
            System.out.println("Data d'inici: " + client.lloguers.get(i).getData());
            System.out.println("Dies llogats: " + client.lloguers.get(i).getDies() + "\n");
        }

    }
}
