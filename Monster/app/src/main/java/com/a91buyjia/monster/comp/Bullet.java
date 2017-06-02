package com.a91buyjia.monster.comp;

/**
 * Created by Administrator on 2016/9/30.
 */

public class Bullet {
    /**
     * 定义代表子弹类型的常量
     */
    public static final int BULLET_TYPE_1= 1;
    public static final int BULLET_TYPE_2 = 2;
    public static final int BULLET_TYPE_3 = 3;
    public static final int BULLET_TYPE_4 = 4;

    /**
     * 定义子弹类型
     */
    private int type;
    /**
     * 定义子弹X、Y坐标
     */
    private int x;
    private int y;
    /**
     * 定义子弹的射击方向
     */
    private int dir;
    /**
     * 定义子弹在Y方向上的加速度
     */
    private int yAccelate = 0;
    /**
     * 子弹是否有效
     */
    private boolean isEffect = true ;



}
