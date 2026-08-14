class Student
{
    void activity()
    {
        System.out.println("STUDENT ACTIVITES");
    }
}
class Yogitha extends Student
{
void read()
{
System.out.println("reading books");
}
}
class Pallavi extends Yogitha
{
    void play()
    {
        System.out.println("playing games");
    }
}
public class Multilevel
{
    public static void main(String args[])
    {
        Pallavi ob = new Pallavi();
        ob.activity();
        ob.read();
        ob.play();
    }
}