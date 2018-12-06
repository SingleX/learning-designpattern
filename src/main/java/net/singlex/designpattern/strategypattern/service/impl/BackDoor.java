package net.singlex.designpattern.strategypattern.service.impl;

import net.singlex.designpattern.strategypattern.service.IStrategy;

/**
 * Created by zhanhai on 2018/12/6.
 *
 * @author zhanhai
 * @date 2018/12/06
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("open backdoor.");
    }
}
