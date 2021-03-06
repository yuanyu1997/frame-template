package cn.yuanyu.config.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 判断操作系统是否是Windows系统
 */
public class WindowsCondition implements Condition {
    /**
     * @param context  判断条件能使用的上下文（环境）
     * @param metadata 注释信息
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 获取ioc使用的beanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        // 获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        // 获取当前环境信息
        Environment environment = context.getEnvironment();
        // 获取到bean定义的注册类（注册一个bean的定义、移除一个bean的定义、查询一个bean的定义...）
        // 可以判断容器中的bean注册情况，也可以给容器中注册bean
        BeanDefinitionRegistry registry = context.getRegistry();

        String property = environment.getProperty("os.name");

        if (property != null) {
            return property.contains("Windows");
        }
        return false;
    }
}
