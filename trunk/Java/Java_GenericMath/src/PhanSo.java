/**
 * 
 */

/**
 * @author Poseidon
 *
 */
public class PhanSo extends GenericMath {
	private double tuso;
	private double mauso;
	

	public PhanSo(double tuso, double mauso) {
		super();
		this.tuso = tuso;
		this.mauso = mauso;
	}
	public PhanSo() {}

	/* (non-Javadoc)
	 * @see GenericMath#cong(GenericMath, GenericMath)
	 */
	public void cong(GenericMath a, GenericMath b) {
		// TODO Auto-generated method stub
		tuso  = (((PhanSo)a).tuso)*(((PhanSo)b).mauso) + (((PhanSo)b).tuso)*(((PhanSo)a).mauso);
		mauso = (((PhanSo)a).mauso)*(((PhanSo)b).mauso);
	}

	/* (non-Javadoc)
	 * @see GenericMath#tru(GenericMath, GenericMath)
	 */
	public void tru(GenericMath a, GenericMath b) {
		// TODO Auto-generated method stub
		tuso  = (((PhanSo)a).tuso)*(((PhanSo)b).mauso) - (((PhanSo)a).tuso)*(((PhanSo)a).mauso);
		mauso = (((PhanSo)a).mauso)*(((PhanSo)b).mauso);
	}

	/* (non-Javadoc)
	 * @see GenericMath#nhan(GenericMath, GenericMath)
	 */
	public void nhan(GenericMath a, GenericMath b) {
		// TODO Auto-generated method stub
		tuso = (((PhanSo)a).tuso)*(((PhanSo)b).tuso);
		mauso = (((PhanSo)a).mauso)*(((PhanSo)b).mauso);
	}

	/* (non-Javadoc)
	 * @see GenericMath#chia(GenericMath, GenericMath)
	 */
	public void chia(GenericMath a, GenericMath b) {
		// TODO Auto-generated method stub
		tuso = (((PhanSo)a).tuso)*(((PhanSo)b).mauso);
		mauso = (((PhanSo)a).mauso)*(((PhanSo)b).tuso);

	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return (tuso+"/"+mauso);
	}

}
