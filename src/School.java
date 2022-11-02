public class School {
    private byte numberSchool;
    private String name;
    private String address;

    void setNumberSchool(byte numberSchool){
        this.numberSchool=numberSchool;
    }
    void setName(String name){
        this.name=name;
    }
    void setAddress(String address){
        this.address=address;
    }
    byte getNumberSchool(){
        return numberSchool;
    }
    String getName(){
        return name;
    }
    String getAddress(){
        return address;
    }
    public void getInfoSchool(School[]schools){
        for (School sc:schools) {
            System.out.println("School name: " + sc.name +
                    "\nNumber school: " + sc.numberSchool +
                    "\nSchool address: " + sc.address);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        }
    }

}
