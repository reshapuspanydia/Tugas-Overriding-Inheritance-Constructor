public class Mobil extends Kendaraan{
	String nama;
	public void tampilkan(){
	System.out.println("Tampilan kelas Kendaraan");
	}
	
	public void Kendaraan(){
		super.tampilkan();
		System.out.println("===========================");
		super.melaju();
		super.berhenti();
		super.bersuara();
		System.out.println("===========================");
	}
	public static void main (String[] args){
		Mobil mbl = new Mobil();
		mbl.Kendaraan();
		
		
		Kendaraan kendaraan1 = new Kendaraan();
        kendaraan1.setJenis("Mobil");
        kendaraan1.setMerk("Toyota");        
        System.out.println("Jenis Kendaraan  = "+kendaraan1.getJenis());
        System.out.println("Merk Kendaraan  = "+kendaraan1.getMerk());
	}
}