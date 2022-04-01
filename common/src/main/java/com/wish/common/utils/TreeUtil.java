package com.wish.common.utils;

import com.wish.common.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 树封装
 * @Classname TreeUtil
 * @Description :
 * @Date 2021/7/9 21:18
 * @Author cfy
 */
public class TreeUtil {

    public  static <T extends TreeNode> List<T> build(List<T> treeNodes) {
        List<T> result = new ArrayList<>();

        //list转map
        Map<String, T> nodeMap = new LinkedHashMap<>(treeNodes.size());
        for (T treeNode : treeNodes) {
            nodeMap.put(String.valueOf(treeNode.getId()), treeNode);
        }

        for (T node : nodeMap.values()) {
            T parent = nodeMap.get(node.getpId());
            if (parent != null && (node.getpId().equals(parent.getId()))) {
                parent.getChildren().add(node);
                continue;
            }
            result.add(node);
        }
        return result;
    }
}
