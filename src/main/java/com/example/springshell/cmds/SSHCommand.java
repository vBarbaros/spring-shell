/**
 * https://reflectoring.io/spring-shell/
 */
package com.example.springshell.cmds;

import jakarta.validation.constraints.Size;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.logging.Logger;

import static java.lang.String.format;

@ShellComponent
public class SSHCommand {
    Logger log = Logger.getLogger(SSHCommand.class.getName());

    /**
     * Declare CLI cmd with default params
     * @param remoteServer
     */
    @ShellMethod(key = "my-ssh", value = "connect to remote server")
    public void ssh(@ShellOption(value = "-s", defaultValue = "default-server") String remoteServer)
    {
        log.info(format("Logged to machine '%s'", remoteServer));
    }

    /**
     * Use multi-valued parameters
     * @param keys
     */
    @ShellMethod(value = "add keys")
    public void sshAdd(@ShellOption(value = "--k", arity = 2) String[] keys)
    {
        log.info(format("Adding keys '%s' '%s'", keys[0], keys[1]));
    }

    /**
     * Work with boolean params
     * @param rememberMe
     */
    @ShellMethod(value = "sign in")
    public void sshLogin(@ShellOption(value = "--r") boolean rememberMe)
    {
        log.info(format("remember me option is '%s'", rememberMe));
    }

    /**
     * Validate command params
     * @param agent
     */
    @ShellMethod(value = "ssh agent")
    public void sshAgent(
            @ShellOption(value = "--a")
            @Size(min = 2, max = 10) String agent)
    {
        log.info(format("adding agent '%s'", agent));
    }
}
