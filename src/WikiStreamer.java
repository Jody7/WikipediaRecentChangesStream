import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class WikiStreamer {

    private List _listeners = new ArrayList();


    public void addWikiListener(Object a) {
        _listeners.add(a);

        //TODO Begin HTTP loop




    }

    public void removeWikiListener(Object a) {
        _listeners.remove(a);
    }

    private synchronized void _fireEvent(Object data) {
        WikiEvent mood = new WikiEvent( this, data);
        Iterator listeners = _listeners.iterator();
        while( listeners.hasNext() ) {
            ( (WikiStreamListener) listeners.next() ).recentChangePerformed(data);
        }
    }
}