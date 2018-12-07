package net.singlex.designpattern.abstractfactorypattern.service.impl;

import net.singlex.designpattern.abstractfactorypattern.service.AbstractYellowHuman;

/**
 * Created by zhanhai on 2018/12/7.
 *
 * @author zhanhai
 * @date 2018/12/07
 */
public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void action3() {
        System.out.println("male yellow human do action3.");
    }
}
