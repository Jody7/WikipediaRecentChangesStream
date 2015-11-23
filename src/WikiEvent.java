import java.util.EventObject;

public class WikiEvent extends EventObject {
    private Object _data;

    public WikiEvent( Object source, Object data ) {
        super(source);
        _data = data;
    }
    public Object wiki() {
        return _data;
    }

}