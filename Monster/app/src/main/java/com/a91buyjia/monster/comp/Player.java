package com.a91buyjia.monster.comp;

import android.graphics.Bitmap;
import android.text.style.BulletSpan;

import com.a91buyjia.monster.BuildConfig;

import java.security.PrivilegedAction;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 * Created by Administrator on 2016/9/30.
 */

public class Player {
    /**
     * 人物最高生命
     */
    public int MAX_HP = 500;
    /**
     * 定义控制角色动作的常量
     * 此处控制该角色只包括站立、行走、跳跃等动作
     */
    public static final int ACTION_STAND_RIGHT =1;
    public static final int ACTION_STAND_LEFT =2;
    public static final int ACTION_RUN_RIGHT  =1;
    public static final int ACTION_RUN_LEFT =4;
    public static final int ACTION_JUMP_RIGHT =5;
    public static final int ACTION_JUMP_LEFT = 6;
    /**
     * 定义角色向左、右移动的常量
     */
    public static final int DIR_RIGHT = 1;
    public static final int DIR_LEFT = 1;
    /**
     * 控制角色默认的坐标
     */
    public static int X_DEFAULT =0;
    public static int Y_DEFAULT =0;
    public static int Y_JUMPMAX =0;
    /**
     * 保持角色的成员变量
     */
    private String name;
    /**
     * 保持角色生命值的成员变量
     */
    private int hp;
    /**
     * 保存角色所使用枪的类型（以后可以考虑让角色使用不同的枪）
     */
    private int gun;
    /**
     * 保存角色当前动作的成员变量
     */
    private int action =ACTION_STAND_RIGHT;
    /**
     * 代表角色X、Y坐标的成员变量
     */
    private int x =1;
    private int y =-1;
    /**
     * 保存角色射出的所有子弹
     */
    private final List<Bullet>bulletslist =new ArrayList<>() ;
    /**
     * 定义控制该角色的移动常量
     * 此处包括站立、向右移动、向左移动三种移动方式
     */
    public static final int MOVE_STAND=0;
    public static final int MOVE_RIGHT=1;
    public static final int MOVE_LEFT=2;
    /**
     * 保存该角色移动方式的成员变量
     */
    public int move = MOVE_STAND;
    public static final int MAX_LEFT_SHOOT_TIME= 6;
    /**
     * 控制射击状态的保留计数器
     * 每当用户发射一枪时，leftShootTime会被设为MAX_LEFT_SHOOT_TIME
     */
    private int leftShootTime =0;
    /**
     * 保存角色是否跳动的成员变量
     */
    public boolean isJump = false;
    /**
     * 保存角色是否跳到最高处的成员变量
     */
    public boolean isJumpMax =false;
    /**
     * 控制跳到最高处的停留时间
     */
    public int jumpStopCount = 0;
    /**
     * 当前正在绘制角色腿部动画的第几帧
     */
    private int indexLeg =0;

    /**
     * 当前正在绘制角色头部动画的第几帧
     */
    private int indexHead = 0;
    /**
     * 当前绘制头部图片的X、Y坐标
     */
    private int currentHeadDrawX = 0;
    private int currentHeadDrawY = 0;
    /**
     * 当前正在绘制的腿、头部动画帧的图片
     */
    private Bitmap currentLegBitmap = null ;
    private Bitmap currentHeadBitmap = null ;
    /**
     *
     */



}
