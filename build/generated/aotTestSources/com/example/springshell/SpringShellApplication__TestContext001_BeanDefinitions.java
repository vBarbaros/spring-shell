package com.example.springshell;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link SpringShellApplication}
 */
public class SpringShellApplication__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'springShellApplication'
   */
  public static BeanDefinition getSpringShellApplicationBeanDefinition() {
    Class<?> beanType = SpringShellApplication.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(SpringShellApplication.class);
    beanDefinition.setInstanceSupplier(SpringShellApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
