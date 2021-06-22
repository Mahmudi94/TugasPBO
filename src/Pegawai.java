import java.util.Date;

public class Pegawai {
    private int id;
    private String nip;
    private String nipsn;
    private String namaLengkap;
    private Date tanggalLahir;
    private String jenisKelamin;
    private String alamat;
    private String agama;
    private String kewarganegaraan;

    public Pegawai() {
    }

    public Pegawai(String nip, String nipsn, String namaLengkap) {
        this.id = id;
        this.nip = nip;
        this.nipsn = nipsn;
        this.namaLengkap = namaLengkap;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.agama = agama;
        this.kewarganegaraan = kewarganegaraan;
    }

    public void menerimaPanggilanTelepon(){
        System.out.println("Pegawai Mengobrol");
    }

    public void membuatAgendaKantor(){

    }

    public void entriDataPerusahaan(){

    }

    public void melakukanArsipData(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNipsn() {
        return nipsn;
    }

    public void setNipsn(String nipsn) {
        this.nipsn = nipsn;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }
}
