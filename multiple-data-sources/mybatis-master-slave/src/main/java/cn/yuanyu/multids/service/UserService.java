package cn.yuanyu.multids.service;


import cn.yuanyu.multids.entity.User;

/**
 * @author yuanyu
 */
public interface UserService {
    /**
     * 用户注册
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User register(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User update(User user);
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Integer id);
}