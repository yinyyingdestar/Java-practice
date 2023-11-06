import java.util.Scanner;
public class Array4{
    public static void main (String[] args) {
    	Scanner myScanner = new Scanner(System.in);
    	System.out.print("请输入数组长度：");
    	
    	int l = myScanner.nextInt();
    	int arr[] = new int[l];
    	for(int b = 0; b < l; b++){
    		int c = b;
    		System.out.printf("请输入数组元素%d: ", c);
    		arr[b] = myScanner.nextInt();
    	}
    	System.out.print("请输入目标值 ：");
    	int target = myScanner.nextInt();


    	for(int a = 0; a <arr.length - 1; a++){                        //arr[0] + arr[1],arr[0] + arr[2],arr[0] + arr[3],arr[0] + arr[4],
    		for(int i = a; i <arr.length - 1; i++){					  //arr[1] + arr[2],...
    			if(arr[a] + arr[i+1] != target){
    				continue;
    			}else{
    				System.out.print("[");
    				for(int d = 0; d < 2;d++){
    					
    					if(d < 1){
    						System.out.print(a);
    						System.out.print(",");
    					}else{
    						System.out.print(i+1);
    					}
    				}	
    				System.out.print("]");	
    				
    				
    			}
    		}
    	}
    	
   	}
}