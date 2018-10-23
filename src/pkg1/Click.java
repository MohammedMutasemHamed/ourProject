 
 
package pkg1;



public class Click {
    
    
    
    public void testing(Initialize e,int i,int j)  //لاختبار الالعنصر كاملا
    {
        if(e.valid(i, j) && !e.getelement(i,j).isClicked())  //موجودة وليست مفتوحة
        {
            if(!e.getelement(i, j).isFlag()) // لا يوجد علامة على العنصر
            {
            
             if(e.getelement(i, j).getStatus()==-1)    // لغم
        return ;
             
             else if (e.getelement(i, j).getStatus()==0)  // فراغ
             {
                 check(e, i, j);
       e.getelement(i,j).setClicked(true);

             }
             else                                   // رقم
         e.getelement(i,j).setClicked(true);
            }
        }
   
    }
    public void check(Initialize e ,int vx,int vy) //اذا كان العنصر فاضي يقوم بتجهيز العناصر الثمانية المجاورة
    {
        int ux=0,uy=0;
        int dx[] = {0,0,-1,1,-1,1,-1,1};
        int dy[] = {1,-1,0,0,-1,-1,1,1};
    int x=0;
    
          for (int i=0;i<8;i++)
            {
             ux = vx + dx[i] ;
             uy = vy + dy[i];
            if ( e.valid(ux,uy)&& e.getelement(ux, uy).getStatus()!=-1)   // موجود وليس لغم
            {
               if(e.getelement(ux, uy).getStatus()!=0)                     // رقم
               {
                   e.getelement(ux, uy).setClicked(true);
               }
              else if(e.getelement(ux, uy).getStatus()==0)               // فراغ
               {
                   e.getelement(ux, uy).setClicked(true);
                   check(e, ux, uy);
               }
            }
            }  
    }
   
  public void FLAG(Initialize e ,int i,int j)
  {
      
       if(e.valid(i,j) && !e.getelement(i,j).isClicked())
       {
           e.getelement(i, j).setFlag(true);
       }
  }
    
    
    
    
    
}
