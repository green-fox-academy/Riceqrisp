package checkApp;

public class doUntil {
    String action;
    Integer until;
    Integer result;

    public doUntil(String action,Integer until) {
        this.until = until;
        this.action = action;
        this.result = 0;
        if (action.equals("sum")){
            for (int i = 0; i < until ; i++) {
                 result = until + result;
            }
        }
    }

    public String getAction() {
        return action;
    }

    public Integer getResult() {
        return result;
    }

    public Integer getUntil() {
        return until;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }
}
