package notification;

import ticket.dataclass.GameTicket;
import ticket.dataclass.User;

public interface BuyTicketNotificationSource {
    void addNotificationListener(BuyTicketEventListener buyTicketEventListener);
    void removeNotificationListener(BuyTicketEventListener buyTicketEventListener);
    void startNotification(User user, GameTicket gameTicket);
}
