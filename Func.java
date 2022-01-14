import java.util.ArrayList;

public class Func {
    private String Name;//函数名
    private String type;//函数返回类型
    private int num;//函数寄存器编号

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private ArrayList<param> plist;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<param> getPlist() {
        return plist;
    }

    public void setPlist(ArrayList<param> plist) {
        this.plist = plist;
    }
}
class param{
    private String type;//int array*
    private String length;
    private Register register;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
