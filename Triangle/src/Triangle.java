public class Triangle {
		
	static String EQUILATERAL = "equilateral";
	static String ISOSCELES = "isosceles";
	static String SCALENE = "scalene";
	
	public String judge(int a,int b,int c){
		//n=0��ʾ���еı߶�����ȣ�n=1��ʾ����������ȣ�n=2��ʾ�����߶����
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
		//����n��ֵ�����жϽ��
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
