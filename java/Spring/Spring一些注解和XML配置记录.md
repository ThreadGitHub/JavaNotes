### Spring 在 XML 中引用 properties 文件

system-properties-mode 属性 设置系统属性模式 ENVIRONMENT（默认），NEVER，OVERRIDE

- ENVIRONMENT(默认) ：表示先找ENVIRONMENT，再找properties-ref/location的
- **NEVER：永远不用ENVIRONMENT 只找 properties-ref/location 的**   一般是用这个
- OVERRIDE：类似于ENVIRONMENT

```xml
<!--引用 .properties 文件中的属性值-->
<context:property-placeholder location="classpath:db.properties" system-properties-mode="NEVER" />
```

引用成功后使用 `${properties文件中的key}` 来获取值.

