package com.ObjectOriented;

public class AutoBoxingUnboxing {
      //自动装箱 把一个基本类型变量直接赋给对应的包装类变量，或者赋值给Object变量
     //自动拆箱 允许把包装类对象直接赋给对应的基本类型
      public static void main(String[] args) {
          //直接把一个基本类型赋给Integer对象
          Integer inObj=5;
          //直接把一个boolean类型变量赋给一个Object类型的变量
          Object boolObj=true;
          //把Integer直接赋值给int类型的变量
          int it=inObj;
          if (boolObj instanceof Boolean){
              //先把Object对象强制类型转换为Boolean类型 再赋给boolean变量
           boolean b  = (Boolean)boolObj;
              System.out.println(b);
          }
      }

}
