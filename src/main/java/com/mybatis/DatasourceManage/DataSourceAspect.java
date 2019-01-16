package com.mybatis.DatasourceManage;

import com.mybatis.mapper.BookDataSource.BookPublicMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAspect {

    /**
     * 使用空方法定义切点表达式
     */
    @Pointcut("execution(* com.mybatis.mapper.*.*.*(..))")
    public void declareJointPointExpression() {
    }

    @Before("declareJointPointExpression()")
    public void setDataSource(JoinPoint point) {

        //一个数据源有多个映射的时候每个数据源使用一个空的基类区分是哪个数据源的查询，每个数据源均可以建立一个公共的基类，避免一个数据源里面所有的接口都要检验
        if(point.getTarget() instanceof BookPublicMapper){
                DatabaseContextHolder.setDatabaseType(DatabaseType.book);
            }else
                DatabaseContextHolder.setDatabaseType(DatabaseType.mybatis);

    }

}
