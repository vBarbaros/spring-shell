/**
 * https://reflectoring.io/spring-shell/
 */
package com.example.springshell.cmds;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.logging.Logger;

@ShellComponent
public class SSHLoggingCommand {
    Logger log = Logger.getLogger(SSHLoggingCommand.class.getName());
    private boolean signedIn;

    @ShellMethod(value = "sign in")
    public void signIn() {
        this.signedIn = true;
        log.info("Signed In!");
    }

    @ShellMethod(value = "sign out")
    public void signOut() {
        this.signedIn = false;
        log.info("Signed out!");
    }

    // note the naming
    public Availability signOutAvailability() {
        return signedIn ?
                Availability.available() : Availability.unavailable("Must be signed in first");
    }
}
