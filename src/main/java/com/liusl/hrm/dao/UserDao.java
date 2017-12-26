package com.liusl.hrm.dao;

import com.liusl.hrm.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * created by l1 on 2017/12/26.
 */
@Mapper
public interface UserDao {
    /**
     *根据登录名和密码查询员工
     *@param loginname 登录名
     *@param password  登录密码
     *@return Result<User>
     */
    public User selectByNameAndPass(@Param("loginname") String loginname,
                                    @Param("password") String password);

    /**
     *根据ID查询员工
     *@param id ID号
     *@return Result<User>
     */
    public User selectById(@Param("id") Integer id);
    /**
     *根据ID删除员工
     *@param id ID号
     */
    public void deleteById(@Param("id") Integer id);

    /**
     * 更新用户信息
     * @param user
     */
    public void updateUser(@Param("user") User user);

    /**
     * 查询所有数据，分页用
     * @return List<User>
     */
    public List<User> selectByPage();
}
