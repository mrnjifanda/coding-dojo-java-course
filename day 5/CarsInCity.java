public class CarsInCity {

    public static void main(String[] args) {

        Cars ferrary = new Cars();
             ferrary.speed = 230;
             ferrary.color = "blue";
             ferrary.name = "Ferrary 2023";

        Cars tesla = new Cars();
             tesla.color = "gold";
             tesla.name = "Tesla 2022";

        ferrary.name = ferrary.name + " " + ferrary.color;


        System.out.println("Ferrary speed: " + ferrary.speed);

        System.out.println("Tesla speed: " + tesla.speed);
    }
}
