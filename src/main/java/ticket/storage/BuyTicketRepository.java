package ticket.storage;

import errorLog.dataclasses.Error;
import errorLog.ErrorSource;
import errorLog.MyErrorListener;
import notification.BuyTicketEventListener;
import notification.BuyTicketNotificationSource;
import ticket.dataclass.GameTicket;
import ticket.dataclass.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BuyTicketRepository implements ErrorSource, BuyTicketNotificationSource {
    List<MyErrorListener> errorListeners = new ArrayList<>();
    List<BuyTicketEventListener> buyTicketEventListeners = new ArrayList<>();


    public void buyTicket(User user, GameTicket ticket) {
        int rand = new Random().nextInt(10) + 1;
        if (rand <= 5) {
            System.out.println("Successful buy of ticket");
            startNotification(user, ticket);
        } else {
            System.out.println("Error when buying game ticket");
            notifyListeners(new Error("Error when buying game ticket", 1));
        }

    }

    @Override
    public void addNotificationListener(BuyTicketEventListener buyTicketEventListener) {
        buyTicketEventListeners.add(buyTicketEventListener);
    }

    @Override
    public void removeNotificationListener(BuyTicketEventListener buyTicketEventListener) {

    }

    @Override
    public void startNotification(User user, GameTicket gameTicket) {
        buyTicketEventListeners.forEach(buyTicketEventListener -> buyTicketEventListener.onBuyTicketEvent(user, gameTicket));
    }

    @Override
    public void addOnErrorListener(MyErrorListener listener) {
        errorListeners.add(listener);
    }

    @Override
    public void removeErrorListener(MyErrorListener listener) {

    }

    @Override
    public void notifyListeners(Error error) {
        errorListeners.forEach(myErrorListener -> myErrorListener.onError(error));
    }
}
