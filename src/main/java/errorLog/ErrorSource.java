package errorLog;

import errorLog.dataclasses.Error;

public interface ErrorSource {
    void addOnErrorListener(MyErrorListener listener);
    void removeErrorListener(MyErrorListener listener);

    void notifyErrorListeners(Error error);
}
