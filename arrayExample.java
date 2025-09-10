package Basics;

public class arrayExample {

	public static void main(String[] args) {
		
//one dimensional arrays by using for loop
		int a[]= new int[5];
		a[0]=123;
		a[1]=124;
		a[2]=125;
		a[3]=126;
		a[4]=127;
		for(int i=0;i<a.length;i++) {
			System.out.println("print Array"+i+a[i]);
		
		}
		
		String []names = {"Pradeep","Pravs","Raju"};
		System.out.println(names[2]);
		names[0]="Pamir";
		System.out.println(names[0]);
		System.out.println(names.length);
		
		
		// Two Dimensional Array
		
		//rows columns
		//Two Dimensional Array
		//rows columns
int i[][]=new int[3][4];
  int [][]ij={{1,2,3,4},{11,21,31,41},{22,31,41,51}};
  System.out.println(ij[2] [1]);

i[0][0]=10;
i[0][1]=11;
i[0][2]=12;
i[0][3]=13;

i[1][0]=20;
i[1][1]=21;
i[1][2]=22;
i[1][3]=23;

i[2][0]=30;
i[2][1]=31;
i[2][2]=32;
i[2][3]=33;


System.out.println(i[2][1]);


for(int j=0;j<3;j++) {//j=0
for(int k=0;k<4;k++) {
System.out.print(i[j][k]+"  ");
}
System.out.println();
}
	}
}


//Two Dimensional Array
//rows columns
/*String i[][]=new String[3][4];

i[0][0]="prad";
i[0][1]="sand";
i[0][2]="pram";
i[0][3]="Yesu";

i[1][0]="Ravi";
i[1][1]="baka";
i[1][2]="vija";
i[1][3]="bhan";

i[2][0]="mano";
i[2][1]="moha";
i[2][2]="sais";
i[2][3]="vasa";


System.out.println(i[2][1]);


for(int j=0;j<3;j++) {//j=0
	for(int k=0;k<4;k++) {
		System.out.print(i[j][k]+" ");
}
System.out.println();
}
}
}
*/

