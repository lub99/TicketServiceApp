package notification.service.impl;

import notification.BuyTicketNotificationSource;
import notification.service.BuyTicketNotificationService;
import ticket.dataclass.GameTicket;
import ticket.dataclass.User;

public class MobileNotificationService implements BuyTicketNotificationService {
    private BuyTicketNotificationSource buyTicketNotificationSource;

    public MobileNotificationService(BuyTicketNotificationSource buyTicketNotificationSource) {
        this.buyTicketNotificationSource = buyTicketNotificationSource;

        buyTicketNotificationSource.addNotificationListener(this::notifyUser);
    }
    @Override
    public void notifyUser(User user, GameTicket ticket) {

    }
}
