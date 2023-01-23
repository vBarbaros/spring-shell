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
    final String CVE_API_HOSTNAME = "https://cve.circl.lu/api";
    Logger log = Logger.getLogger(RestApiCalls.class.getName());

    @ShellMethod(key = "cpe-to", value = "Converts a CPE according to CPE 2.3 version conventions")
    public void cpeToVersion(@ShellOption(value = "-v", defaultValue = "2.3") String toCpeVersion) {
        String urlConvertToCpeVersion = getFinalUrlConvertToCpeVersion(toCpeVersion);

        String json = getRestApi(urlConvertToCpeVersion);
        log.info(format("GET Return: '%s'", json));
    }

    @ShellMethod(key = "cve-for", value = "Outputs a list of CVEs related to the product")
    public void cveFor(@ShellOption(value = "-l", arity = 2) String[] keys) {
        log.info(format("CVE : '%s', Limit '%s'", keys[0], keys[1]));
        val cpe = "cpe:2.3:o:microsoft:windows_vista:6.0:sp1:-:-:home_premium:-:-:x64";
        // cpe:2.3:o:microsoft:windows_vista:6.0:sp1:-:-:home_premium:-:-:x64
        String urlGetCveListForProduct = CVE_API_HOSTNAME + "/cvefor/" + keys[0] + "/" + keys[1];

        log.info(format("GET CVE List : '%s'", urlGetCveListForProduct));
        String json = getRestApi(urlGetCveListForProduct);
        log.info(format("GET Return: '%s'", json));
    }

    @ShellMethod(key = "cve-info", value = "Outputs all available information for the specified CVE " +
            "(Common Vulnerability and Exposure), " + "in JSON format.")
    public void cveInfo(@ShellOption(value = "-i") String cveId) {
        log.info(format("CVE ID : '%s'", cveId));
        // CVE-2016-3333
        String urlGetInfoOnCveId = CVE_API_HOSTNAME + "/cve/" + cveId;
        log.info(format("GET Info on CVE ID : '%s'", urlGetInfoOnCveId));
        String json = getRestApi(urlGetInfoOnCveId);
        log.info(format("GET Return: '%s'", json));
    }

    @ShellMethod(key = "cwe-list", value = "Outputs a list of all CWEs (Common Weakness Enumeration).")
    public void cweList() {
        String urlGetCweList = CVE_API_HOSTNAME + "/cwe";
        log.info(format(" GET CWE List : '%s'", urlGetCweList));
        String json = getRestApi(urlGetCweList);
        log.info(format("GET Return: '%s'", json));
    }

    @ShellMethod(key = "cwe-by-id", value = "Returns a CWEs (Common Weakness Enumeration) by it's id.")
    public void cweById(@ShellOption(value = "-i") int cweId) {
        String urlGetCweById = CVE_API_HOSTNAME + "/cwe/" + cweId;
        log.info(format(" GET CWE List : '%s'", urlGetCweById));
        String json = getRestApi(urlGetCweById);
        log.info(format("GET Return: '%s'", json));
    }


    @ShellMethod(key = "capec-list", value = "Outputs a list of CAPEC related to a CWE.\n" +
            "CAPEC (Common Attack Pattern Enumeration and Classification) are a list of attack types commonly used by attackers.")
    public void capecList(@ShellOption(value = "-i") int cweId) {
        String urlGetCweList = CVE_API_HOSTNAME + "/capec/" + cweId;
        log.info(format(" GET CWE List : '%s'", urlGetCweList));
        String json = getRestApi(urlGetCweList);
        log.info(format("GET Return: '%s'", json));
    }

    @ShellMethod(key = "cwe-by-capec-id", value = "Outputs a CAPEC specified by it's id.\n" +
            "CAPEC (Common Attack Pattern Enumeration and Classification) are a list of attack types commonly used by attackers.")
    public void cweByCapecId(@ShellOption(value = "-i") int capecId) {
        String urlGetCapecById = CVE_API_HOSTNAME + "/capec/show/" + capecId;
        log.info(format(" GET CAPEC By Id : '%s'", urlGetCapecById));
        String json = getRestApi(urlGetCapecById);
        log.info(format("GET Return: '%s'", json));
    }

    @ShellMethod(key = "cwe-last", value = "Outputs the last n amount of vulnerabilities. If the limit is not specified, the default of 30 is used.")
    public void cweLast(@ShellOption(value = "-n") int limit) {
        String urlGetCweLast = CVE_API_HOSTNAME + "/last/" + limit;
        log.info(format(" GET Last N CVEs : '%s'", urlGetCweLast));
        String json = getRestApi(urlGetCweLast);
        log.info(format("GET Return: '%s'", json));
    }

    @ShellMethod(key = "cwe-by-vendor", value = "Returns a list of vendors or products of a specific vendor.\n" +
            "This API call can be used in two ways; With or without the vendor.\n" +
            "When the link is called without a vendor, it will return a list of possible vendors.\n" +
            "When the link is called with a vendor, it enumerates the products for said vendor.")
    public void cweByVendor(@ShellOption(value = "-v") String vendor) {
        String urlGetCweLast = CVE_API_HOSTNAME + "/browse/" + vendor;
        log.info(format(" GET List of Vendors/Products of a Specific Vendor : '%s'", urlGetCweLast));
        String json = getRestApi(urlGetCweLast);
        log.info(format("GET Return: '%s'", json));
    }


    private static String getRestApi(String urlGetCveListForProduct) {
        RestTemplate restTemplate = new RestTemplate();
        // Fetch JSON response as String wrapped in ResponseEntity
        ResponseEntity<String> convertedCpe = restTemplate.getForEntity(urlGetCveListForProduct, String.class);
        return convertedCpe.getBody();
    }

    private String getFinalUrlConvertToCpeVersion(String toCpeVersion) {
        val cpe = "cpe:/o:microsoft:windows_vista:6.0:sp1:~-~home_premium~-~x64~-";
        String resourceUrl = CVE_API_HOSTNAME + "/";
        if (toCpeVersion.equals("2.2")) {
            resourceUrl += "cpe2.2/";
        } else if (toCpeVersion.equals("2.3")) {
            resourceUrl += "cpe2.3/";
        }
        resourceUrl += cpe;
        return resourceUrl;
    }
}
