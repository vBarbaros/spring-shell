/**
 * https://reflectoring.io/spring-resttemplate/
 */
package com.example.springshell.cmds;

import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

import static java.lang.String.format;

@ShellComponent
public class RestApiCalls {
    Logger log = Logger.getLogger(RestApiCalls.class.getName());

    /**
     * Declare CLI cmd with default params
     *
     */
    @ShellMethod(key = "get", value = "connect to remote server")
//    public void cget(@ShellOption(value = "-s", defaultValue = "default-server") String remoteServer) {
    public void get() {
        RestTemplate restTemplate = new RestTemplate();
        val cpe = "cpe:2.3:o:microsoft:windows_vista:6.0:sp1:-:-:home_premium:-:-:x64:-";
        String resourceUrl = "https://cve.circl.lu/api/cpe2.2/" + cpe;

        // Fetch JSON response as String wrapped in ResponseEntity
        ResponseEntity<String> response = restTemplate.getForEntity(resourceUrl, String.class);
        String productsJson = response.getBody();

        System.out.println(productsJson);
        log.info(format("CPE Return: '%s'", productsJson));
    }

//    /**
//     * Use multi-valued parameters
//     *
//     * @param keys
//     */
//    @ShellMethod(value = "add keys")
//    public void sshAdd(@ShellOption(value = "--k", arity = 2) String[] keys) {
//        log.info(format("Adding keys '%s' '%s'", keys[0], keys[1]));
//    }
//
//    /**
//     * Work with boolean params
//     *
//     * @param rememberMe
//     */
//    @ShellMethod(value = "sign in")
//    public void sshLogin(@ShellOption(value = "--r") boolean rememberMe) {
//        log.info(format("remember me option is '%s'", rememberMe));
//    }
//
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
