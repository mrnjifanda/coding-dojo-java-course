public class Student {

    private String name;
    private double python;
    private double java;
    private double javascript;

    public Student() {

        this("Seven", 10.0, 11.0, 12.0);
    }

    public Student (String name, double python, double java, double javascript) {

        // The member varable have same name with the parametter variable
        this.name = name;
        this.python = python;
        this.java = java;
        this.javascript = javascript;
    }

    public String getName() {
        return name;
    }

    private double moyene (int coef) {
        return (python + java + javascript) / coef;
    }

    public double getMoyene(Student anotherObject) {

        System.out.println("getClass: " + this.getClass().getSimpleName());
        System.out.println("toString: " + this.toString());
        System.out.println("equals: " + this.equals(anotherObject));

        return this.moyene(3);
    }

    public Level getLevelClass () {

        return new Level();
    }

    public void notReturn () {}
}
