package LoopAssignment;

public class GCD_LCMProg {
	// TODO Auto-generated method stub

public static void main(String[] args) {	
	int i = 4;
	int j = 6;
	double gd = 0;
	int sm = Math.min(j, i);
	for(int n=1;n<sm;n++) {
			if((i%n==0)&&(j%n==0)) {
				 gd = n;
			}
	}
	double lm = (int) ((i*j)/gd);
	System.out.println("LCM "+lm+" GCD "+gd);
}

}

