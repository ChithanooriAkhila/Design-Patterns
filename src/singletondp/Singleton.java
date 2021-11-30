package singletondp;

public class Singleton {
    private static Singleton onlyOneInstance;
    public String string;
    private Singleton(){
        string="I am singleton Design Pattern";
    }
    public static Singleton Singleton(){
        if(onlyOneInstance==null){
            onlyOneInstance=new Singleton();
        }
        return onlyOneInstance;
    }
}
class SingletonEx{
    public static void main(String[] args) {
        Singleton obj1=Singleton.Singleton();
        Singleton obj2=Singleton.Singleton();
        Singleton obj3=Singleton.Singleton();
        obj1.string=obj1.string.toUpperCase();
        System.out.println(obj1.string);
        System.out.println(obj2.string);
        System.out.println(obj3.string);
        obj3.string=obj3.string.toLowerCase();
        System.out.println(obj1.string);
        System.out.println(obj2.string);
        System.out.println(obj3.string);
    }
}
