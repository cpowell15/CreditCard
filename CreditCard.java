public class CreditCard
{
  public boolean verify(String num)
  {
    int evens = 0; //What the total of the evens will be added to
    int odds = 0;  //What the total of the odds will be added to
    for (int i = num.length() - 1; i >= 0; i -=2) //runs this loop to add up the odd digits
    {
      int h = Integer.parseInt(num.substring(i, i+1)); 
      odds += h;
    }
    
    for (int i = num.length() - 2; i >= 0; i -=2) //runs this loop to add up the even digits
    {
      int w = Integer.parseInt(num.substring(i, i+1));
      if (w >= 5)//adds the two digits together if it doubles into a two-digit number
      {
        evens += (2*w - 9); //equivalent of adding the digits of the number together
      }
      else
      {
        evens += (2*w);
      }
    }
    int total = odds + evens;
    if (total % 10 == 0 //if the total is divisible by 10, and length is one of those values, returns true
          && (num.length() == 12
                || num.length() == 13
                || num.length() == 14
                || num.length() == 16))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public int findType(String num)
  {
    if (num.substring(0,2).equals(51)
          ||num.substring(0,2).equals(52)
          ||num.substring(0,2).equals(53)
          ||num.substring(0,2).equals(54)
          ||num.substring(0,2).equals(55))
    {
      return 1;
    }
    
    if (num.substring(0,1).equals(4))
    {
      return 2;
    }
    
    if (num.substring(0,2).equals(34)
          ||num.substring(0,2).equals(37))
    {
      return 3;
    }
    
    if (num.substring(0,4).equals(6011))
    {
      return 4;
    }
    
    if (num.substring(0,3).equals(300)
          ||num.substring(0,3).equals(301)
          ||num.substring(0,3).equals(302)
          ||num.substring(0,3).equals(303)
          ||num.substring(0,3).equals(304)
          ||num.substring(0,3).equals(305))
    {
      return 5;
    }
    
    else if (num.substring(0,2).equals(36)
               ||num.substring(0,2).equals(38))
    {
      return 5;
   }
    return 0;
  }
}