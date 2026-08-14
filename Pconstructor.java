class Demo1
{
    String name;
    int age;
    public Demo1(String n,int a)
    {
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}
public class Pconstructor
{
    public static void main(String[] args)
    {
        Demo1 ob = new Demo1("yogitha",18);
        ob.display();
    }
}