package commands.user;

import commands.AbstractCommand;
import commands.Command;
import constants.JspPaths;
import dao.ClientMySQLDAO;
import dao.CreditCardMySQLDAO;
import dao.factory.MySQLDAOFactory;
import entities.Client;
import entities.CreditCard;
import entities.Person;
import services.CreditCardService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

public class ShowClients extends AbstractCommand implements Command {
    public String execute(HttpServletRequest request){
        HttpSession session = request.getSession();
        Person person = (Person) session.getAttribute("person");
        session.setAttribute("creditCards", CreditCardService.showYourCreditCards(person));
        return JspPaths.CREDIT_CARD_TABLE;
    }

}
