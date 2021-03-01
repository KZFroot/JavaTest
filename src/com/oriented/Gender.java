package com.oriented;

public enum  Gender {
    MALE("男"),FEMALE("女");
    // 定义一个public修饰的实例变量
    private final String name;
    //枚举类的构造器只能使用private修饰
    Gender(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
//    public void setName(String name) {
//        switch (this){
//            case MALE:
//                if (name.equals("男"))
//                {
//                    this.name = name;
//                }else {
//                    System.out.println("参数错误");
//                    return;
//                }
//                break;
//            case FEMALE:
//                if (name.equals("女")){
//                    this.name=name;
//                }else {
//                    System.out.println("参数错误");
//                }
//                break;
//        }
//    }


}
