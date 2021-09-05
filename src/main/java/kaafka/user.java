package kaafka;

import org.apache.kafka.common.protocol.types.Field;

public class user{

    int id, age;
    String name, course;
    public user(int id, String name, int age, String course) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;

    }

    public String toString() {

        return ("\"Id\":"+"\""+Integer.toString(id)+"\","+"\"Name\":"+"\""+name+"\","+"\"Age\":"+"\""+Integer.toString(age)+"\","+"\"Course\":"+"\""+course+"\"");
    }

}