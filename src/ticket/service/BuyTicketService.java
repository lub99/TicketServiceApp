package ticket.service;

import ticket.dataclass.GameTicket;
import ticket.dataclass.User;
import ticket.storage.BuyTicketRepository;

public class BuyTicketService {
    private BuyTicketRepository buyTicketRepository;

    public BuyTicketService(BuyTicketRepository buyTicketRepository) {
        this.buyTicketRepository = buyTicketRepository;
    }

    public void buyTicket(User user, GameTicket gameTicket){
        buyTicketRepository.buyTicket(user, gameTicket);
    }
}
