package errorLog.errorService;

import errorLog.dataclasses.Error;
import errorLog.ErrorSource;

public class ConsolePrintErrorService implements SaveErrorService{
    private ErrorSource errorSource;

    public ConsolePrintErrorService(ErrorSource errorSource) {
        this.errorSource = errorSource;

        errorSource.addOnErrorListener(this::saveError);
    }

    @Override
    public void saveError(Error error) {
        System.out.println("Successful log of error:\n\t" + error);
    }
}
