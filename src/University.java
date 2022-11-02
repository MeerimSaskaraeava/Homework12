public class University {
    private String name;
     private int yearFounded;
    private long phoneNumber;

    void setName(String name){
        this.name=name;
    }
    void  setYearFounded(int yearFounded){
        this.yearFounded=yearFounded;
    }
    void  setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    String getName(){
        return name;
    }
    int getYearFounded(){
        return yearFounded;
    }
    long getPhoneNumber(){
        return phoneNumber;
    }
    public void getInfoUniversity(University[]universities) {
        for (University un:universities){

            System.out.println("University name: " + un.name +
                    "\nUniversity year founded: " + un.yearFounded +
                    "\nUniversity phone number: " + un.phoneNumber);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }}
}
