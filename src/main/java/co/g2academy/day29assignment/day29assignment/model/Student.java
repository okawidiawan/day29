package co.g2academy.day29assignment.day29assignment.model;

import javax.persistence.*;

@Entity
@Table(name = "t_student")
public class Student {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private  String address;

    @Column(length = 100, nullable = false)
    private  String status;

    @Column(nullable = false)
    private Integer physics;

    @Column(nullable = false)
    private Integer calculus;

    @Column(nullable = false)
    private Integer biology;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPhysics() {
        return physics;
    }

    public void setPhysics(Integer physics) {
        this.physics = physics;
    }

    public Integer getCalculus() {
        return calculus;
    }

    public void setCalculus(Integer calculus) {
        this.calculus = calculus;
    }

    public Integer getBiology() {
        return biology;
    }

    public void setBiology(Integer biology) {
        this.biology = biology;
    }
}
