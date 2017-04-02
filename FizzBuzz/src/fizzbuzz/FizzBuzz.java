package fizzbuzz;
/**
 *
 * @author zWorldDz
 */
public class FizzBuzz {
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1;
        while(i <= 100)
        {
            if(i % 3 ==0 )
            {
                System.out.print("Fizz ");
            }
            else if(i % 5 ==0 )
            {
                System.out.print("Buzz ");
            }
            else if(i % 3 ==0  && i % 5 ==0  )
            {
                System.out.print("FizzBuzz ");
            }
            else
            {
                System.out.print(i+",");
            }
            i++;
        }
    }
}
