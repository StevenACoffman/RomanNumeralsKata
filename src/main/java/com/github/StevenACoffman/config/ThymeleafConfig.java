package com.github.StevenACoffman.config;
import net.sourceforge.html5val.Html5ValDialect;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.extras.conditionalcomments.dialect.ConditionalCommentsDialect;
import org.thymeleaf.spring4.SpringTemplateEngine;

@Configuration
@ConditionalOnClass(SpringTemplateEngine.class)
@AutoConfigureBefore(ThymeleafAutoConfiguration.class)
public class ThymeleafConfig {
    
    @Bean
    public Html5ValDialect html5ValDialect() {
        return new Html5ValDialect();
    }
    @Bean
    public ConditionalCommentsDialect conditionalCommentDialect() {
        return new ConditionalCommentsDialect();
    }
    
}
