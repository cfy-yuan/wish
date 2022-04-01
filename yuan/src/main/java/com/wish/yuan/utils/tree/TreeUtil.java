package com.wish.yuan.utils.tree;

import com.wish.common.utils.ObjectUtil;
import com.wish.yuan.logic.sys.entity.Navigation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname ThreeUtil
 * @Description :
 * @Date 2021/8/14 19:35
 * @Author cfy
 */
public class TreeUtil extends com.wish.common.utils.TreeUtil {


    /**
     * 路由数结构
     * @param navigationList
     * @return: java.util.List<com.wish.yuan.logic.sys.entity.Navigation>
     * @author: cfy
     * @date: 2021/8/14 20:10
     * @version: 0.0.1
     */
    public static List<Navigation> buildNavigation(List<Navigation> navigationList) {
        Map<Long, Navigation> map = new HashMap<>(navigationList.size());
        for (Navigation navigation : navigationList) {
            map.put(navigation.getNavigationId(), navigation);
        }

        List<Navigation> build = new ArrayList<>();
        for (Navigation navigation : map.values()) {
            Navigation superior = map.get(navigation.getNavigationSuperiorId());
            if (ObjectUtil.isObjectNotBlank(superior) &&
                    navigation.getNavigationSuperiorId().equals(superior.getNavigationId())) {
                superior.getChild().add(navigation);
                continue;
            }
            build.add(navigation);
        }
        return build;
    }

}
