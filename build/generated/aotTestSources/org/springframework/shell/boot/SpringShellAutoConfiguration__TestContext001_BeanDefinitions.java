package org.springframework.shell.boot;

import java.lang.Class;
import java.util.Set;
import org.jline.terminal.Terminal;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.shell.ResultHandlerService;
import org.springframework.shell.Shell;
import org.springframework.shell.Shell__TestContext001_Autowiring;
import org.springframework.shell.command.CommandCatalog;
import org.springframework.shell.config.ShellConversionServiceSupplier;
import org.springframework.shell.context.ShellContext;
import org.springframework.shell.exit.ExitCodeMappings;

/**
 * Bean definitions for {@link SpringShellAutoConfiguration}
 */
public class SpringShellAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'springShellAutoConfiguration'
   */
  public static BeanDefinition getSpringShellAutoConfigurationBeanDefinition() {
    Class<?> beanType = SpringShellAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(SpringShellAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'shellConversionServiceSupplier'.
   */
  private static BeanInstanceSupplier<ShellConversionServiceSupplier> getShellConversionServiceSupplierInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ShellConversionServiceSupplier>forFactoryMethod(SpringShellAutoConfiguration.class, "shellConversionServiceSupplier", ApplicationContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpringShellAutoConfiguration.class).shellConversionServiceSupplier(args.get(0)));
  }

  /**
   * Get the bean definition for 'shellConversionServiceSupplier'
   */
  public static BeanDefinition getShellConversionServiceSupplierBeanDefinition() {
    Class<?> beanType = ShellConversionServiceSupplier.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getShellConversionServiceSupplierInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'resultHandlerService'.
   */
  private static BeanInstanceSupplier<ResultHandlerService> getResultHandlerServiceInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ResultHandlerService>forFactoryMethod(SpringShellAutoConfiguration.class, "resultHandlerService", Set.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpringShellAutoConfiguration.class).resultHandlerService(args.get(0)));
  }

  /**
   * Get the bean definition for 'resultHandlerService'
   */
  public static BeanDefinition getResultHandlerServiceBeanDefinition() {
    Class<?> beanType = ResultHandlerService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getResultHandlerServiceInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'shell'.
   */
  private static BeanInstanceSupplier<Shell> getShellInstanceSupplier() {
    return BeanInstanceSupplier.<Shell>forFactoryMethod(SpringShellAutoConfiguration.class, "shell", ResultHandlerService.class, CommandCatalog.class, Terminal.class, ShellConversionServiceSupplier.class, ShellContext.class, ExitCodeMappings.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpringShellAutoConfiguration.class).shell(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5)));
  }

  /**
   * Get the bean definition for 'shell'
   */
  public static BeanDefinition getShellBeanDefinition() {
    Class<?> beanType = Shell.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<Shell> instanceSupplier = getShellInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(Shell__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
