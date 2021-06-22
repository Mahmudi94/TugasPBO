public class PegawaiTidakTetap extends Pegawai{
    private String nipPns;
    private String homeBase;
    private String pekerjaanSampingan;

    public String getNipPns() {
        return nipPns;
    }

    public void setNipPns(String nipPns) {
        this.nipPns = nipPns;
    }

    public String getHomeBase() {
        return homeBase;
    }

    public void setHomeBase(String homeBase) {
        this.homeBase = homeBase;
    }

    public String getPekerjaanSampingan() {
        return pekerjaanSampingan;
    }

    public void setPekerjaanSampingan(String pekerjaanSampingan) {
        this.pekerjaanSampingan = pekerjaanSampingan;
    }

    public void membuatLaporan(){

    }

    public void menerimaLaporan(){

    }

    @Override
    public void menerimaPanggilanTelepon(){
    System.out.println("Menerima Telepon");
    }

    @Override
    public void membuatAgendaKantor(){
        System.out.println("Membuat Jadwal");
    }
}
