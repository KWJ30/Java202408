package ex05;

public class MathArrayUtils {

	//static int sum = 0;
	
	//static double avg = 0;
	
	//static int min = 100;
	
	//static int max = 0;
	
   // private MathArrayUtils() {}	
	
	static int sum(int[] values) {int sum=0; for(int i=0; i<values.length; i++) 
	{ sum+= values[i]; } return sum; }
	
	static double average(int[] values) {double avg=0; for(int i=0; i<values.length; i++) 
	{avg+= values[i]/(double)values.length;} return avg;}

	static int min(int[] values) {int min=values[0]; for(int i=0; i<values.length; i++) 
	{if(min>values[i]) {min= values[i];}} return min; }
	
	static int max(int[] values) {int max=values[0]; for(int i=0; i<values.length; i++) 
	{if(max<values[i]) {max= values[i];}} return max;}
}

