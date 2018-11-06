package commands.user;

import commands.AbstractCommand;
import commands.Command;
import constants.JspPaths;

import javax.servlet.http.HttpServletRequest;

public class GoToRegistration extends AbstractCommand implements Command {
    public String execute(HttpServletRequest request) {
        return JspPaths.REGISTRATION_PAGE_PATH;
    }
}