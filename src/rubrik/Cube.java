package rubrik;

public class Cube {
	private int[][][] pattern;
	private static final int[] x = {1,3,6,4};
	private static final int[] y = {1,2,6,5};
	private static final int[] z = {2,3,5,4};
	
	public Cube(){
		for(int i=0;i<6;i++)
			for (int j=0;j<3;j++)
				for(int k=0;k<3;k++)
					pattern[i][j][k] = i;
	}
	
	public Cube(int[][][] input){
		for(int i=0;i<6;i++)
			for (int j=0;j<3;j++)
				for(int k=0;k<3;k++)
					pattern[i][j][k] = input[i][j][k];
	}

	
	private int[] moveCube(int move){
		//char a = Integer.toBinaryString(move).charAt(0);
		int[] temp = new int[3];
		switch (move){
		case 0:
			for (int i=0;i<=2;i++)
				temp[i]=pattern[x[0]][0][i];
			for (int i=0;i<=2;i++)
				for (int j=0;i<=3;i++)
					pattern[x[i]][0][j] = pattern[x[i+1]][0][j];
			for (int i=0;i<=2;i++)
				pattern[x[3]][0][i] = temp[i];
			break;
			
		case 1:
			for (int i=0;i<=2;i++)
				temp[i]=pattern[x[3]][0][i];
			for (int i=3;i>=1;i--)
				for (int j=0;i<=3;i++)
					pattern[x[i]][0][j] = pattern[x[i-1]][0][j];
			for (int i=0;i<=2;i++)
				pattern[x[0]][1][i] = temp[i];
			break;
			
		case 2:
			for (int i=0;i<=2;i++)
				temp[i]=pattern[x[0]][2][i];
			for (int i=0;i<=2;i++)
				for (int j=0;i<=3;i++)
					pattern[x[i]][2][j] = pattern[x[i+1]][2][j];
			for (int i=0;i<=2;i++)
				pattern[x[3]][2][i] = temp[i];
			break;
			
		case 3:
			for (int i=0;i<=2;i++)
				temp[i]=pattern[x[3]][2][i];
			for (int i=3;i>=1;i--)
				for (int j=0;i<=3;i++)
					pattern[x[i]][2][j] = pattern[x[i-1]][2][j];
			for (int i=0;i<=2;i++)
				pattern[x[0]][2][i] = temp[i];
			break;
			
		case 4:
			for (int i=0;i<=2;i++)
				temp[i]=pattern[y[0]][i][0];
			for (int i=0;i<=2;i++)
				for (int j=0;i<=3;i++)
					pattern[y[i]][j][0] = pattern[y[i+1]][j][0];
			for (int i=0;i<=2;i++)
				pattern[y[3]][i][0] = temp[i];
			break;
			
		case 5:
			for (int i=0;i<=2;i++)
				temp[i]=pattern[x[3]][i][0];
			for (int i=3;i>=1;i--)
				for (int j=0;i<=3;i++)
					pattern[x[i]][j][0] = pattern[x[i-1]][j][0];
			for (int i=0;i<=2;i++)
				pattern[x[0]][i][0] = temp[i];
			break;
			
		case 6:
			for (int i=0;i<=2;i++)
				temp[i]=pattern[y[0]][i][2];
			for (int i=0;i<=2;i++)
				for (int j=0;i<=3;i++)
					pattern[y[i]][j][2] = pattern[y[i+1]][j][2];
			for (int i=0;i<=2;i++)
				pattern[y[3]][i][2] = temp[i];
			break;
			
		case 7:
			for (int i=0;i<=2;i++)
				temp[i]=pattern[x[3]][i][2];
			for (int i=3;i>=1;i--)
				for (int j=0;i<=3;i++)
					pattern[x[i]][j][2] = pattern[x[i-1]][j][2];
			for (int i=0;i<=2;i++)
				pattern[x[0]][i][2] = temp[i];
			break;
		case 8:
			for (int i=0;i<=2;i++)
				temp[i]=pattern[z[0]][i][0];
			for (int i=0;i<=2;i++)
				for (int j=0;i<=3;i++)
					pattern[y[i]][j][0] = pattern[y[i+1]][j][0];
			for (int i=0;i<=2;i++)
				pattern[y[3]][i][0] = temp[i];
			break;
			
		case 5:
			for (int i=0;i<=2;i++)
				temp[i]=pattern[x[3]][i][0];
			for (int i=3;i>=1;i--)
				for (int j=0;i<=3;i++)
					pattern[x[i]][j][0] = pattern[x[i-1]][j][0];
			for (int i=0;i<=2;i++)
				pattern[x[0]][i][0] = temp[i];
			break;
			
		case 6:
			for (int i=0;i<=2;i++)
				temp[i]=pattern[y[0]][i][2];
			for (int i=0;i<=2;i++)
				for (int j=0;i<=3;i++)
					pattern[y[i]][j][2] = pattern[y[i+1]][j][2];
			for (int i=0;i<=2;i++)
				pattern[y[3]][i][2] = temp[i];
			break;
			
		case 7:
			for (int i=0;i<=2;i++)
				temp[i]=pattern[x[3]][i][2];
			for (int i=3;i>=1;i--)
				for (int j=0;i<=3;i++)
					pattern[x[i]][j][2] = pattern[x[i-1]][j][2];
			for (int i=0;i<=2;i++)
				pattern[x[0]][i][2] = temp[i];
			break;
		}
		return temp;
	}
	
	public static void main(String[] args){
		
	}
}
