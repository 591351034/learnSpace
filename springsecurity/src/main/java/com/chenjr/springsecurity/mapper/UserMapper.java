package com.chenjr.springsecurity.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenjr.springsecurity.entity.Users;
import org.springframework.stereotype.Repository;

/**
 * Description:
 * <p>
 * ClassName: UserMapper
 * date: 2022/10/10 17:13
 *
 * @author chenjr
 */
@Repository
public interface UserMapper extends BaseMapper<Users> {
}
