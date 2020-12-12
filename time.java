import java.util.* ;

class time
{
     static int m;
    public void convert(int n)
    {
       
        int y=n/525600;
        int d=n/1440;
        int r=d%525600;
        System.out.println(n + " minutes =" + y + " years  "  +  r + " days ");
    }

      public  static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no.of minutes ");
        m= sc.nextInt();
        time ob =new time();
        ob.convert(m);

    }

}