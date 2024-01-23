public class Teacher extends User {
    static int TeacherId = 1;
    int teacherId;

    public Teacher(String secondName, String firstName, String lastName) {
        super(secondName, firstName, lastName);
        this.teacherId = getTeacherId();
    }

    static int getTeacherId() {
        return TeacherId++;
    }

    public void setSecondName(String secondName) {
        super.setSecondName(secondName);
    }

    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", secondName='" + super.getSecondName() + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

}