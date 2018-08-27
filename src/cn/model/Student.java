package cn.model;

import java.util.Date;

import cn.annotation.Column;
import cn.annotation.Table;

@Table("student")
public class Student {

    @Column("name")
    private String name;

    @Column("age")
    private int age;

    @Column("birthday")
    private Date birthday;

    @Column("isTall")
    private boolean isTall;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Date getBirthday(){
        return birthday;
    }

    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }

    public boolean isTall(){
        return isTall;
    }

    public void setTall(boolean isTall){
        this.isTall = isTall;
    }

}
