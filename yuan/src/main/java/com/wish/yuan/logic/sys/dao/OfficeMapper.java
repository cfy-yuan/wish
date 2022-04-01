package com.wish.yuan.logic.sys.dao;

import com.wish.common.entity.TreeNode;
import com.wish.yuan.logic.sys.entity.Office;

import java.util.List;

/**
 * @author yuan
 */
public interface OfficeMapper {
    /**
     * Add a piece of data to the database
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 11:08
     * @version: 0.0.1
     */
    int insert(Office record);

    /**
     * Add data selectively to the database
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 11:09
     * @version: 0.0.1
     */
    int insertSelective(Office record);

    /**
     * Query only one piece of data by primary key
     * @param officeId
     * @return: com.wish.yuan.logic.sys.entity.Office
     * @author: cfy
     * @date: 2021/8/4 11:09
     * @version: 0.0.1
     */
    Office selectByPrimaryKey(Long officeId);

    /**
     * Selectively update data through primary key
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 11:09
     * @version: 0.0.1
     */
    int updateByPrimaryKeySelective(Office record);

    /**
     * Update all data through primary key
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 11:09
     * @version: 0.0.1
     */
    int updateByPrimaryKey(Office record);

    /**
     * Query only list piece of data by primary key
     * @param office
     * @return: java.util.List<com.wish.yuan.logic.sys.entity.Office>
     * @author: cfy
     * @date: 2021/8/4 11:09
     * @version: 0.0.1
     */
    List<Office> selectOfficeList(Office office);

    /**
     * 获取机构树结构
     * @param treeNode
     * @return: java.util.List<com.wish.common.entity.TreeNode>
     * @author: cfy
     * @date: 2021/8/4 11:09
     * @version: 0.0.1
     */
    List<TreeNode> selectOfficeTreeList(TreeNode treeNode);
}