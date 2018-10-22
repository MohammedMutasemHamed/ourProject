
package pkg1;


public class element {
    
    private int status;
    boolean clicked;
    boolean flag;
    
    public element()
    {
        this.status=0;
        this.clicked=false;
        this.flag=false;
    }

    public int getStatus() {
        return status;
    }

    public boolean isClicked() {
        return clicked;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
}
