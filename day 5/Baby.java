public class Baby {
    public String name;
    String date_of_birth;
    String color;
    String place_of_birth;
    private double weigth;

    public Baby(String name) {
        this.name = name;
    }

    public Baby(String name, String date_of_birth) {
        this.name = name;
        this.date_of_birth = date_of_birth;
    }

    public Baby(String name, String date_of_birth, double weigth, int multiply) {
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.weigth = weigth * multiply;
    }

    public Baby(String name, String date_of_birth, String color, String place_of_birth, double weigth) {
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.color = color;
        this.place_of_birth = place_of_birth;
        this.weigth = weigth;
    }

    public double getWeigth() {

        return weigth;
    }

    public void setWeigth(double weigth) {

        this.weigth = weigth;
    }

    public String getName() {

        return this.name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }
}
