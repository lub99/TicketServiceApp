package notification.service;

import ticket.dataclass.GameTicket;
import ticket.dataclass.User;
import ticket.storage.BuyTicketRepository;

public class EmailNotificationService implements BuyTicketNotificationService {
    /**
     * Here goes email sending configuration fields
     * */

    private BuyTicketRepository buyTicketRepository;

    public EmailNotificationService(BuyTicketRepository buyTicketRepository) {
        this.buyTicketRepository = buyTicketRepository;

        buyTicketRepository.addNotificationListener(this::notifyUser);
    }

    @Override
    public void notifyUser(User user, GameTicket ticket) {
        System.out.println("Successful sending of email notification to the user:\n\t" + user + " \nbuying ticket\n\t" + ticket);
    }
}
