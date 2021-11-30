package fr.unilorraine.idmc.gamescatalog.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app.rawg")
@Getter
@Setter
public class PartnersProperties {

    @Value("${app.rawg.url}")
    private String url;


}
