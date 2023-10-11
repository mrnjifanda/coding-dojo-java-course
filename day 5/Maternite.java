public class Maternite {
    public static void main(String[] args) {
        
        Baby cedric = new Baby("Cedric", "2010-05-12", "Black", "Douala", 4.1);
        System.out.println(cedric.name);

        Baby armand = new Baby("Armand", "2015-09-01", "Black", "Garoua", 0);

        Baby chirstian = new Baby("Christian", "2011-11-15");

        Baby arlette = new Baby("Arlette");

        Baby example = new Baby("Example", "2011-05-01", 2.1, 4);

        example.name = "Charles";
        example.setName("Peace");

        // cedric.name = "Cedric";
        // cedric.color = "Black";
        // cedric.date_of_birth = "2010-05-12";
        // cedric.place_of_birth = "Douala";
        // cedric.setWeigth(4.1);


        // Baby armand = new Baby();
        // armand.name = "Armand";
        // armand.color = "Black";
        // armand.date_of_birth = "2015-09-01";
        // armand.place_of_birth = "Garoua";
        // armand.setWeigth(0);
    }
}
