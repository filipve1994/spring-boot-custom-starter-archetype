package ${package}.custom;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "custom.starter")
public class CustomProperties {
    private String beanName = "CustomBean";
}