package com.huyi.porvue.service.impl;

import com.huyi.porvue.entity.Nation;
import com.huyi.porvue.entity.NationVo;
import com.huyi.porvue.mapper.NationMapper;
import com.huyi.porvue.service.INationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 城市字典表 服务实现类
 * </p>
 *
 * @author huyi
 * @since 2020-03-03
 */
@Service
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

    @Autowired
    private NationMapper nationMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<NationVo> findAll() {
       /* List<NationVo> list = (List<NationVo>) redisTemplate.opsForValue().get("cascader");

        if (list.size()>0 && list!=null){
            System.err.println("从redis中查询的数据");
        }else{
            System.err.println("从mysql中查询的数据");
            List<NationVo> cascader = nationMapper.findAll();
            redisTemplate.opsForValue().set("cascader",cascader);
        }*/

        return nationMapper.findAll();
    }
}
