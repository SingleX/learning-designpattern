package net.singlex.designpattern.abstractfactorypattern.factory;

import net.singlex.designpattern.abstractfactorypattern.service.IHuman;

/**
 * Created by zhanhai on 2018/12/7.
 *
 * @author zhanhai
 * @date 2018/12/07
 */
public abstract class AbstractHumanFactory implements HumanFactory {

    protected IHuman createHuman(HumanEnum humanEnum) {
        IHuman human = null;
        if (!humanEnum.getValue().equals("")) {
            try {
                human = (IHuman)Class.forName(humanEnum.getValue()).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return human;
    }
}
