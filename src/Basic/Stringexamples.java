package Basic;

public class Stringexamples {

	public static void main(String[] args) {
		String s1="Rah";
		
				String s2="Rah";
						System.out.println(s1);
						System.out.println(s2);
						
						System.out.println("after updation");
						s1="Rahul";
						System.out.println(s1);
						
						// String s1="way";//wrong declaration dont use String again
						s1="Way";
					 s2="2";
						String s3="Automation";
						
					//	System.out.println(s1,s2,s3);//compile time error,max one variable will have to pass
					//	so have to concatenate
						System.out.println(s1+s2+s3);
						
						System.out.println(10+20);//30 will be printed
						System.out.println(s1+s2+10+15+30+s3);//way2101530autmation
						//after concatenation the data type of output will be string so again string +20, string +30, 
						System.out.println(10+15+s1+s2+s3);//25way2auto 
						//left to right, 25+s1 gives string so concatenation
						System.out.println(s1+10*15+s2+s3);//left to right but bodmas will be applied, so first multiply so S+150+s2+s3)
	}

}
