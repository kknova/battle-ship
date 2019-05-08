//KESHAV TYAGI
//STU ID : 300278989
import java.util.Scanner;
public class battleship
{public static void main(String[] args)
  {int i=0,j=0;int on=0,t=0,f=0;
    Scanner input= new Scanner(System.in);
    char[][] original={{' ','1','2','3','4','5','6'},
                        {'A','2',' ',' ',' ',' ',' '},
                        {'B','2',' ',' ',' ','3',' '},
                        {'C',' ',' ',' ',' ','3',' '},
                        {'D',' ',' ',' ',' ','3',' '},
                        {'E',' ',' ',' ',' ',' ',' '},
                        {'F',' ',' ','4','4','4','4'}};
  char[][] ans={{' ','1','2','3','4','5','6'},
                        {'A','_','_','_','_','_','_'},
                        {'B','_','_','_','_','_','_'},
                        {'C','_','_','_','_','_','_'},
                        {'D','_','_','_','_','_','_'},
                        {'E','_','_','_','_','_','_'},
                        {'F','_','_','_','_','_','_'}};
    do{ 
  System.out.println("enter your guess in the form A1 :");
  String o=input.next();
  char inp1=o.charAt(0);
  int inp2=(o.charAt(1)-48);
  switch(inp1)
  {   case 'a':
      case 'A':i=1;
      break;
      case 'b':
      case 'B':i=2;
      break;
      case 'c':
      case 'C':i=3;
      break;
      case 'd':
      case 'D':i=4;
      break;
      case 'e':
      case 'E':i=5;
      break;
      case 'f':
      case 'F':i=6;
      break;
      default:System.out.println("no such choice");
     break;
    }
     if(original[i][inp2]!=' ')
    {  if(original[i][inp2]=='2')
       {   on++;
           ans[i][inp2]='*';
        }
       else if(original[i][inp2]=='3')
        {  t++;
           ans[i][inp2]='*';
        }
    else if(original[i][inp2]=='4')
        {f++;
         ans[i][inp2]='*';
        }
    
    
       
         if(on==2)
       System.out.println("Its a hit \n you sink a patrol boat");
       if(t==3)
       System.out.println("Its a hit \nyou sink a destroyer boat");
       if(f==4)
       System.out.println("Its a hit \nyou sink a battle ship");
    }
   
    
  else
        {ans[i][inp2]='o';
            System.out.println("thats a miss");
        j=0;
        }
  System.out.println("     ENEMEY");
        for(int k=0;k<ans.length;k++)
  {for(int c=0;c<ans[k].length;c++)
      System.out.print(ans[k][c] +" ");
      System.out.println();
    }
    if(on==2&&t==3)
    {if(f==4)
        {System.out.println("\n\n         YOU WIN");
           j++;
        }
    }
                    }while(j==0);
                } 
            }                   