package errorLog.errorService;

import errorLog.dataclasses.Error;

public interface SaveErrorService {
    void saveError(Error error);
}
