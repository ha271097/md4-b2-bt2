package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("controller")
public class WebApp {
    @Bean
    public InternalResourceViewResolver resolver(){
        InternalResourceViewResolver irvr = new InternalResourceViewResolver();
        irvr.setPrefix("WEB-INF/view");
        irvr.setSuffix(".jsp");
        return irvr;
    }
}
