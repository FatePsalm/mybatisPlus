package com.solace.mybatisautogenerator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisAutoGeneratorApplicationTests {
    public static void main(String[] args) {
        //1. 全局配置
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(true) // 是否支持AR模式
                .setAuthor("CaoGang") // 作者
                .setOutputDir("D:\\FatePsalm\\my-mybatis-plus\\mybatis-auto-generator\\src\\main\\java") // 生成路径
                .setFileOverride(true)  // 文件覆盖
                .setIdType(IdType.INPUT) // 主键策略
                .setServiceName("%sService")  // 设置生成的service接口的名字的首字母是否为I
                // IEmployeeService
                .setBaseResultMap(true)
                .setBaseColumnList(true);

        //2. 数据源配置
        DataSourceConfig dsConfig = new DataSourceConfig();
        dsConfig.setDbType(DbType.MYSQL)  // 设置数据库类型
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://192.168.116.128:3306/myredis?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=GMT%2B8")
                .setUsername("root")
                .setPassword("78555976129");

        //3. 策略配置
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setCapitalMode(true) //全局大写命名
                .setNaming(NamingStrategy.underline_to_camel) // 数据库表映射到实体的命名策略
                .setInclude("user");  // 生成的表

        //4. 包名策略配置
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("com.wemew")
        .setEntity("miniwechatbeans.beans")
        .setMapper("miniwechatproject.mapper")
        .setService("miniwechatproject.service")
        .setController("miniwechatproject.controller")
        .setXml("miniwechatproject.xml")
        .setServiceImpl("miniwechatproject.service.Impl")
        ;

        //5. 整合配置
        AutoGenerator ag = new AutoGenerator();

        ag.setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);
        //6. 执行
        ag.execute();
    }
}
