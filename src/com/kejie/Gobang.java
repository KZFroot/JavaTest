package com.kejie;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Gobang {
    //定义棋盘的大小
    private static int BOARD_SIZE = 15;
    //定义一个二维数组来充当棋盘
    private String[][] board;
    public void initBoard(){
        //初始化棋盘数组
        board=new String[BOARD_SIZE][BOARD_SIZE];
        //把每个元素赋值为“+”，用于在控制台画出棋盘
        for (int i=0;i<BOARD_SIZE;i++){
            for (int j=0;j<BOARD_SIZE;j++){
                board[i][j]= "+";
            }
        }
    }
    //在控制台输出棋盘的方法
    public void printBoard(){
        for (int i=0; i<BOARD_SIZE;i++){
            for (int j=0;j<BOARD_SIZE;j++){
                //打印每个数组元素不换行
                System.out.print(board[i][j]);
            }
            //换行
            System.out.print("\n");
        }

    }

    public static void main(String[] args)throws Exception {
        Gobang gb=new Gobang();
        gb.initBoard();
        gb.printBoard();
        //获取键盘输入法
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String inputStr=null;
        //br.readLine();每当在键盘上输入一行内容后回车键 刚输入的内容就被br读取收到
        while ((inputStr= br.readLine())!=null){
            //将用户输入的字符串以逗号（，）作为分隔符，分隔成2个字符串
            String [] posStrArr =inputStr.split(",");
            //将2个字符串转换成用户下棋的坐标
            int xPos=Integer.parseInt(posStrArr[0]);
            int yPos=Integer.parseInt(posStrArr[1]);
            //把对应的数组元素赋为“*”
            gb.board[yPos-1][xPos-1]="吃";
            /**
             * 电脑随机生成两个整数，作为电脑下棋的坐标，赋值给board数组
             * 还涉及
             * 1 坐标的有效性，只能是数字 不能超过棋盘的范围
             * 下棋的点不能重复
             * 每次下棋后 需要扫描谁赢了
             */
            gb.printBoard();
            System.out.println("输入您的下棋坐标，应以X Y的格式");
        }
    }
}
