
package lab.pkg3_marcelarivera_josevargas;

public class Jugadores extends Persona {
    private int camiseta,tiro_de3,defensa,tiro_media,rebote,bandeja,pases,posteo,altura;

    public Jugadores() {
       
    }

    public Jugadores(int camiseta, int tiro_de3, int defensa, int tiro_media, int rebote, int bandeja, int pases, int posteo, int altura, String nombre, String apellido, int años_P, double salario) {
        super(nombre, apellido, años_P, salario);
        this.camiseta = camiseta;
        this.tiro_de3 = tiro_de3;
        this.defensa = defensa;
        this.tiro_media = tiro_media;
        this.rebote = rebote;
        this.bandeja = bandeja;
        this.pases = pases;
        this.posteo = posteo;
        this.altura = altura;
    }

    public int getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(int camiseta) {
        this.camiseta = camiseta;
    }

    public int getTiro_de3() {
        return tiro_de3;
    }

    public void setTiro_de3(int tiro_de3) {
        this.tiro_de3 = tiro_de3;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getTiro_media() {
        return tiro_media;
    }

    public void setTiro_media(int tiro_media) {
        this.tiro_media = tiro_media;
    }

    public int getRebote() {
        return rebote;
    }

    public void setRebote(int rebote) {
        this.rebote = rebote;
    }

    public int getBandeja() {
        return bandeja;
    }

    public void setBandeja(int bandeja) {
        this.bandeja = bandeja;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getPosteo() {
        return posteo;
    }

    public void setPosteo(int posteo) {
        this.posteo = posteo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "camiseta=" + camiseta + ", tiro_de3=" + tiro_de3 + ", defensa=" + defensa + ", tiro_media=" + tiro_media + ", rebote=" + rebote + ", bandeja=" + bandeja + ", pases=" + pases + ", posteo=" + posteo + ", altura=" + altura + '}';
    }
    
    
}
