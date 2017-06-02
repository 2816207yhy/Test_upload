package com.a91buyjia.monster.comp;

import android.media.AsyncPlayer;
import android.text.style.BulletSpan;
import android.view.ViewManager;
import android.webkit.URLUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/30.
 */



public class Monster {
    /**
     *定义怪物类型常量
     */
    public static final int TYPE_BOMB = 1;
    public static final int TYPE_FLY = 2;
    public static final int TYPE_MAN = 3;
    /**
     *定义怪物类型变量
     */
    private int type = TYPE_BOMB;
    /**
     * 定义怪物X、Y坐标成员变量
     */
    private int x = 0;
    private int y = 0;
    /**
     * 定义怪物是否死亡的旗标
     */
    private boolean isDie =false;
    /**
     * 绘制怪物图片左上角X、Y坐标
     */
    private int startX = 0;
    private int startY = 0;
    /**
     * 绘制怪物图片右下角X、Y坐标
     */
    private int endX = 0;
    private int endY = 0;
    /**
     * 该变量控制动画刷新进度
     */
    int drawCount = 0;
    /**
     * 定义当前正在绘制怪物动画第几帧的变量
     */
    private int drawIndex = 0;
    /**
     * 用于记录死亡动画只绘制一次，无需重复绘制
     * 每当怪物死亡，该变量会被初始化为等于死亡动画的总帧数
     * 当怪物的死亡动画帧播放完成时，该变量的值变为0
     */
    private int dieMaxDrawCount = Integer.MAX_VALUE;
    /**
     * 定义怪物射出子弹
     */
    private List<Bullet>bulletList = new ArrayList<>();

    public Monster(int type){
        this.type = type;
        /**
         * ------以下代码根据怪物类型来初始化怪物X、Y坐标------
         * 如果怪物是炸弹（TYPE_BOMB）或敌人（TYPE_MAN）
         * 怪物的Y坐标与玩家控制的角色的Y坐标相同
         */
        if (type == TYPE_BOMB || type==TYPE_MAN ){
            y=Player.Y_DEFAULT;
        }
        /**
         * 如果怪物是飞机，根据屏幕高度随机声称怪物的Y坐标
         */
        else if(type ==TYPE_FLY)
        {
           // y= ViewManager.SCREEN_HEIGHT*50/100 - Util.rand(ViewManager.SCREEN_HEIGHT);

        }

    }



}
