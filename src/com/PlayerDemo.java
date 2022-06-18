package com;

public class PlayerDemo {
	
	static Player findPlayerWithMaximumRuns(Player[] obj) {
		Player max=new Player();
		for(int i=0;i<obj.length;i++) {
			if(obj[i].getTotalRuns()>max.getTotalRuns()) {
				max=obj[i];
			}
		}
		
		return max;
	}

	static Player replacePlayerByName(Player[] obj, Player p) {
		Player t=new Player();
		for(int i=0;i<obj.length;i++) {
			if(obj[i].getName().equals(p.getName())) {
				obj[i]=p;
				t=p;
			}
		}
		return t;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player[] obj=new Player[5];
		 obj[0]=new Player("aaa",59,57,"ooooo");
		 obj[1]=new Player("bbb",60,58,"sssss");
		 obj[2]=new Player("ccc",61,59,"fffff");
		 obj[3]=new Player("ddd",62,50,"hhhhh");
		 obj[4]=new Player("eee",63,51,"kkkkk");
		 
		 Player res=new Player("ttt",67,88,"kkkkk");
		 Player maxruns=findPlayerWithMaximumRuns(obj);
		 System.out.println(maxruns.getName()+" "+maxruns.getMatchesPlayed()+" "+maxruns.getTotalRuns()+" "+maxruns.getTeam());
		 Player replace=replacePlayerByName(obj,res);
		 System.out.println();
	}

}
