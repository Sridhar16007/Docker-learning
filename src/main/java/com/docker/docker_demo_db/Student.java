package com.docker.docker_demo_db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int emp_id_success;
    private String emp_name;
    private int emp_age;

    public int getEmp_id() {
        return emp_id_success;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id_success = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }

    public Student() {

    }

    public Student(int emp_id_success, String emp_name, int emp_age) {
        this.emp_id_success = emp_id_success;
        this.emp_name = emp_name;
        this.emp_age = emp_age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "emp_id=" + emp_id_success +
                ", emp_name='" + emp_name + '\'' +
                ", emp_age=" + emp_age +
                '}';
    }
}
