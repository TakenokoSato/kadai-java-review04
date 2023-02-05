package animal;

public class Animal {

    private String name;
    private int old;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getOld() {
        return old;
    }
    public void setOld(int old) {
        this.old = old;
      }

    public Animal() {
    }

    public Animal(String name,int old) {
        this.name = name;
        this.old = old;
    }

    public void say() {
        System.out.println(name+"です。 "+old+"歳です。");
    }



}
