package net.singlex.designpattern.abstractfactorypattern.factory;

/**
 * Created by zhanhai on 2018/12/7.
 *
 * @author zhanhai
 * @date 2018/12/07
 */
public enum HumanEnum {

    YellowMaleHuman("net.singlex.designpattern.abstractfactorypattern.service.impl.MaleYellowHuman"),
    YellowFemaleHuman("net.singlex.designpattern.abstractfactorypattern.service.impl.FemaleYellowHuman"),
    WhitewMaleHuman("net.singlex.designpattern.abstractfactorypattern.service.impl.MaleWhiteHuman"),
    WhitewFemaleHuman("net.singlex.designpattern.abstractfactorypattern.service.impl.FemaleWhiteHuman"),
    BlackwMaleHuman("net.singlex.designpattern.abstractfactorypattern.service.impl.MaleBlackHuman"),
    BlackwFemaleHuman("net.singlex.designpattern.abstractfactorypattern.service.impl.FemaleBlackHuman");

    private String value;

    /**
     * 构造函数
     *
     * @param value
     */
    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
