/******************************************************************************

           Association Employee Maintaince System...!

*******************************************************************************/


import java.util.*;

class Associate{
    String id,name,tech;
    int exp;
    Associate(String id,String name,String tech,int exp){
        this.id=id;
        this.name=name;
        this.tech=tech;
        this.exp=exp;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getTech(){
        return tech;
    }
    public int getExp(){
        return exp;
    }
}

class Main{
    public static void main(String[] arg){
    Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    Associate[] emp=new Associate[n];
    System.out.println("Enter "+n+" Employee Details...!");
    String id,name,tech;
    int exp;
    for(int i=0;i<n;i++){
        System.out.println("Enter Employee "+(i+1)+" Details");
        System.out.print("Enter ID: ");
        id=x.next();
        System.out.print("Enter Name: ");
        name=x.next();
        System.out.print("Enter Tech: ");
        tech=x.next();
        System.out.print("Enter Experience: ");
        exp=x.nextInt();
        emp[i]=new Associate(id,name,tech,exp);
    }
    String th=x.next();
    List<String> res=new ArrayList<>();
    for(int i=0;i<n;i++){
        if(emp[i].getTech().equals(th) && ((emp[i].getExp()%5)==0))
        res.add(emp[i].getId());
    }
    System.out.println();
    for(String i:res)
    System.out.println(i);
    }
}
