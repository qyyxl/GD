/*

package com.gd.inst;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MybatisPlusGenerator {

    public static void main(String[] args) {
        String packageName = "com.gd.inst";
        generateByTables(packageName,
                "user_love","recommend","btoc_sku");
    }

    public void generateCode() {
        String packageName = "com.gd.inst";
        generateByTables(packageName,
                "user");
    }

    public static void generateByTables(String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(false)
                .setEnableCache(false)
                .setBaseResultMap(true)
                .setBaseColumnList(true)
                .setAuthor("system")
                .setOutputDir("d:\\codeGen")
                .setFileOverride(true)
                .setServiceName("%sService")
                .setMapperName("%sDao")
                .setXmlName("%sDao");

        DataSourceConfig dataSourceConfig = new DataSourceConfig()
                .setDbType(DbType.MYSQL)
                .setUrl("jdbc:mysql://45.78.77.129:3306/GDFORQY?useSSL=false")
                .setUsername("root")
                .setPassword("1160yinQY..")
                .setDriverName("com.mysql.cj.jdbc.Driver");

        StrategyConfig strategyConfig = new StrategyConfig()
                .setCapitalMode(true)
                .setEntityLombokModel(false)
                .setEntityColumnConstant(false)
                .entityTableFieldAnnotationEnable(true)
                .setTablePrefix("t_")
                .setNaming(NamingStrategy.underline_to_camel)
                .setSuperEntityClass("com.yao.spu.service.core.model.BaseModel")
                .setSuperMapperClass("com.yao.spu.service.core.dao.BaseDao")
                .setSuperServiceClass("com.yao.spu.service.core.service.BaseService")
                .setSuperServiceImplClass("com.yao.spu.service.core.service.BaseServiceImpl")
                .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
        PackageConfig packageConfig = new PackageConfig()
                .setParent(packageName)
                .setEntity("model")
                .setMapper("dao")
                .setXml("mapper")
                .setControFactoryBeanller("controller");

        new AutoGenerator()
                .setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig)
                .execute();
    }
}
*/
