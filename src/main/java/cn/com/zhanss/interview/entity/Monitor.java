package cn.com.zhanss.interview.entity;

/**
 * @author zhansc
 * @date
 **/
public class Monitor {
    private Integer id;

    private boolean flag = false;

    private String name;

    private Integer age;

    public Monitor() {
    }

    public Monitor(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
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
