package pro.sky.scheduleuniversity.model;

import java.time.LocalDate;
import java.util.Objects;

public class Schedule {

    private Long id;
    private LocalDate date;
    private Discipline discipline;
    private Group group;
    private Teacher teacher;

    public Schedule() {
    }

    public Schedule(Long id, LocalDate date, Discipline discipline, Group group, Teacher teacher) {
        this.id = id;
        this.date = date;
        this.discipline = discipline;
        this.group = group;
        this.teacher = teacher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Schedule)) {
            return false;
        }
        Schedule schedule = (Schedule) o;
        return id.equals(schedule.id) && date.equals(schedule.date)
                && discipline.equals(schedule.discipline)
                && group.equals(schedule.group)
                && teacher.equals(schedule.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, discipline, group, teacher);
    }

    @Override
    public String toString() {
        return date + " " + discipline + " " + group + " " + teacher;
    }
}
