package com.huyi.porvue.service.impl;

import com.huyi.porvue.entity.Employee;
import com.huyi.porvue.mapper.EmployeeMapper;
import com.huyi.porvue.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huyi
 * @since 2020-03-03
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
