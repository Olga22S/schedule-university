package pro.sky.scheduleuniversity.model;

import java.util.List;

public class Teacher extends Person {

    private List<Discipline> disciplines;

    public Teacher() {
    }

    public Teacher(Long id, String firstName, String lastName, int age) {
        super(id, firstName, lastName, age);
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }
}
