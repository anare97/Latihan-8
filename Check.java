package Latihan;
public class Check implements I1, D1{
    public boolean status;
    
    public Check(double a){
        status = a % 1 == 0;
        checkValueType();
    }
    public void checkValueType(){
        if(status){
            I1();
        }
        else{
            D1();
        }
    }
    public void I1(){
        System.out.println("Value type is Integer");
    }
    public void D1(){
        System.out.println("Value type is Double");
    }
}
