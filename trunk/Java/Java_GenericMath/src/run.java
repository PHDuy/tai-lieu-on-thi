
public class run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMath pt1 = new PhanSo(2, 5);
		GenericMath pt2 = new PhanSo(2, 3);
		GenericMath sp1 = new SoPhuc(10,5);
		GenericMath sp2 = new SoPhuc(1,4);
		GenericMath pt3 = new SoPhuc();
		
		pt3.cong(sp1, sp2);
		
		System.out.print(sp1+ " + "+sp2+" = "+pt3);
	}

}
