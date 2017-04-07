public class Sepeda_motor extends Kendaraan{
	String nama;
	public void tampilkan(){
	System.out.println("Tampilan dari kelas Sepeda_motor");
	}
	
	public void Kendaraan(){
		tampilkan();
		super.tampilkan();
		System.out.println("===========================");
		super.melaju();
		super.berhenti();
		super.bersuara();
		System.out.println("===========================");
	}
	public static void main (String[] args){
		Sepeda_motor spd = new Sepeda_motor();
		spd.Kendaraan();
		
		Kendaraan kendaraan1 = new Kendaraan();
        kendaraan1.setJenis("Sepeda Motor");
        kendaraan1.setMerk("Yamaha");        
        System.out.println("Jenis Kendaraan  = "+kendaraan1.getJenis());
        System.out.println("Merk Kendaraan  = "+kendaraan1.getMerk());
	}
}
