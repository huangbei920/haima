package com.ruoyi.system.service;

import com.ruoyi.system.domain.TMemberConsume;

import java.util.List;

/**
 * 会员消费 服务层
 *
 * @author ruoyi
 * @date 2019-07-02
 */
public interface ITMemberConsumeService {
    /**
     * 查询会员消费信息
     *
     * @param id 会员消费ID
     * @return 会员消费信息
     */
    public TMemberConsume selectTMemberConsumeById(Long id);

    /**
     * 查询会员消费列表
     *
     * @param tMemberConsume 会员消费信息
     * @return 会员消费集合
     */
    public List<TMemberConsume> selectTMemberConsumeList(TMemberConsume tMemberConsume);

    /**
     * 新增会员消费
     *
     * @param tMemberConsume 会员消费信息
     * @return 结果
     */
    public int insertTMemberConsume(TMemberConsume tMemberConsume);

    /**
     * 修改会员消费
     *
     * @param tMemberConsume 会员消费信息
     * @return 结果
     */
    public int updateTMemberConsume(TMemberConsume tMemberConsume);

    /**
     * 删除会员消费信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTMemberConsumeByIds(String ids);

}
