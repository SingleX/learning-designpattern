package net.singlex.designpattern.simplefactorypattern.service.impl;

import net.singlex.designpattern.simplefactorypattern.service.IHuman;

/**
 * Created by zhanhai on 2018/12/6.
 *
 * @author zhanhai
 * @date 2018/12/06
 */
public class BlackHuman implements IHuman {
    @Override
    public void laugh() {
        System.out.println("black human laugh.");
    }
}
