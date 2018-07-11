package models;

import javax.persistence.*;

@Entity
@Table(name = "lessons")
public class Lesson {

    private  int id;
    private String title;
    private int roomNo;
    private Course course;


    public Lesson(){

    }

    public Lesson(String title, int roomNo){
        this.title = title;
        this.roomNo = roomNo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "RoomNo")
    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    @ManyToOne
    @JoinColumn(name="course_id", nullable = false)
    public Course getCourse() {
        return course;
    }


    public void setCourse(Course course) {
        this.course = course;
    }
}
