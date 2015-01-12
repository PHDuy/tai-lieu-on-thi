
public class SoPhuc extends GenericMath {
	private double PhanThuc;
	private double PhanAo;
	
	
	

	public SoPhuc(double phanThuc, double phanAo) {
		super();
		PhanThuc = phanThuc;
		PhanAo = phanAo;
	}
	public SoPhuc() {}

	//Cong 2 so phuc : Phan thuc + phan thuc/Phan ao + phan ao
	public void cong(GenericMath a, GenericMath b) {
		// TODO Auto-generated method stub
		PhanThuc = (((SoPhuc)a).PhanThuc)+(((SoPhuc)b).PhanThuc);
		PhanAo = (((SoPhuc)a).PhanAo)+(((SoPhuc)b).PhanAo);

	}
	
	//Tru 2 so phuc : Phan thuc - phan thuc/Phan ao - phan ao
	public void tru(GenericMath a, GenericMath b) {
		// TODO Auto-generated method stub
		PhanThuc = (((SoPhuc)a).PhanThuc)-(((SoPhuc)b).PhanThuc);
		PhanAo = (((SoPhuc)a).PhanAo)-(((SoPhuc)b).PhanAo);

	}

	//Nhan 2 so phuc (a1a2-b1b2) + (a1b2+b1a2)i   
	//voi a1 la phan thuc cua a, a2 la phan thuc cua b
	//voi b1 la phan ao cua a, b2 la phan ao cua b
	public void nhan(GenericMath a, GenericMath b) {
		// TODO Auto-generated method stub
		PhanThuc = (((SoPhuc)a).PhanThuc)*(((SoPhuc)b).PhanThuc) - (((SoPhuc)a).PhanAo)*(((SoPhuc)b).PhanAo);
		PhanAo = (((SoPhuc)a).PhanThuc)*(((SoPhuc)b).PhanAo) + (((SoPhuc)a).PhanAo)*(((SoPhuc)b).PhanThuc);

	}
	//Chia 2 so phuc (a1a2+b1b2)/(a2*a2 + b2*b2) + ((b1a2-a1b2)/(a2*a2-b2*b2))i
	//voi a1 la phan thuc cua a, a2 la phan thuc cua b
	//voi b1 la phan ao cua a, b2 la phan ao cua b
	public void chia(GenericMath a, GenericMath b) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	public String toString() {
		// TODO Auto-generated method stub
		return (PhanThuc+"+"+PhanAo+"i");
	}

}
