package animal;

import java.util.ArrayList;
import java.util.List;

public class Review04 {

    public static void main(String[] args) {
        Animal tanaka = new Human("田中　太郎",25,"電車");
        Human tanaka2 = (Human)tanaka;
        Animal suzuki = new Human("鈴木　次郎",30,"野球");
        Human suzuki2 = (Human)suzuki;
        Animal sato = new Human("佐藤　花子",20,"映画");
        Human sato2 = (Human)sato;

        tanaka2.say();
        tanaka2.think();
        suzuki2.say();
        suzuki2.think();
        sato2.say();
        sato2.think();

        /*
        List<Human> al = new ArrayList<Human>();
        al.add(new Human("田中　太郎",25,"電車"));
        al.add(new Human("鈴木　次郎",30,"野球"));
        al.add(new Human("佐藤　花子",20,"映画"));

        for(int i=0; i<al.size(); i++) {
            al.get(i).say();
            al.get(i).think();
        }*/


    }

}
