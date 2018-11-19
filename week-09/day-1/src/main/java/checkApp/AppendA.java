package checkApp;

public class AppendA {
    String appendable;

    public AppendA(String appendable) {
        this.appendable = appendable+"a";
    }

    public String getAppendable() {
        return appendable;
    }

    public void setAppendable(String appendable) {
        this.appendable = appendable;
    }
}
