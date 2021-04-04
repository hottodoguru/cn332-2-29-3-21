import java.util.Vector;
import java.util.Enumeration;

public class Customer
{
    static private Vector myObs;
    static{
        myObs = new Vector();
    }
    public static void attach(MyObserver o){
        myObs.addElement(o);
    }
    public static void datach(MyObserver o){
        myObs.remove(o);
    }
    public String getState(){
        return null;
    }
    public void notifyObs(){
        for(Enumeration e = myObs.elements();
            e.hasMoreElement();){
                ((MyObserver)e).update(this);
            }
    }
}
