package net.singlex.designpattern.multitonpattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by zhanhai on 2018/12/6.
 *
 * @author zhanhai
 * @date 2018/12/06
 */
public class Emperor {

    private static final int MAX_NUM = 2;

    private static ArrayList emperorInfoList = new ArrayList(MAX_NUM);
    private static ArrayList emperorList = new ArrayList(MAX_NUM);
    private static int index = 0;

    static {
        for (int i = 0; i < MAX_NUM; i++) {
            emperorList.add(new Emperor("emperor-" + i));
        }
    }

    private Emperor() {}

    private Emperor(String info) {
        emperorInfoList.add(info);
    }

    public static Emperor getInstance() {
        Random random = new Random();
        index = random.nextInt(MAX_NUM);
        return (Emperor)emperorList.get(index);
    }

    public String info() {
        return (String)emperorInfoList.get(index);
    }
}
