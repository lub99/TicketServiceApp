package notification;

import ticket.dataclass.GameTicket;
import ticket.dataclass.User;

public interface BuyTicketEventListener {
    void onBuyTicketEvent(User user, GameTicket gameTicket);
}
