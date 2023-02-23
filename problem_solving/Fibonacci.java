public class Fibonacci {

    /* 2^n - 1 => O(2^n) */
    private int fiboRecursion(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        return fiboRecursion(number - 1) + fiboRecursion(number - 2);
    }

    /* O(n) */
    private long[] fiboMemoization = new long[100];

    private long fiboDyn

          return number;
  
    } else if (fiboMemoization[number
      return fiboMem
    
    } else {
   

      }
  }

  /* n -1 => O(n) */
    ate int fiboIterat n(int number
      number == 0 ||

    }
      lowVal = 0;

    int resu
       highVal --> lowVal, Current result --> highVal */
    f
   

          highVal = 
      }
    return result;
      
    
    
    
    

    
    
      
      
      
    
    
  