package fr.unilorraine.idmc.gamescatalog.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "partners", url = "${app.rawg.url}")
public interface PartnersFeign {

    @RequestMapping(method = RequestMethod.GET)
    String testGet();
}
