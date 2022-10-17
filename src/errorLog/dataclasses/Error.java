package errorLog.dataclasses;

public class Error {
    private String msg;
    private int errorCode;

    public Error(String msg, int errorCode) {
        this.msg = msg;
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "Error{" +
                "msg='" + msg + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
