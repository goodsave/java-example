package com.goodsave.example.spring.jpatemplate;

import com.goodsave.example.spring.util.ClassUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.io.IOException;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.goodsave.example.spring.jpatemplate")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        try {
            List<Class<?>> classes = ClassUtil.getAllSubClassByParentClass(BaseRepository.class);
            for (Class<?> repository : classes) {
                if (repository.isInterface()) {
                    System.out.println("[repository name] = " + repository.getName());

                    UserRepository userRepository = (UserRepository) new RepositoryProxyFactory().getInstance(repository);
                    userRepository.findOnetUserById(1);

                    Class<? extends Object> repositoryImplClass = new RepositoryProxyFactory().getInstance(repository).getClass();
                    BeanDefinition bean = new GenericBeanDefinition();
                    bean.setBeanClassName(repositoryImplClass.getName());
                    DefaultListableBeanFactory fty = (DefaultListableBeanFactory) applicationContext.getAutowireCapableBeanFactory();
                    fty.registerBeanDefinition(repositoryImplClass.getName(), bean);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
