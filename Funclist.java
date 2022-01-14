import java.util.ArrayList;

public class Funclist {
    private static Funclist instance;
    private ArrayList<Func> list;
    private Funclist(){
        this.list=new ArrayList<>();
    }
    public static Funclist getInstance(){
        if(instance==null){
            instance=new Funclist();
        }
        return instance;
    }
    public void add(Func var){
        this.list.add(var);
    }
    public Func getFunc(String a){
        for(int i=0;i<this.list.size();i++){
            if(a.equals(this.list.get(i).getName())){
                return this.list.get(i);
            }
        }
        return null;
    }
}
