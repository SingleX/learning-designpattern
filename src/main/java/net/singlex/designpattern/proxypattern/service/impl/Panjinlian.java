package net.singlex.designpattern.proxypattern.service.impl;

import net.singlex.designpattern.proxypattern.service.KindWomen;

/**
 * Created by zhanhai on 2018/12/6.
 *
 * @author zhanhai
 * @date 2018/12/06
 */
public class Panjinlian implements KindWomen {

    @Override
    public void action1() {
        System.out.println("panjinlian do action1.");
    }

    @Override
    public void action2() {
        System.out.println("panjinlian do action2.");
    }
}
