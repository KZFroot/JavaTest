package com.collection2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ShowHand {
    //定义该游戏最多支持多少玩家
    private final int PLAY_NUM = 5;
    //定义扑克牌的所有花色和数值
    private String[] type = {"方块", "草心", "红心", "黑桃"};
    private String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    //cards是一局游戏中剩下的扑克牌
    private List<String> cards = new LinkedList<String>();
    //定义所有玩家的扑克牌
    private List<String>[] playersCards = new List[PLAY_NUM];
    //定义所有玩家
    private String[] players = new String[PLAY_NUM];

    /**
     * 初始化扑克牌 放入52张扑克牌
     * 并且使用shuffle方法将它们按随机顺序排列
     */
    public void initCards() {
        for (int i = 0; i < type.length; i++) {
            for (int j = 0; j < values.length; j++) {
                cards.add(type[i] + values[j]);
            }
        }
        //随机排列
        Collections.shuffle(cards);
    }

    /**
     * 初始化玩家 为每个玩家分配用户名
     */
    public void initPlayer(String... names) {
        if (names.length > PLAY_NUM || names.length < 2) {
            //校验玩家数量 此处使用异常机制更合理
            System.out.println("玩家数量不对");
            return;
        } else {
            //初始化玩家用户名
            for (int i = 0; i < names.length; i++) {
                players[i] = names[i];
            }
        }
    }

    /**
     * 初始化玩家手上的扑克牌 开始游戏时每个玩家手上的扑克牌为空
     * 程序使用一个长度为0的LinkedList来表示
     */
    public void initPlayerCards() {
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null && !players[i].equals("")) {
                playersCards[i] = new LinkedList<String>();
            }
        }
    }

    /**
     * 输出全部扑克牌 没有实质作用 仅用于测试
     */
    public void showAllCards() {
        for (String card : cards) {
            System.out.println(card);
        }
    }

    /**
     * 派扑克牌
     *
     * @param first 最先派给谁
     */
    public void deliverCard(String first) {
        //调用ArrayUtils 工具类的search方法
        //查询出指定元素在数组中的索引
        int firstPos = ArrayUtils.search(players,first);
        //依次给位于该指定玩家之后的每一个玩家派扑克牌
        for (int i = firstPos; i < PLAY_NUM; i++) {
            if (players[i] != null) {
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }
        //依次给位于指定玩家之前的每个玩家派扑克牌
        for (int i = 0; i < firstPos; i++) {
            if (players[i] != null) {
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }
    }

    /**
     * 输出玩家手上的扑克牌
     * 实现该方法时 应该控制每个玩家看不到别人的第一张牌 但此处没有增加功能
     */
    public void showPlayerCards() {
        for (int i = 0; i < PLAY_NUM; i++) {
            //当该玩家不为空时
            if (players[i] != null) {
                //输出玩家
                System.out.println(players[i] + ":");
                //遍历输出玩家手上的扑克
                for (String card : playersCards[i]) {
                    System.out.println(card + "\t");
                }
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        ShowHand sh=new ShowHand();
        sh.initPlayer("电脑玩家","孙悟空");
        sh.initCards();
        sh.initPlayerCards();
        //测试所有扑克牌没有实际作用
        sh.showAllCards();
        System.out.println("---------------");
        //下面开始从孙悟空开始发牌
        sh.deliverCard("孙悟空");
        sh.showPlayerCards();
        /**
         * 这个地方需要增加处理 1牌面最大的玩家下注 2其他玩家是否跟注 3游戏是否只剩下一个玩家 如果是 则胜利
         * 如果已经是最后一张扑克牌 则需要比较剩下玩家牌面大小
         */
        //再次从电脑玩家开始派牌
        sh.deliverCard("电脑玩家");
        sh.showPlayerCards();
    }
}