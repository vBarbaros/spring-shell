package com.example.springshell;

import org.springframework.aop.framework.autoproxy.InfrastructureAdvisorAutoProxyCreator__TestContext001_BeanDefinitions;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.context.LifecycleProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskExecutionProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskSchedulingProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.context.properties.BoundConfigurationProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinder__TestContext001_BeanDefinitions;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor__TestContext001_BeanDefinitions;
import org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer__TestContext001_BeanDefinitions;
import org.springframework.boot.test.mock.mockito.MockitoPostProcessor__TestContext001_BeanDefinitions;
import org.springframework.boot.validation.beanvalidation.MethodValidationExcludeFilter__TestContext001_BeanDefinitions;
import org.springframework.context.event.DefaultEventListenerFactory__TestContext001_BeanDefinitions;
import org.springframework.context.event.EventListenerMethodProcessor__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.ApplicationRunnerAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.CommandCatalogAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.CompleterAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.ComponentFlowAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.ExitCodeAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.JLineAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.JLineShellAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.LineReaderAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.ParameterResolverAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.ShellContextAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.ShellRunnerAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.SpringShellAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.SpringShellProperties__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.StandardAPIAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.StandardCommandsAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.ThemingAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.shell.boot.UserConfigAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.shell.result.ResultHandlerConfig__TestContext001_BeanDefinitions;

/**
 * Register bean definitions for the bean factory.
 */
