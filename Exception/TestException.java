public class TestException {
    public static void main(String [] args)
    {
        String vehicles[] = {"Car","Bus","Motorcycles","Cycles","Taxi"};

        try
        {
            for(int i=0;i <=5 ; i++)
            {
                System.out.println(vehicles[i]);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
