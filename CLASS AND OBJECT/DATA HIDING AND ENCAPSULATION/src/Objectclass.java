public class Objectclass {
    int num;

    public Objectclass(int num) {
        this.num = num;
    }


    @Override
    public String toString() {
        return "Objectclass{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

//        @Override
//        protected void finalize () throws Throwable {
//            super.finalize();
//        }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args) {
        Objectclass ob = new Objectclass(43);
        System.out.println(ob.hashCode());

    }
}