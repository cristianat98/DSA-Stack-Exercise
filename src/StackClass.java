import java.util.List;
import java.util.Vector;

public abstract class StackClass<T> implements Stack<T> {
    private List stack ;
    private int length;

    public StackClass(int length){
        stack = new Vector<T>();
        for(int i = 0;i < length; i++)
            stack.add(null);
        this.length= length;
    }

    @Override
    public int push(T element){
        if (stack.size()<=length)
        {
            stack.add(element);
            return 0;
        }
        else
        {
            //Do nothing
            return -1;
        }
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public int size(){
        return stack.size();
    }
}