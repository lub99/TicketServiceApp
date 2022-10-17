package notification.service;

import ticket.dataclass.GameTicket;
import ticket.dataclass.User;

public interface BuyTicketNotificationService {
    void notifyUser(User user, GameTicket ticket);
}
