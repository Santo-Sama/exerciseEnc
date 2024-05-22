public class Auto {

    private int cilindrata;
    private String modello;
    private String marca;
    private String targa;

    public Auto(int cilindrata, String modello, String marca, String targa){
        this.cilindrata = cilindrata;
        this.modello = modello;
        this.targa = targa;
        this.marca = marca;
    }
    public String getModello(){
        return modello;
    }
    public void setModello(String modello){
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata=" + cilindrata +
                ", modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                ", targa='" + targa + '\'' +
                '}';
    }
}
