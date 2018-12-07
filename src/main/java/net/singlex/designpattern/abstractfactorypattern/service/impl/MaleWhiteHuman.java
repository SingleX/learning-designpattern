package net.singlex.designpattern.abstractfactorypattern.service.impl;

import net.singlex.designpattern.abstractfactorypattern.service.AbstractWhiteHuman;

/**
 * Created by zhanhai on 2018/12/7.
 *
 * @author zhanhai
 * @date 2018/12/07
 */
public class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void action3() {
        System.out.println("male white human do action3.");
    }
}
