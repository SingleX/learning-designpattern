package net.singlex.designpattern.abstractfactorypattern.service.impl;

import net.singlex.designpattern.abstractfactorypattern.service.AbstractBlackHuman;

/**
 * Created by zhanhai on 2018/12/7.
 *
 * @author zhanhai
 * @date 2018/12/07
 */
public class FemaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void action3() {
        System.out.println("female black human do action3.");
    }
}
