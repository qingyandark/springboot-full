package cn.qingyandark.mapper;

import cn.qingyandark.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from tb_mybatis where id = #{id}")
    public User getById(Integer id);
}
