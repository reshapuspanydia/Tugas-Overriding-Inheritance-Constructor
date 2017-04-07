public class Kendaraan {
    String jenis;
    String merk;
    
    //konstruktor
    public Kendaraan(){
        this.jenis="Jenis Mobil";
        this.merk="Merk Mobil";
    }
    public Kendaraan(String j, String m){
        this.jenis = j;
        this.merk = m;
    }    
    public void setJenis(String j){
        this.jenis= j;
    }
    public void setMerk(String m){
        this.merk = m;        
    }
    public String getJenis(){
        return this.jenis;
    }
    public String getMerk(){
        return this.merk;
    }    
    public void melaju(){
        System.out.println("Kendaraan dapat Melaju");        
    }
    public void berhenti(){
        System.out.println("Kendaraan dapat Berhenti");        
    }
    public void bersuara(){
        System.out.println("Kendaraan dapat Bersuara");        
    }
	public void tampilkan(){
	System.out.println("ini tampilan dari Kelas Kendaraan");
	}
}