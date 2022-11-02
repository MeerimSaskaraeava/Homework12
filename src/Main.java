public class Main {
    public static void main(String[] args) {

        University un=new University();
        School sc=new School();
        Car car=new Car();
        Person per=new Person();

        University un1=new University();
        un1.setName("British university");
        un1.setYearFounded(1978);
        un1.setPhoneNumber(700456234);

        University un2=new University();
        un2.setName("Harvard university");
        un2.setYearFounded(2005);
        un2.setPhoneNumber(777888999);

        University un3=new University();
        un3.setName("Cambridge university");
        un3.setYearFounded(1990);
        un3.setPhoneNumber(555777000);

        University un4=new University();
        un4.setName("American university");
        un4.setYearFounded(2012);
        un4.setPhoneNumber(999777555);

        School sc1=new School();
        sc1.setName("British school");
        sc1.setNumberSchool((byte) 34);
        sc1.setAddress(" Bokonbayeva str. 76");

        School sc2=new School();
        sc2.setName("American school");
        sc2.setNumberSchool((byte) 24);
        sc2.setAddress(" Manas str. 1");

        School sc3=new School();
        sc3.setName("Cambridge school");
        sc3.setNumberSchool((byte) 24);
        sc3.setAddress(" Sovetskaya str. 31");

        School sc4=new School();
        sc4.setName("High school");
        sc4.setNumberSchool((byte) 24);
        sc4.setAddress(" Mira str. 11");

        Car car1=new Car();
        car1.setBrand("Toyota");
        car1.setModel("Passo");
        car1.setYear(2004);

        Car car2=new Car();
        car2.setBrand("Honda");
        car2.setModel("Fit");
        car2.setYear(2014);

        Car car3=new Car();
        car3.setBrand("Kia");
        car3.setModel("Rio");
        car3.setYear(2022);

        Car car4=new Car();
        car4.setBrand("BMV");
        car4.setModel("700");
        car4.setYear(2015);

        Person per1=new Person();
        per1.setName("Talant");
        per1.setSurname("Mamytov");
        per1.setAge(40);

        Person per2=new Person();
        per2.setName("Rustam");
        per2.setSurname("Mamytov");
        per2.setAge(16);

        Person per3=new Person();
        per3.setName("Malika");
        per3.setSurname("Mamytova");
        per3.setAge(12);

        Person per4=new Person();
        per4.setName("Emirkhan");
        per4.setSurname("Mamytov");
        per4.setAge(5);

        University[] universities={un1,un2,un3,un4};
        un.getInfoUniversity(universities);

        School[] schools={sc1,sc2,sc3,sc4};
        sc.getInfoSchool(schools);

        Car[]cars={car1,car2,car3,car4};
        car.getInfoCar(cars);

        Person[]people={per1,per2,per3,per4};
        per.getInfoPerson(people);


    }
}