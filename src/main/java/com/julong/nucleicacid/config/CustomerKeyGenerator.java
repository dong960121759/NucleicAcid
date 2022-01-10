package com.julong.nucleicacid.config;

import com.baomidou.mybatisplus.core.incrementer.IKeyGenerator;
import com.julong.nucleicacid.dao.NucleicAcidMapper;
import org.springframework.stereotype.Component;

/**
 * 自定义自增主键
 * @className: CustomerKeyGenerator
 * @date: 2022/1/7 16:57
 */
@Component
public class CustomerKeyGenerator implements IKeyGenerator {
    private final NucleicAcidMapper nucleicAcidMapper;

    public CustomerKeyGenerator(NucleicAcidMapper nucleicAcidMapper) {
        this.nucleicAcidMapper = nucleicAcidMapper;
    }

    @Override
    public String executeSql(String incrementerName) {
        System.out.println("incrementerName:"+ incrementerName);
        nucleicAcidMapper.updateGenerator(incrementerName);

        return String.valueOf(nucleicAcidMapper.getGenerator(incrementerName));
    }
}
