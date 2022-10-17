package errorLog;

import errorLog.dataclasses.Error;

/**
 * Listener je akcija koja se treba izvrsiti kad se dogodi trigger
 * */
public interface MyErrorListener {
    void onError(Error error);
}
