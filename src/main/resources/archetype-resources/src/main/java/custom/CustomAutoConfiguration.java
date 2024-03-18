package ${package}.custom;


#[[
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// https://www.baeldung.com/spring-boot-custom-auto-configuration
@Configuration
@EnableConfigurationProperties({CustomProperties.class})
public class CustomAutoConfiguration {

//    @Bean
//    @ConditionalOnMissingBean
//    public CustomBean customBean(@Value("${custom.starter.beanName:CustomBean}") String name) {
//        return new CustomBean(name);
//    }
}

]]#