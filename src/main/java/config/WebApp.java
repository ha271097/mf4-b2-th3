package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("controller")
public class WebApp {
    @Bean
    public InternalResourceViewResolver resolver(){
        InternalResourceViewResolver resolver1 = new InternalResourceViewResolver();
        resolver1.setPrefix("/WEB-INF/view");
        resolver1.setSuffix(".jsp");
        return resolver1;
    }
}
