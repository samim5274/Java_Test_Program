
package testmain;

public class Helloworld {
    
    int addNum()
    {
        return 3+3;
    }
    
    public float addNum(float x, float y)
    {
        return x+y;
    }
    
    public static void main(String[] args) {
        
        Helloworld hw1 = new Helloworld();
        System.out.println(hw1.addNum());
        System.out.println(hw1.addNum(1.2f,3.2f));
    }
}
