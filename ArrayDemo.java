class ArrayDemo {  
public static void main(String args[]){  

int evenNumber[ ] = {2,4,6,8,10,12 };

System.out.println(evenNumber[3]);

System.out.println( "  size of the even numbers " + evenNumber.length );

int oddNumber[ ]=new int[5];

System.out.println( "  size of the even numbers " + oddNumber.length ); 
System.out.println( oddNumber[3]);
oddNumber[0]=1;
oddNumber[1]=3;  
oddNumber[2]=5;  
oddNumber[3]=7;  
oddNumber[4]=9; 
System.out.println("print odd number in 3rd position "+  oddNumber[3]); 
System.out.println( "  print odd number :------");

for(int j=0; j<oddNumber.length; j++) {
System.out.println(oddNumber[j]);  
}
System.out.println( "  print even number :------");
for(int i=0;i<evenNumber.length;i++) {
System.out.println(evenNumber[i]);  
}
}}  