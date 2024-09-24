public class Student {
   private String FIrstName;
   private String LastName;
   private int birthday;
   private String hobbies;

   public Student(String firstName, String lastName, int birthday, String hobbies) {
       this.FIrstName = firstName;
       this.LastName = lastName;
       this.birthday = birthday;
       this.hobbies = hobbies;
   }

    public String getFIrstName() {
        return FIrstName;
    }

    public void setFIrstName(String FIrstName) {
        this.FIrstName = FIrstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
}
