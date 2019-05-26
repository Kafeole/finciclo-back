package es.dgraph;

import static springfox.documentation.builders.PathSelectors.regex;
import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
	
    @Bean
    public Docket apiHtml() {
        return new Docket(DocumentationType.SWAGGER_2)
        	.groupName("Html")
        	.select()
            .apis(RequestHandlerSelectors
                .basePackage("es.dgraph"))
            .paths(PathSelectors.regex("/html.*"))
            .build().apiInfo(apiEndPointsInfo());
    }
    
    @Bean
    public Docket apCss() {
        return new Docket(DocumentationType.SWAGGER_2)
        	.groupName("Css")
        	.select()
            .apis(RequestHandlerSelectors
                .basePackage("es.dgraph"))
            .paths(PathSelectors.regex("/css.*"))
            .build().apiInfo(apiEndPointsInfo());
    }
    
    @Bean
    public Docket apiLib() {
        return new Docket(DocumentationType.SWAGGER_2)
        	.groupName("Libreria")
        	.select()
            .apis(RequestHandlerSelectors
                .basePackage("es.dgraph"))
            .paths(PathSelectors.regex("/libs.*"))
            .build().apiInfo(apiEndPointsInfo());
    }   
    
    @Bean
    public Docket apiMidway() {
        return new Docket(DocumentationType.SWAGGER_2)
        	.groupName("Midway")
        	.select()
            .apis(RequestHandlerSelectors
                .basePackage("es.dgraph"))
            .paths(PathSelectors.regex("/midway.*"))
            .build().apiInfo(apiEndPointsInfo());
    }   
    
    @Bean
    public Docket apiProyecto() {
        return new Docket(DocumentationType.SWAGGER_2)
        	.groupName("Proyectos")
        	.select()
            .apis(RequestHandlerSelectors
                .basePackage("es.dgraph"))
            .paths(PathSelectors.regex("/proyectos.*"))
            .build().apiInfo(apiEndPointsInfo());
    }
    
    @Bean
    public Docket todosApi() {

        return new Docket(DocumentationType.SWAGGER_2)

        		.groupName("Todos")
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("es.dgraph"))
                .paths(regex("/.*") )
                .build().apiInfo(apiEndPointsInfo());

    }
    
    private ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder().title("Vanyl Spring Boot REST API")
            .description("Vanyl Web Code Editor API")
            .contact(new Contact("Guillermo Valbuena Gil", "", "valbitron@yahoo.es"))
            .license("Apache 2.0")
            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
            .version("1.0.0")
            .build();
    }
}