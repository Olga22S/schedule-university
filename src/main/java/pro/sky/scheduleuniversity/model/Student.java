package pro.sky.scheduleuniversity.model;

public class Student extends Person {

    private int groupId;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, int age, int groupId) {
        super(id, firstName, lastName, age);
        this.groupId = groupId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
