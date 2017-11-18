package cn.hongrm.springbootwebframework.po;

/**
 * created by hongrm on 2017/11/18 20:27
 */
public class User {

    private String name;
    private Integer age;
    private Integer id;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
