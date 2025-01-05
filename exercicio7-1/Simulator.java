package ex71;
public class Simulator{
	public static void main(String[] args){
		System.out.println("Creating a maple tree and a tulip...");
		MapleTree mapleTree = new MapleTree();
		Tulip tulip = new Tulip();
		Rose rose = new Rose();
		System.out.println("Iniciando o loop para simular 3 anos");
		for (int i=0; i<3; i++){
			mapleTree.doSpring();
			tulip.doSpring();
			rose.doSpring();
			mapleTree.doSummer();
			tulip.doSummer();
			rose.doSummer();
			mapleTree.doFall();
			tulip.doFall();
			rose.doFall();
			mapleTree.doWinter();
			tulip.doWinter();
			rose.doWinter();
		}
	}
}
