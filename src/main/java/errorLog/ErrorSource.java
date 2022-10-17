package errorLog;

import errorLog.dataclasses.Error;

public interface ErrorSource {
    void addOnErrorListener(MyErrorListener listener);
    void removeErrorListener(MyErrorListener listener);

    void notifyListeners(Error error);
}
