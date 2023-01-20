package Interfaces.nestedInterfaces;

public class a {
    public interface nestedinterfaces{
        boolean isodd(int a);
}

 public class B implements a.nestedinterfaces{

    @Override
    public boolean isodd(int a) {
        return (a & 1) ==1;
    }
}
}
