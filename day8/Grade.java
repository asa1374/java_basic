package day8;
public class Grade {
	public String grade(String[] name,int[] res) {
		for(int i=0;i<name.length-1;i++) {
			for(int j =1;j<name.length;j++) {
				if(res[j]>res[i]) {
					int temp = res[j];
					res[j]=res[i];
					res[i]=temp;
					String tem = name[j];
					name[j]=name[i];
					name[i]=tem;					
				}
			}
		}
		String result = "";
		for(int i=0;i<name.length;i++) {
			result += (i+1)+"등 "+name[i] + res[i]+"\n";
		}
		return result;
	}
}
