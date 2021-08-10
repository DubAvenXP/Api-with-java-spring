package com.example.cursospring.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "student_courses")
public class StudentCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_student")
    private Integer idStudent;

    @Column(name = "id_course")
    private Integer idCourse;

    @Column(name = "final_grade")
    private Integer finalGrade;

    private Integer status;

    @ManyToOne
    @JoinColumn(name = "id_course", updatable = false, insertable = false)
    private Course course;

    @ManyToOne
    @JoinColumn(name = "id_student", updatable = false, insertable = false)
    private Student student;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }

    public Integer getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Integer finalGrade) {
        this.finalGrade = finalGrade;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
