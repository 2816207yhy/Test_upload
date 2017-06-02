package com.a91buyjia.monster.comp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/30.
 */

public class MonsterManager {
    /**
     * 保存所有死掉的怪物，保存他们是为了绘制死亡动画，绘制完成后清除这些怪物
     */
    public static final List<Monster>dieMonsterList =new ArrayList<>() ;
    /**
     * 保存所有活的怪物
     */
    public static final List<Monster>monsterList =new ArrayList<>() ;

}
