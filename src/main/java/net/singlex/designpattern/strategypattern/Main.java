package net.singlex.designpattern.strategypattern;

import net.singlex.designpattern.strategypattern.service.impl.BackDoor;
import net.singlex.designpattern.strategypattern.service.impl.BlockEnemy;
import net.singlex.designpattern.strategypattern.service.impl.GiveGreenLight;

/**
 * Created by zhanhai on 2018/12/6.
 *
 * @author zhanhai
 * @date 2018/12/06
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context(new BackDoor());
        context.operate();

        Context context2 = new Context(new BlockEnemy());
        context2.operate();

        Context context3 = new Context(new GiveGreenLight());
        context3.operate();
    }
}
