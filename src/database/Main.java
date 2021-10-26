package database;

//kiválasztani azt a bizonylatszámot (EBELN) az EKPO táblábol ahol a NETWR a legnagyobb, majd az EKKO táblában
// ehhez az EBELN-hez tartozó LIFNR-t aztán LFA1 táblából ehhez a LIFNR-hez tartozó NAME-t és kiírni konzolra
//SELECT EBELN FROM EKPO where MAX(NETWR);
//SELECT LIFNR FROM EKKO where (EBELN az valami)
//SELECT NAME FROM LFA1 where (LIFNR az valami) -->
public class Main {
    public static void main(String[] args) {
        DB db = new DB();
        String nameOfSupplier = "";
        String idOfSupplier = "";
        System.out.println("A beszállító neve: " + nameOfSupplier + ", " + "A beszállító azonosítója: " + idOfSupplier);
    }




}
