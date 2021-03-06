package cn.yuanyu.app.service.sys;


import cn.yuanyu.app.entity.sys.SysUserEntity;

/**
 * @author yuanyu
 */
public interface SysUserService {

    /**
     * 根据用户名，查询系统用户
     */
    SysUserEntity queryByUserName(String username);
}
