## Spring整合MyBatils

> 参考文章：[CSDN文章](https://blog.csdn.net/m0_37989980/article/details/104758048?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522163257853216780269837015%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=163257853216780269837015&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_click~default-1-104758048.pc_search_ecpm_flag&utm_term=spring%E6%95%B4%E5%90%88mybatis&spm=1018.2226.3001.4187)
>
> 其他两种请查看参考文章，这里只配置了自动创建Mapper代理对象的方式

### 配置Mybatils自动创建Mapper的代理实现类交给Spring的方式(这种最常用)

主要是配置 SqlSessionFactoryBean 设置数据源 和 MapperScannerConfigurer设置自动创建代理类的mapper包路径

```xml
<!--配置Mybatis-->
<bean id="sqlSessionFactoryBean" class="org.mybatis.spring.SqlSessionFactoryBean">
    <!--设置MyBatils使用的数据源-->
    <property name="dataSource" ref="dataSource"></property>
    <!--设置mapper文件的位置-->
    <property name="mapperLocations" value="classpath:org/thread/mapper/*Mapper.xml"></property>
    <!--设置mybatils配置文件的位置-->
    <property name="configLocation" value="classpath:mybatis-config.xml"></property>
</bean>

<!--配置自动创建代理对象的包路径-->
<bean id="mapperScanner" class="org.mybatis.spring.mapper.MapperScannerConfigurer">
	<property name="basePackage" value="org.thread.mapper"></property>
</bean>
```

