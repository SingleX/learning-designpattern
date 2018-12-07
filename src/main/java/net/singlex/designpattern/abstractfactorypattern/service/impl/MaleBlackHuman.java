package net.singlex.designpattern.abstractfactorypattern.service.impl;

import net.singlex.designpattern.abstractfactorypattern.service.AbstractBlackHuman;

/**
 * Created by zhanhai on 2018/12/7.
 *
 * @author zhanhai
 * @date 2018/12/07
 */
public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void action3() {
        System.out.println("male black human do action3.");
    }
}
