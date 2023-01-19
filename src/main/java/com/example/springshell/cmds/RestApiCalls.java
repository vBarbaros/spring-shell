/**
 * https://reflectoring.io/spring-resttemplate/
 */
package com.example.springshell.cmds;

import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

import static java.lang.String.format;

@ShellComponent
public class RestApiCalls {
    final String CVE_API_HOSTNAME = "https://cve.circl.lu/api/";
    Logger log = Logger.getLogger(RestApiCalls.class.getName());

    @ShellMethod(key = "cpe-to", value = "Converts a CPE according to CPE 2.3 version conventions")
    public void cpeToVersion(@ShellOption(value = "-v", defaultValue = "2.3") String toCpeVersion) {
        String urlConvertToCpeVersion = getFinalUrlConvertToCpeVersion(toCpeVersion);

        String productsJson = callRestApi(urlConvertToCpeVersion);
        log.info(format("CPE Return: '%s'", productsJson));
    }

    @ShellMethod(key = "cve-for", value = "Outputs a list of CVEs related to the product")
    public void cveFor(@ShellOption(value = "-l", arity = 2) String[] keys) {
        log.info(format("CVE : '%s', Limit '%s'", keys[0], keys[1]));
        val cpe = "cpe:2.3:o:microsoft:windows_vista:6.0:sp1:-:-:home_premium:-:-:x64";
        // cpe:2.3:o:microsoft:windows_vista:6.0:sp1:-:-:home_premium:-:-:x64
        String urlGetCveListForProduct = CVE_API_HOSTNAME + "cvefor/" + keys[0] + "/" + keys[1];

        log.info(format(" GET CVE List : '%s'", urlGetCveListForProduct));
        String productsJson = callRestApi(urlGetCveListForProduct);
        log.info(format("CPE Return: '%s'", productsJson));
    }

    private static String callRestApi(String urlGetCveListForProduct) {
        RestTemplate restTemplate = new RestTemplate();
        // Fetch JSON response as String wrapped in ResponseEntity
        ResponseEntity<String> convertedCpe = restTemplate.getForEntity(urlGetCveListForProduct, String.class);
        String productsJson = convertedCpe.getBody();
        return productsJson;
    }

    private String getFinalUrlConvertToCpeVersion(String toCpeVersion) {
        val cpe = "cpe:/o:microsoft:windows_vista:6.0:sp1:~-~home_premium~-~x64~-";
        String resourceUrl = CVE_API_HOSTNAME;
        if (toCpeVersion.equals("2.2")) {
            resourceUrl += "cpe2.2/";
        } else if (toCpeVersion.equals("2.3")) {
            resourceUrl += "cpe2.3/";
        }
        resourceUrl += cpe;
        return resourceUrl;
    }

    @ShellMethod(value = "cve")
    public void cve(@ShellOption(value = "--r") boolean rememberMe) {
        log.info(format("remember me option is '%s'", rememberMe));
    }

//    /**
//     * Validate command params
//     *
//     * @param agent
//     */
//    @ShellMethod(value = "ssh agent")
//    public void sshAgent(
//            @ShellOption(value = "--a")
//            @Size(min = 2, max = 10) String agent) {
//        log.info(format("adding agent '%s'", agent));
//    }
}
