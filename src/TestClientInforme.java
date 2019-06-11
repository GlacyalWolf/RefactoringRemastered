import org.junit.Assert;
import org.junit.Test;

public class TestClientInforme {

    @Test
    public void TestInforme() {
        Client nouClient = new Client ("12233321L", "Isma", "1233211123");


        Vehicle v1 = new Vehicle("Seat", "Leon", Vehicle.BASIC);
        Vehicle v2 = new Vehicle("Toyota", "Prius", Vehicle.GENERAL);
        Vehicle v3 = new Vehicle("Ferrari", "Lusso T", Vehicle.LUXE);

        Lloguer L4 = new Lloguer("10-04-2018", 9, v1);
        Lloguer L5 = new Lloguer("11-05-2018", 10, v2);
        Lloguer L6 = new Lloguer("12-06-2018",11, v3);


        nouClient.afegeix(L4);
        nouClient.afegeix(L5);
        nouClient.afegeix(L6);

        String informe = nouClient.informe();
        String resultat = "Informe de lloguers del client Isma (12233321L)\n" +
                "\tSeat Leon: 360.0€\n" +
                "\tToyota Prius: 720.0€\n" +
                "\tFerrari Lusso T: 1980.0€\n" +
                "Import a pagar: 3060.0€\n" +
                "Punts guanyats: 4\n";
        Assert.assertEquals(resultat,informe);
    }


    @Test
    public void lloguerBasic() {
        Client nouClient = new Client ("12233321L", "Isma", "1233211123");

        Vehicle v1 = new Vehicle("Seat", "Leon", Vehicle.BASIC);
        Lloguer L4 = new Lloguer("10-04-2018", 1, v1);
        nouClient.afegeix(L4);

        String informe = nouClient.informe();
        String resultat = "Informe de lloguers del client Isma (12233321L)\n" +
                "\tSeat Leon: 90.0€\n" +
                "Import a pagar: 90.0€\n" +
                "Punts guanyats: 1\n";

        Assert.assertEquals(resultat,informe);
    }


    @Test
    public void lloguerBasic2() {
        Client nouClient = new Client ("12233321L", "Isma", "1233211123");

        Vehicle v1 = new Vehicle("Seat", "Leon", Vehicle.BASIC);
        Lloguer L4 = new Lloguer("10-04-2018", 16, v1);
        nouClient.afegeix(L4);

        String informe = nouClient.informe();
        String resultat = "Informe de lloguers del client Isma (12233321L)\n" +
                "\tSeat Leon: 675.0€\n" +
                "Import a pagar: 675.0€\n" +
                "Punts guanyats: 1\n";

        Assert.assertEquals(resultat,informe);
    }


    @Test
    public void lloguerGeneral() {
        Client nouClient = new Client ("12233321L", "Isma", "1233211123");

        Vehicle v2 = new Vehicle("Toyota", "Prius", Vehicle.GENERAL);
        Lloguer L5 = new Lloguer("11-05-2018", 1, v2);
        nouClient.afegeix(L5);

        String informe = nouClient.informe();
        String resultat = "Informe de lloguers del client Isma (12233321L)\n" +
                "\tToyota Prius: 120.0€\n" +
                "Import a pagar: 120.0€\n" +
                "Punts guanyats: 1\n";

        Assert.assertEquals(resultat,informe);
    }


    @Test
    public void lloguerGeneral2() {
        Client nouClient = new Client ("12233321L", "Isma", "1233211123");

        Vehicle v2 = new Vehicle("Toyota", "Prius", Vehicle.GENERAL);
        Lloguer L5 = new Lloguer("11-05-2018", 60, v2);
        nouClient.afegeix(L5);

        String informe = nouClient.informe();
        String resultat = "Informe de lloguers del client Isma (12233321L)\n" +
                "\tToyota Prius: 4470.0€\n" +
                "Import a pagar: 4470.0€\n" +
                "Punts guanyats: 1\n";

        Assert.assertEquals(resultat,informe);
    }


    @Test
    public void lloguerLuxe() {
        Client nouClient = new Client ("12233321L", "Isma", "1233211123");

        Vehicle v3 = new Vehicle("Ferrari", "Lusso T", Vehicle.LUXE);
        Lloguer L6 = new Lloguer("12-06-2018",1, v3);
        nouClient.afegeix(L6);

        String informe = nouClient.informe();
        String resultat = "Informe de lloguers del client Isma (12233321L)\n" +
                "\tFerrari Lusso T: 180.0€\n" +
                "Import a pagar: 180.0€\n" +
                "Punts guanyats: 1\n";
        Assert.assertEquals(resultat,informe);

    }


    @Test
    public void lloguerLuxe2() {
        Client nouClient = new Client ("12233321L", "Isma", "1233211123");

        Vehicle v3 = new Vehicle("Ferrari", "Lusso T", Vehicle.LUXE);
        Lloguer L6 = new Lloguer("12-06-2018",10, v3);
        nouClient.afegeix(L6);

        String informe = nouClient.informe();
        String resultat = "Informe de lloguers del client Isma (12233321L)\n" +
                "\tFerrari Lusso T: 1800.0€\n" +
                "Import a pagar: 1800.0€\n" +
                "Punts guanyats: 2\n";
        Assert.assertEquals(resultat,informe);

    }
    //Test: cap lloguer
    @Test
    public void caplloguer() {
        Client nouClient = new Client ("12233321L", "Isma", "1233211123");
        String informe = nouClient.informe();
        String resultat = "Informe de lloguers del client Isma (12233321L)\n" +
                "Import a pagar: 0.0€\n" +
                "Punts guanyats: 0\n";
        Assert.assertEquals(resultat,informe);

    }

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestClient");
    }


}
