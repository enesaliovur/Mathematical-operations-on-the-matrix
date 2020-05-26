
import java.io.BufferedReader;
import java.io.InputStreamReader;
  
import java.util.*;
public class Matris {


public static void main(String[] args) {
   
int matris1[][]=new int[3][3];
int matris2[][]=new int[3][3];
int matris3[][]=new int[3][3];
int i,j,k,l,c,n;
Scanner gir = new Scanner(System.in);
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

System.out.println(" **** MATRİS HESAP MAKİNESİ ***\n");
System.out.println("1.MATRİSİ GİRİNİZ !");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
System.out.print((i+1)+". satir "+(j+1)+". sutun elemani : ");
matris1[i][j]=gir.nextInt();
}
System.out.println();
}

System.out.println("2.MATRİSİ GİRİNİZ !");

for(i=0;i<3;i++){
    for(j=0;j<3;j++){
        System.out.print((i+1)+". satir "+(j+1)+". sutun elemani : ");
        matris2[i][j]=gir.nextInt();
    }
 System.out.println();       
}

       
        for(i=0;i<3;i++){
for(j=0;j<3;j++){
System.out.print(matris1[i][j]+"\t");

}
    System.out.println();    
        }
System.out.println("-----------------------");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
System.out.print(matris2[i][j]+"\t");

}
System.out.println();
}
        
       
   
int islemsec;
 System.out.println("Yapmak istediğiniz işlemi seçiniz");
 System.out.println("Girdiğiniz matrisler üzerinde çarpma islemi yapmak icin 1'e basın");
 System.out.println("Girdiğiniz matrisler üzerinde toplama islemi yapmak icin 2'ye basın");
 System.out.println("Girdiğiniz matrisler üzerinde çıkarma islemi yapmak icin 3'e basın");
  System.out.println("Sabit bir sayıyla çarpmak için 4'de basın");
  System.out.println("Gireceğiniz matrisin tersini almak için 5'e basınız");
  System.out.println("Gireceğiniz matrisin determinantını almak için 6'ya basınız");
  System.out.println("Girdiğiniz matrisin 1'in involitif olup olmadığını kontrol etmek için 7'ye basınız");
 for(;;){
 islemsec = gir.nextInt();

switch(islemsec){
    case 1:
        
        for(l=0;l<3;l++){
           for(c=0;c<3;c++)  {
              matris3[l][c]=0; 
              for(k=0;k<3;k++){
                   matris3[l][c] += matris1[c][k] * matris2[k][l];
              }
               
              System.out.printf("%d \t",matris3[l][c]);
              
           } 
           
           
           System.out.printf("\n");
           
        }
        System.out.println("-----------------------");
       break;
        

case 2:
for(l=0;l<3;l++){
           for(c=0;c<3;c++)  {
              matris3[l][c]=0; 
             
                   matris3[l][c] = matris1[l][c] + matris2[l][c];
              
               
              System.out.printf("%d \t",matris3[l][c]);
              
           } 
        
           System.out.printf("\n");
          
             
 
}
 
break;


case 3:
for(l=0;l<3;l++){
           for(c=0;c<3;c++)  {
              matris3[l][c]=0; 
              
                   matris3[l][c] = matris1[l][c] - matris2[l][c];
              
              System.out.printf("%d \t",matris3[l][c]);
              
           } 
          
           System.out.printf("\n");
        }
break;


case 4:
    System.out.println("Matrisi hangi sabit sayıyla çarpmak istediğinizi giriniz");
       n=gir.nextInt();
    for(l=0;l<3;l++){
           for(c=0;c<3;c++)  {
             

              
               matris3[l][c] = n*matris1[l][c];
                           
              
             System.out.printf("%d ",matris3[l][c]);
              
           } 
          
           System.out.printf("\n");
        }
break;

case 5:
   
            
        Scanner giriş = new Scanner(System.in);
        System.out.println("3e 3lük matris için değerleri giriniz.");
        for(int satır=0; satır<3; satır++)
        {
            for(int sütun=0; sütun<3; sütun++)
            {
                System.out.print("A"+(satır+1)+(sütun+1)+" = ");
                matris3[satır][sütun] = giriş.nextInt();
            }
        }
 
        System.out.println("3e 3lük matris imiz.");
        for(int satır=0; satır<3; satır++)
        {
            for(int sütun=0; sütun<3; sütun++)
            {
                System.out.printf("%3d",matris3[satır][sütun]);
            }
            System.out.print("\n");
        }
         
  
      

   
     System.out.println("Matris'in tersi hesaplanıyor.");
        int Matris[][] = {{matris3[1][1]*matris3[2][2]-matris3[1][2]*matris3[2][1],matris3[0][2]*matris3[2][1]-matris3[0][1]*matris3[2][2],matris3[0][1]*matris3[1][2]-matris3[0][2]*matris3[1][1]},
                                {matris3[1][2]*matris3[2][0]-matris3[1][0]*matris3[2][2],matris3[0][0]*matris3[2][2]-matris3[0][2]*matris3[2][0],matris3[0][2]*matris3[1][0]-matris3[0][0]*matris3[1][2]},
                                {matris3[1][0]*matris3[2][1]-matris3[1][1]*matris3[2][0],matris3[0][2]*matris3[2][0]-matris3[0][0]*matris3[2][1],matris3[0][0]*matris3[1][1]-matris3[0][1]*matris3[1][0]}};
 
        System.out.println("3e 3lük matrix in inversi.");
        for(int satır=0; satır<3; satır++)
        {
            for(int sütun=0; sütun<3; sütun++)
            {
                System.out.printf("%3d",Matris[satır][sütun]);
            }
            System.out.print("\n");
        }
        break;
        
case 6:
     int order=3;
        //int[][] matris=new int[3][3];
        System.out.println(" 3x3'lük bir matris giriniz");
       
        for(i=0;i<matris3.length;i++){
            for(j=0;j<matris3[i].length;j++){
                try{
                    matris3[i][j]=Integer.parseInt(br.readLine());
                }
                catch(Exception e){
                    System.out.println("Bir hata oluştu. Lütfen tekrar deneyiniz.");
                    return;
                }
            }
        }
        int determinant,x,y,z;
        x=(matris3[0][0] * (matris3[1][1] * matris3[2][2]
                       - matris3[1][2] * matris3[2][1]));
        y=(matris3[0][1] * (matris3[1][0] * matris3[2][2]
                       - matris3[1][2] * matris3[2][0]));
        z=(matris3[0][2] * (matris3[1][0] * matris3[2][1]
                       - matris3[1][1] * matris3[2][0]));
        determinant= x - y + z;
        System.out.println("Girdiğiniz matrisin determinantı: "+ determinant);
 break;

     case 7:
        
         
  
                 int matrisI[][]={{1,0,0},{0,1,0},{0,0,1}};
                String temp;
                
                temp="";
                 for(l=0;l<3;l++){
                for(c=0;c<3;c++){
                matris3[l][c]=0;
                for(k=0;k<3;k++){
                matris3[l][c]+=matris1[l][k]*matris1[k][c];
                    }
                    }
                }
                   for(int p=0;p<3;p++){
                   for(int g=0;g<3;g++){
                if(matris3 [p][g]==matrisI[p][g]){
                       
                 temp= "involitifdir";
                    }
                else
                 temp= "involitif değildir";
                    }
                    }
                   
                 System.out.println("matris " +temp);
                 
                break;       
        }
}
}
}


 

        
           
      
       
   
    



   