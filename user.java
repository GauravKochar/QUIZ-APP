/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

/**
 *
 * @author Gaurav
 */
public class user {
    String qus;
    String a;
    String b;
    String c;
    String d;
    String ans;
    String qid;
    
   public  user(String _qus,String _a,String _b,String _c,String _d,String anss,String qqid)
    {
        this.qus=_qus;
        this.a=_a;
        this.b=_b;
        this.c=_c;
        this.d=_d;
        this.ans=anss;
        this.qid=qqid;
        
        
        
    }
   public String getqus()
   {
       return qus;
   }
    public String geta()
   {
       return a;
   }
     public String getb()
   {
       return this.b;
   }
      public String getc()
   {
       return this.c;
   }
       public String getd()
   {
       return this.d;
   }
        public String getans()
   {
       return this.ans;
   }
         public String getid()
   {
       return this.qid;
   }
        
    
}
