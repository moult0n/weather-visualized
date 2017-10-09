package weatherapp;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class XkcdController {

    @RequestMapping("/currentxkcd")
    public @ResponseBody String xkcdtext() {
        RestTemplate restTemplate = new RestTemplate();

        Xkcd xkcd = restTemplate.getForObject("https://xkcd.com/info.0.json", Xkcd.class);


        return xkcd.toString();
    }


}
