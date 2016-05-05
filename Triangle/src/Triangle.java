public class Triangle {
		
	static String EQUILATERAL = "equilateral";
	static String ISOSCELES = "isosceles";
	static String SCALENE = "scalene";
	
	public String judge(int a,int b,int c){
		//n=0表示所有的边都不相等，n=1表示有两条边相等，n=2表示三条边都相等
		int n=0;
		if(a==b){
			n=1;
			if(a==c){
				n=2;
			}
		}
		else if(a==c){
			n=1;		
		}
		else if(b==c){
			n=1;
		}
		//根据n的值返回判断结果
		if(n==0){
			return SCALENE;
		}
		else if(n==1){
			return ISOSCELES;
		}
		else{
			return EQUILATERAL;
		}
	}
}
