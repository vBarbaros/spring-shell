package org.springframework.shell.boot;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.command.CommandExecution;
import org.springframework.shell.completion.CompletionResolver;
import org.springframework.shell.config.ShellConversionServiceSupplier;

/**
 * Bean definitions for {@link ParameterResolverAutoConfiguration}
 */
public class ParameterResolverAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'parameterResolverAutoConfiguration'
   */
  public static BeanDefinition getParameterResolverAutoConfigurationBeanDefinition() {
    Class<?> beanType = ParameterResolverAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ParameterResolverAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultCompletionResolver'.
   */
  private static BeanInstanceSupplier<CompletionResolver> getDefaultCompletionResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CompletionResolver>forFactoryMethod(ParameterResolverAutoConfiguration.class, "defaultCompletionResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ParameterResolverAutoConfiguration.class).defaultCompletionResolver());
  }

  /**
   * Get the bean definition for 'defaultCompletionResolver'
   */
  public static BeanDefinition getDefaultCompletionResolverBeanDefinition() {
    Class<?> beanType = CompletionResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getDefaultCompletionResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'commandExecutionHandlerMethodArgumentResolvers'.
   */
  private static BeanInstanceSupplier<CommandExecution.CommandExecutionHandlerMethodArgumentResolvers> getCommandExecutionHandlerMethodArgumentResolversInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CommandExecution.CommandExecutionHandlerMethodArgumentResolvers>forFactoryMethod(ParameterResolverAutoConfiguration.class, "commandExecutionHandlerMethodArgumentResolvers", ShellConversionServiceSupplier.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ParameterResolverAutoConfiguration.class).commandExecutionHandlerMethodArgumentResolvers(args.get(0)));
  }

  /**
   * Get the bean definition for 'commandExecutionHandlerMethodArgumentResolvers'
   */
  public static BeanDefinition getCommandExecutionHandlerMethodArgumentResolversBeanDefinition() {
    Class<?> beanType = CommandExecution.CommandExecutionHandlerMethodArgumentResolvers.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getCommandExecutionHandlerMethodArgumentResolversInstanceSupplier());
    return beanDefinition;
  }
}
