package pkg1;

import java.util.Random;


     
public class Main {
    
    
             int n,m;
         public static int ux=0,uy=0;
    public static int dx[] = {0,0,-1,1,-1,1,-1,1};
    public static int dy[] = {1,-1,0,0,-1,-1,1,1};
    public static int[][] num = new int[5][5];  //توليد المصفوفة الحرة الكاملة
    public static void main(String[] args) {

        Random rand = new Random(); // RANDOM VALUE
        
        
        int i = 0;
        int j = 0;
        
        


           for (i = 0; i < 5; i++) 
            for (j = 0; j < 5; j++)
            {
                num[i][j] =0;
            }

        
        
        
        for (int z = 0; z < 5; z++) // توزيع الألغام على المصفوفة
        {
            i=rand.nextInt(5);
            j=rand.nextInt(5);

            num[i][j] = -1;

         }
        
        for (i = 0; i < 5; i++) 
            for (j = 0; j < 5; j++)
            {
                if(num[i][j]==-1)
                {
                    check(i,j);
                }
            }
        
        
        
//        for (i = 0; i < 5; i++) 
//            for (j = 0; j < 5; j++)
//                if(num[i][j]==-1)
//                {
//if((num[i][j-1]!=-1)&&(j-1>0&&j-1<5))
// num[i][j-1]++;
// if((num[i][j+1]!=-1)&&(j+1>0&&j+1<5))
//    num[i][j+1]++;
//    if((num[i-1][j]!=-1)&&(i-1>0&&i-1<5))
//        num[i-1][j]++;
//        if((num[i+1][j]!=-1)&&(i+1>0&&i+1<5))
//            num[i+1][j]++;
//            if((num[i-1][j-1]!=-1)&&(j-1>0&&j-1<5)&&((i-1>0)&&(i-1<5)))
//                num[i-1][j-1]++;
//                if((num[i-1][j+1]!=-1)&&(j+1>0&&j+1<5)&&((i-1>0)&&(i-1<5)))
//                    num[i-1][j+1]++;
//                  if((num[i+1][j+1]!=-1)&&(j+1>0&&j+1<5)&&((i+1>0)&&(i+1<5)))
//                      num[i+1][j+1]++;
//                  if((num[i+1][j-1]!=-1)&&(j-1>0&&j-1<5)&&((i+1>0)&&(i+1<5)))
//                         num[i+1][j-1]++;
//
//    
//                }
              for (i = 0; i < 5; i++)  //طباعة المصفوفة
        {
            System.out.println();
            for (j = 0; j < 5; j++) {
                System.out.print(num[i][j]);
            }
        }
        
                
    }            
                
     public static  boolean valid (int x,int y)   {
        return x >= 0 && x < 5 && y >= 0 && y < 5;
    }
       
    public static void check(int vx,int vy)
    {
        
        for (int i=0;i<8;i++)
            {
             ux = vx + dx[i] ;
             uy = vy + dy[i];
            if ( valid (ux,uy)&& num[ux][uy] != -1)
                num[ux][uy]++;
                //check(ux,uy);
            }
    
    }
      
              


    }


