package back._config.Swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {
//http://localhost:8080/swagger-ui/index.html#/

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info() // Usando io.swagger.v3.oas.models.info.Info
                        .title("Gestão de petShop")
                        .description("API responsável pela gestão de um petShop")
                        .version("1.0.0"));
    }

}