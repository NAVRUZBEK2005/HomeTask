public class Student {
    private String ism;
    private String familya;
    private int birthday;
    private String hobbies;

    public Student(String ism, String familya, int birthday, String hobbies) {
        this.ism = ism;
        this.familya = familya;
        this.birthday = birthday;
        this.hobbies = hobbies;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public String getFamilya() {
        return familya;
    }

    public void setFamilya(String familya) {
        this.familya = familya;
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