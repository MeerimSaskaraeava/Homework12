public class Person {
    private String name;
    private String surname;
    private int age;

    void setName(String name){
        this.name=name;
    }
    void  setSurname(String surname){
        this.surname=surname;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){
        return name;
    }
    String getSurname(){
        return  surname;
    }
    int getAge(){
        return  age;
    }

    void getInfoPerson(Person[]people){
        for (Person per:people){
            System.out.println("Name: " + per.name +
                    "\nSurname: " + per.surname +
                    "\nAge: " + per.age);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
