package day9;
public class NameScoreArray {
	public String test(String[] name,int[] score) {
		for(int i=0;i<name.length-1;i++) {
			for(int j =1;j<name.length;j++) {
				if(score[j]>score[i]) {
					int temp = score[j];
					score[j]=score[i];
					score[i]=temp;
					String tem = name[j];
					name[j]=name[i];
					name[i]=tem;					
				}
			}
		}
		String res = "";
		for(int i=0;i<name.length;i++) {
			res += (i+1)+"등 "+name[i] + score[i]+"\n";
		}
		return res;
	}
}
