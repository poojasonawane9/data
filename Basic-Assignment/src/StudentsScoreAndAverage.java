import java.util.Scanner;
	public class StudentsScoreAndAverage{
		public static void main(String[] args){
		int[][] s1 = new int[3][3];
		int studentsTotal = 0;
		float studentsAvg = 0;
		int subjectTotal = 0;
		float subjectAvg = 0;
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i < 3;i++){
			System.out.println("Enter marks for student "+(i+1));
			for(int j=0;j<3;j++){
				s1[i][j] = scanner.nextInt();
			}	
		}
		for(int k = 0;k < 3;k++){
			for(int l=0;l<3;l++){
				studentsTotal = studentsTotal + s1[k][l];
		}
		System.out.println("total marks for student "+(k+1)+" are "+studentsTotal);
		studentsAvg = (float)studentsTotal/3;
		System.out.println("Average marks for student "+(k+1)+" are "+studentsTotal);
		studentsTotal= 0;
		}
		for(int k = 0;k < 3;k++){
			for(int l=0;l<3;l++){
				subjectTotal = subjectTotal + s1[l][k];
		}
		System.out.println("total marks for subject "+(k+1)+" are "+subjectTotal);
		subjectAvg = (float)subjectTotal/3;
		System.out.println("Average marks for subject "+(k+1)+" are "+studentsAvg);
		subjectTotal = 0;	
		}
	}
}
	