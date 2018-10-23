

package pkg1;

import java.util.Random;

/**
 *
 * @author MUATASEM
 */
public class Initialize  {
    
    element E[][]=new element[5][5];
    
    
   public Initialize()
    {
        
        int i,j;
        for (i = 0; i < 5; i++) 
         for (j = 0; j < 5; j++)
          E[i][j]=new element();
    }
   
    public void Creat()
    {
       int i,j;
        for (i = 0; i < 5; i++) 
         for (j = 0; j < 5; j++)
          E[i][j].setStatus(0);
        
    }
  
    
    public void CreatMines()
    {
        
        Random rand=new Random();
        int i,j;
        for (int z = 0; z < 5; z++) // توزيع الألغام على المصفوفة
        {
            i=rand.nextInt(5);
            j=rand.nextInt(5);
            E[i][j].setStatus(-1);
         }
    }
    
    public void check(int vx,int vy)
    {
        int ux=0,uy=0;
        int dx[] = {0,0,-1,1,-1,1,-1,1};
        int dy[] = {1,-1,0,0,-1,-1,1,1};
    int x=0;
    
          for (int i=0;i<8;i++)
            {
             ux = vx + dx[i] ;
             uy = vy + dy[i];
            if ( valid (ux,uy)&& E[ux][uy].getStatus()!=-1)
            {
                x=E[ux][uy].getStatus();
                x+=1;
                E[ux][uy].setStatus(x);
            }
            }  
    }
    
    public boolean valid (int x,int y)  
    {
        return x >= 0 && x < 5 && y >= 0 && y < 5;
    }
    
    public void puzzle()
    {
        int i,j;
        for (i = 0; i < 5; i++) 
            for (j = 0; j < 5; j++)
            {
                if(E[i][j].getStatus()==-1)
                {
                    check(i,j);
                }
            }
    }
    
    
    public void print()
    {
        
        int i,j;
        
              for (i = 0; i < 5; i++)  //طباعة المصفوفة
        {
            System.out.println();
            for (j = 0; j < 5; j++)
                    {
                   if(E[i][j].getStatus()==-1)
             System.out.print("B\t");
                   else if(E[i][j].getStatus()==0)
             System.out.print("O\t");
                 else
                      System.out.print(E[i][j].getStatus()+"\t");

                    }
        }
    }
    
   
    public element getelement(int i,int j)
    {
        return E[i][j];
    }
    
    
    
    
    
    
    
}
