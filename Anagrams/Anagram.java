

    static boolean isAnagram(String c, String d) {
        // Complete the function
        
  
  String a=c.toLowerCase();
  String b=d.toLowerCase();
  int count=0;
  int count2=0;

  if(a.length()!=b.length())
  {
      return false;
  }

  for(int i=0; i<a.length(); i++)
  {
      char ch=a.charAt(i);
      for(int j=0; j<a.length(); j++)
      {
          if(a.charAt(j)==ch)
          count++;
          if(b.charAt(j)==ch)
          count2++;
      }
      if(count!=count2)
      {
      return false; 
      }
  }
  return true;
      
    }  
    
