package cn.model;

import cn.annotation.Column;
import cn.annotation.Table;

@Table("demo_person")
public class Person{

    @Column(value="id", isKey = true, isAutoIncrement = true)
    private Integer id;
    
    @Column(value = "name")
    private String name;

    @Column(value = "age")
    private Integer age;

    @Column(value = "gender")
    private int gender;

    @Column(value = "hobby")
    private String hobby;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public int getGender(){
        return gender;
    }

    public void setGender(int gender){
        this.gender = gender;
    }

    public String getHobby(){
        return hobby;
    }

    public void setHobby(String hobby){
        this.hobby = hobby;
    }

}
