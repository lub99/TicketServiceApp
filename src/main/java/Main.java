import errorLog.errorService.ConsolePrintErrorService;
import notification.service.impl.EmailNotificationService;
import ticket.dataclass.GameTicket;
import ticket.dataclass.StadiumPosition;
import ticket.dataclass.User;
import ticket.service.BuyTicketService;
import ticket.storage.BuyTicketRepository;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // buying ticket
        User user = new User("Matej", "Luburic", "Ratarska ulica 99", new Date(), "matej.l@gmail.com");
        GameTicket gameTicket = new GameTicket(user, new StadiumPosition("Canstatter Curve", "40C", 12, 39), 20);

        BuyTicketRepository buyTicketRepository = new BuyTicketRepository();
        EmailNotificationService emailNotificationService = new EmailNotificationService(buyTicketRepository);
        ConsolePrintErrorService databaseSaveErrorService = new ConsolePrintErrorService(buyTicketRepository);
        new BuyTicketService(buyTicketRepository).buyTicket(user, gameTicket);
    }
}