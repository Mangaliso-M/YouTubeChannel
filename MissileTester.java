package javaIntroduction;


/*
 * @Author: Mangaliso Mngomezulu.
 * @Channel: https://youtube.com/channel/UCNgcWqzPYDLSitGo2QnKUdw
 * @Description: A simple class on the concept of encapsulation. This class code should be used in conjunction with the 
 *               Missile.java file.
 *
 *@Tips: if using jGrasp, you may want to remove the first line
 * */


public class MissileTester {
	public static void main(String[] args) {
			
		Missile missileTwo = new Missile("2332590eroituriotf" ,899.345, "Denel", true);
		
		System.out.println("#Weight: "+ missileTwo.getWeight());
		
	    //modifying the weight value
	    missileTwo.setWeight(100);
		
		System.out.println("MissileID :"+ missileTwo.getMissileID());
		System.out.println("isFast: "+missileTwo.getIsFast());
		System.out.println("Weight: "+ missileTwo.getWeight());
		System.out.println("Man.."+ missileTwo. getManufacturer());
	}
}
