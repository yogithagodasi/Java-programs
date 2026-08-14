class Parent
{
void display()
{
    System.out.println("parent class of single inheritance");
}
}
class Child extends Parent
{
    void display1()
    {
        System.out.println("CHILD ClASS OF SINGLE INHERITANCE");
    }
}
public class Single
{
    public static void main(String args[])
    {
Child c = new Child();
c.display1();
c.display();
    }
}