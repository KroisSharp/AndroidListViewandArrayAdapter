package mik.easj.skole.androidlistviewandarrayadapter;

/**
 * Created by krois on 26-02-2018.
 */

public class Student {

    //her er det vores student skal indeholde navn og efternavn
    private String Name;
    private String Lastname;



    //vi laver en static liste med students 3 stk
    public static final Student[] studentlist = {
            new Student("name1", "efternavn1"),
            new Student("name2", "lastname2"),
            new Student("name3", "lastname3")
    };



    //ctor
    public Student(String name, String lastname) {
        Name = name;
        Lastname = lastname;
    }

    //props med getname og getlastname
    public String getName() {
        return Name;
    }

    public String getLastname() {
        return Lastname;
    }

    //når vi kalder tosring vil den skrive dette:
    @Override
    public String toString() {
        return  Name + " " + Lastname;}




}