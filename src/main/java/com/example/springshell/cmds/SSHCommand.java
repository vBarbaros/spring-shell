package com.example.springshell.cmds;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.logging.Logger;

import static java.lang.String.format;

@ShellComponent
public class SSHCommand {
    Logger log = Logger.getLogger(SSHCommand.class.getName());

    @ShellMethod(key = "my-ssh", value = "connect to remote server")
    public void ssh(@ShellOption(value = "-s") String remoteServer)
    {
        log.info(format("Logged to machine '%s'", remoteServer));
    }
}
