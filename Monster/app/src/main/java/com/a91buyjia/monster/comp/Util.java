package com.a91buyjia.monster.comp;

import java.util.Random;

/**
 * Created by Administrator on 2016-11-28.
 */

public class Util {
    public static Random random = new Random() ;
    /**
     * 返回一个0~range的随机数
     */
    public static int rand(int range)
    {
        /**
         * 如果range等于0直接返回0
         */
        if(range == 0)
            return 0;
        /**
         * 获取一个0~range的随机数
         */
        return Math.abs(random.nextInt()%range);

    }
}
