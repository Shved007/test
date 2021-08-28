public class Person {
    private long id;
    private String name;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void sayHello(){
        System.out.println(name + " Hello");
    }
}
