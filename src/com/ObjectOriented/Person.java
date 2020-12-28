package com.ObjectOriented;

public class Person {
    private String name;
    private String idStr;

    public Person() {
    }

    public Person(String name, String idStr) {
        this.name = name;
        this.idStr = idStr;
    }

    //name 和 idStr的setter和getter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }
    //重写equals()方法 提供自定义的相等标准
    public boolean equals(Object obj) {
        //如果两个对象为同一个对象
        if (this==obj)
            return true;
           //只有当obj是Person对象
            if (obj !=null&& obj.getClass() ==Person.class){
                Person personObj=(Person)obj;
                if (this.getIdStr().equals(personObj.getIdStr())){
                    return true;
                }
            }

        return false;
    }
}