public class SpringShellApplicationTests__TestContext001_BeanFactoryRegistrations {
  /**
   * Register the bean definitions.
   */
  public void registerBeanDefinitions(DefaultListableBeanFactory beanFactory) {
    beanFactory.registerBeanDefinition("org.springframework.context.event.internalEventListenerProcessor", EventListenerMethodProcessor__TestContext001_BeanDefinitions.getInternalEventListenerProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.context.event.internalEventListenerFactory", DefaultEventListenerFactory__TestContext001_BeanDefinitions.getInternalEventListenerFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.test.mock.mockito.MockitoPostProcessor$SpyPostProcessor", MockitoPostProcessor__TestContext001_BeanDefinitions.SpyPostProcessor__BeanDefinitions.getSpyPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.test.mock.mockito.MockitoPostProcessor", MockitoPostProcessor__TestContext001_BeanDefinitions.getMockitoPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("springShellApplication", SpringShellApplication__TestContext001_BeanDefinitions.getSpringShellApplicationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.AutoConfigurationPackages", AutoConfigurationPackages__TestContext001_BeanDefinitions.BasePackages__BeanDefinitions.getAutoConfigurationPackagesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration", PropertyPlaceholderAutoConfiguration__TestContext001_BeanDefinitions.getPropertyPlaceholderAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("propertySourcesPlaceholderConfigurer", PropertyPlaceholderAutoConfiguration__TestContext001_BeanDefinitions.getPropertySourcesPlaceholderConfigurerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration", AopAutoConfiguration__TestContext001_BeanDefinitions.ClassProxyingConfiguration__BeanDefinitions.getClassProxyingConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("forceAutoProxyCreatorToUseClassProxying", AopAutoConfiguration__TestContext001_BeanDefinitions.ClassProxyingConfiguration__BeanDefinitions.getForceAutoProxyCreatorToUseClassProxyingBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.aop.AopAutoConfiguration", AopAutoConfiguration__TestContext001_BeanDefinitions.getAopAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration", ApplicationAvailabilityAutoConfiguration__TestContext001_BeanDefinitions.getApplicationAvailabilityAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("applicationAvailability", ApplicationAvailabilityAutoConfiguration__TestContext001_BeanDefinitions.getApplicationAvailabilityBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration", ValidationAutoConfiguration__TestContext001_BeanDefinitions.getValidationAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("defaultValidator", ValidationAutoConfiguration__TestContext001_BeanDefinitions.getDefaultValidatorBeanDefinition());
    beanFactory.registerBeanDefinition("methodValidationPostProcessor", ValidationAutoConfiguration__TestContext001_BeanDefinitions.getMethodValidationPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration", ConfigurationPropertiesAutoConfiguration__TestContext001_BeanDefinitions.getConfigurationPropertiesAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor", ConfigurationPropertiesBindingPostProcessor__TestContext001_BeanDefinitions.getConfigurationPropertiesBindingPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.internalConfigurationPropertiesBinderFactory", ConfigurationPropertiesBinder__TestContext001_BeanDefinitions.Factory__BeanDefinitions.getInternalConfigurationPropertiesBinderFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.internalConfigurationPropertiesBinder", ConfigurationPropertiesBinder__TestContext001_BeanDefinitions.getInternalConfigurationPropertiesBinderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.BoundConfigurationProperties", BoundConfigurationProperties__TestContext001_BeanDefinitions.getBoundConfigurationPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter", MethodValidationExcludeFilter__TestContext001_BeanDefinitions.getMethodValidationExcludeFilterBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration", LifecycleAutoConfiguration__TestContext001_BeanDefinitions.getLifecycleAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("lifecycleProcessor", LifecycleAutoConfiguration__TestContext001_BeanDefinitions.getLifecycleProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties", LifecycleProperties__TestContext001_BeanDefinitions.getLifecyclePropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration", ProjectInfoAutoConfiguration__TestContext001_BeanDefinitions.getProjectInfoAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties", ProjectInfoProperties__TestContext001_BeanDefinitions.getProjectInfoPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration", SqlInitializationAutoConfiguration__TestContext001_BeanDefinitions.getSqlInitializationAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.sql.init-org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties", SqlInitializationProperties__TestContext001_BeanDefinitions.getSqlInitializationPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor", DatabaseInitializationDependencyConfigurer__TestContext001_BeanDefinitions.DependsOnDatabaseInitializationPostProcessor__BeanDefinitions.getDependsOnDatabaseInitializationPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration", TaskExecutionAutoConfiguration__TestContext001_BeanDefinitions.getTaskExecutionAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("taskExecutorBuilder", TaskExecutionAutoConfiguration__TestContext001_BeanDefinitions.getTaskExecutorBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("applicationTaskExecutor", TaskExecutionAutoConfiguration__TestContext001_BeanDefinitions.getApplicationTaskExecutorBeanDefinition());
    beanFactory.registerBeanDefinition("spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties", TaskExecutionProperties__TestContext001_BeanDefinitions.getTaskExecutionPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration", TaskSchedulingAutoConfiguration__TestContext001_BeanDefinitions.getTaskSchedulingAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("taskSchedulerBuilder", TaskSchedulingAutoConfiguration__TestContext001_BeanDefinitions.getTaskSchedulerBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties", TaskSchedulingProperties__TestContext001_BeanDefinitions.getTaskSchedulingPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.ApplicationRunnerAutoConfiguration", ApplicationRunnerAutoConfiguration__TestContext001_BeanDefinitions.getApplicationRunnerAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("defaultShellApplicationRunner", ApplicationRunnerAutoConfiguration__TestContext001_BeanDefinitions.getDefaultShellApplicationRunnerBeanDefinition());
    beanFactory.registerBeanDefinition("spring.shell-org.springframework.shell.boot.SpringShellProperties", SpringShellProperties__TestContext001_BeanDefinitions.getSpringShellPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.CommandCatalogAutoConfiguration", CommandCatalogAutoConfiguration__TestContext001_BeanDefinitions.getCommandCatalogAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("commandCatalog", CommandCatalogAutoConfiguration__TestContext001_BeanDefinitions.getCommandCatalogBeanDefinition());
    beanFactory.registerBeanDefinition("defaultCommandCatalogCustomizer", CommandCatalogAutoConfiguration__TestContext001_BeanDefinitions.getDefaultCommandCatalogCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("helpOptionsCommandRegistrationCustomizer", CommandCatalogAutoConfiguration__TestContext001_BeanDefinitions.getHelpOptionsCommandRegistrationCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("commandRegistrationBuilderSupplier", CommandCatalogAutoConfiguration__TestContext001_BeanDefinitions.getCommandRegistrationBuilderSupplierBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.CompleterAutoConfiguration", CompleterAutoConfiguration__TestContext001_BeanDefinitions.getCompleterAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("completer", CompleterAutoConfiguration__TestContext001_BeanDefinitions.getCompleterBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.ComponentFlowAutoConfiguration$ComponentFlowConfiguration", ComponentFlowAutoConfiguration__TestContext001_BeanDefinitions.ComponentFlowConfiguration__BeanDefinitions.getComponentFlowConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("shellCommonComponentFlowCustomizer", ComponentFlowAutoConfiguration__TestContext001_BeanDefinitions.ComponentFlowConfiguration__BeanDefinitions.getShellCommonComponentFlowCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.ComponentFlowAutoConfiguration", ComponentFlowAutoConfiguration__TestContext001_BeanDefinitions.getComponentFlowAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("componentFlowBuilder", ComponentFlowAutoConfiguration__TestContext001_BeanDefinitions.getComponentFlowBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.ExitCodeAutoConfiguration", ExitCodeAutoConfiguration__TestContext001_BeanDefinitions.getExitCodeAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("shellExitCodeExceptionMapper", ExitCodeAutoConfiguration__TestContext001_BeanDefinitions.getShellExitCodeExceptionMapperBeanDefinition());
    beanFactory.registerBeanDefinition("shellExitCodeMappingsExceptionMapper", ExitCodeAutoConfiguration__TestContext001_BeanDefinitions.getShellExitCodeMappingsExceptionMapperBeanDefinition());
    beanFactory.registerBeanDefinition("exitCodeExceptionProvider", ExitCodeAutoConfiguration__TestContext001_BeanDefinitions.getExitCodeExceptionProviderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.JLineAutoConfiguration$JLineHistoryConfiguration", JLineAutoConfiguration__TestContext001_BeanDefinitions.JLineHistoryConfiguration__BeanDefinitions.getJLineHistoryConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("history", JLineAutoConfiguration__TestContext001_BeanDefinitions.JLineHistoryConfiguration__BeanDefinitions.getHistoryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.JLineAutoConfiguration", JLineAutoConfiguration__TestContext001_BeanDefinitions.getJLineAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.JLineShellAutoConfiguration", JLineShellAutoConfiguration__TestContext001_BeanDefinitions.getJLineShellAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("terminal", JLineShellAutoConfiguration__TestContext001_BeanDefinitions.getTerminalBeanDefinition());
    beanFactory.registerBeanDefinition("promptProvider", JLineShellAutoConfiguration__TestContext001_BeanDefinitions.getPromptProviderBeanDefinition());
    beanFactory.registerBeanDefinition("parser", JLineShellAutoConfiguration__TestContext001_BeanDefinitions.getParserBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.LineReaderAutoConfiguration", LineReaderAutoConfiguration__TestContext001_BeanDefinitions.getLineReaderAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("lineReader", LineReaderAutoConfiguration__TestContext001_BeanDefinitions.getLineReaderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.ParameterResolverAutoConfiguration", ParameterResolverAutoConfiguration__TestContext001_BeanDefinitions.getParameterResolverAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("defaultCompletionResolver", ParameterResolverAutoConfiguration__TestContext001_BeanDefinitions.getDefaultCompletionResolverBeanDefinition());
    beanFactory.registerBeanDefinition("commandExecutionHandlerMethodArgumentResolvers", ParameterResolverAutoConfiguration__TestContext001_BeanDefinitions.getCommandExecutionHandlerMethodArgumentResolversBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.ShellContextAutoConfiguration", ShellContextAutoConfiguration__TestContext001_BeanDefinitions.getShellContextAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("shellContext", ShellContextAutoConfiguration__TestContext001_BeanDefinitions.getShellContextBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.ShellRunnerAutoConfiguration", ShellRunnerAutoConfiguration__TestContext001_BeanDefinitions.getShellRunnerAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("interactiveApplicationRunner", ShellRunnerAutoConfiguration__TestContext001_BeanDefinitions.getInteractiveApplicationRunnerBeanDefinition());
    beanFactory.registerBeanDefinition("nonInteractiveApplicationRunner", ShellRunnerAutoConfiguration__TestContext001_BeanDefinitions.getNonInteractiveApplicationRunnerBeanDefinition());
    beanFactory.registerBeanDefinition("scriptApplicationRunner", ShellRunnerAutoConfiguration__TestContext001_BeanDefinitions.getScriptApplicationRunnerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.result.ResultHandlerConfig", ResultHandlerConfig__TestContext001_BeanDefinitions.getResultHandlerConfigBeanDefinition());
    beanFactory.registerBeanDefinition("terminalSizeAwareResultHandler", ResultHandlerConfig__TestContext001_BeanDefinitions.getTerminalSizeAwareResultHandlerBeanDefinition());
    beanFactory.registerBeanDefinition("attributedCharSequenceResultHandler", ResultHandlerConfig__TestContext001_BeanDefinitions.getAttributedCharSequenceResultHandlerBeanDefinition());
    beanFactory.registerBeanDefinition("defaultResultHandler", ResultHandlerConfig__TestContext001_BeanDefinitions.getDefaultResultHandlerBeanDefinition());
    beanFactory.registerBeanDefinition("parameterValidationExceptionResultHandler", ResultHandlerConfig__TestContext001_BeanDefinitions.getParameterValidationExceptionResultHandlerBeanDefinition());
    beanFactory.registerBeanDefinition("commandParserExceptionResolver", ResultHandlerConfig__TestContext001_BeanDefinitions.getCommandParserExceptionResolverBeanDefinition());
    beanFactory.registerBeanDefinition("throwableResultHandler", ResultHandlerConfig__TestContext001_BeanDefinitions.getThrowableResultHandlerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.SpringShellAutoConfiguration", SpringShellAutoConfiguration__TestContext001_BeanDefinitions.getSpringShellAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("shellConversionServiceSupplier", SpringShellAutoConfiguration__TestContext001_BeanDefinitions.getShellConversionServiceSupplierBeanDefinition());
    beanFactory.registerBeanDefinition("resultHandlerService", SpringShellAutoConfiguration__TestContext001_BeanDefinitions.getResultHandlerServiceBeanDefinition());
    beanFactory.registerBeanDefinition("shell", SpringShellAutoConfiguration__TestContext001_BeanDefinitions.getShellBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.StandardAPIAutoConfiguration", StandardAPIAutoConfiguration__TestContext001_BeanDefinitions.getStandardAPIAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("commandValueProvider", StandardAPIAutoConfiguration__TestContext001_BeanDefinitions.getCommandValueProviderBeanDefinition());
    beanFactory.registerBeanDefinition("enumValueProvider", StandardAPIAutoConfiguration__TestContext001_BeanDefinitions.getEnumValueProviderBeanDefinition());
    beanFactory.registerBeanDefinition("fileValueProvider", StandardAPIAutoConfiguration__TestContext001_BeanDefinitions.getFileValueProviderBeanDefinition());
    beanFactory.registerBeanDefinition("standardMethodTargetResolver", StandardAPIAutoConfiguration__TestContext001_BeanDefinitions.getStandardMethodTargetResolverBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.StandardCommandsAutoConfiguration", StandardCommandsAutoConfiguration__TestContext001_BeanDefinitions.getStandardCommandsAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("help", StandardCommandsAutoConfiguration__TestContext001_BeanDefinitions.getHelpBeanDefinition());
    beanFactory.registerBeanDefinition("clear", StandardCommandsAutoConfiguration__TestContext001_BeanDefinitions.getClearBeanDefinition());
    beanFactory.registerBeanDefinition("quit", StandardCommandsAutoConfiguration__TestContext001_BeanDefinitions.getQuitBeanDefinition());
    beanFactory.registerBeanDefinition("stacktrace", StandardCommandsAutoConfiguration__TestContext001_BeanDefinitions.getStacktraceBeanDefinition());
    beanFactory.registerBeanDefinition("script", StandardCommandsAutoConfiguration__TestContext001_BeanDefinitions.getScriptBeanDefinition());
    beanFactory.registerBeanDefinition("historyCommand", StandardCommandsAutoConfiguration__TestContext001_BeanDefinitions.getHistoryCommandBeanDefinition());
    beanFactory.registerBeanDefinition("version", StandardCommandsAutoConfiguration__TestContext001_BeanDefinitions.getVersionBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.ThemingAutoConfiguration", ThemingAutoConfiguration__TestContext001_BeanDefinitions.getThemingAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("themeActive", ThemingAutoConfiguration__TestContext001_BeanDefinitions.getThemeActiveBeanDefinition());
    beanFactory.registerBeanDefinition("themeRegistry", ThemingAutoConfiguration__TestContext001_BeanDefinitions.getThemeRegistryBeanDefinition());
    beanFactory.registerBeanDefinition("shellThemeResolver", ThemingAutoConfiguration__TestContext001_BeanDefinitions.getShellThemeResolverBeanDefinition());
    beanFactory.registerBeanDefinition("templateExecutor", ThemingAutoConfiguration__TestContext001_BeanDefinitions.getTemplateExecutorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.shell.boot.UserConfigAutoConfiguration", UserConfigAutoConfiguration__TestContext001_BeanDefinitions.getUserConfigAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("userConfigPathProvider", UserConfigAutoConfiguration__TestContext001_BeanDefinitions.getUserConfigPathProviderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.aop.config.internalAutoProxyCreator", InfrastructureAdvisorAutoProxyCreator__TestContext001_BeanDefinitions.getInternalAutoProxyCreatorBeanDefinition());
  }

  /**
   * Register the aliases.
   */
  public void registerAliases(DefaultListableBeanFactory beanFactory) {
    beanFactory.registerAlias("applicationTaskExecutor", "taskExecutor");
  }
}