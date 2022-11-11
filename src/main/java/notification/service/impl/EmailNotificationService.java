package notification.service.impl;

import notification.BuyTicketNotificationSource;
import notification.service.BuyTicketNotificationService;
import ticket.dataclass.GameTicket;
import ticket.dataclass.User;
import ticket.storage.BuyTicketRepository;

public class EmailNotificationService implements BuyTicketNotificationService {
    /**
     * Here goes email sending configuration fields
     * */
    private BuyTicketNotificationSource buyTicketNotificationSource;

    public EmailNotificationService(BuyTicketNotificationSource buyTicketNotificationSource) {
        this.buyTicketNotificationSource = buyTicketNotificationSource;

        buyTicketNotificationSource.addNotificationListener(this::notifyUser);
    }


    @Override
    public void notifyUser(User user, GameTicket ticket) {
        System.out.println("Successful sending of email notification to the user:\n\t" + user + " \nbuying ticket\n\t" + ticket);
    }
}
