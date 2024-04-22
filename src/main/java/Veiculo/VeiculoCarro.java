package Veiculo;

public class VeiculoCarro extends Veiculos {

    private int quilometragem;
    private int combustivel;

    private int passagem;

    public void comprandoPassagem() {
        System.out.print("\nPassagem comprada para dia 22/04/2024!\n\n\n");
    }

    //getters
    public String getModelo() {
        return modelo;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public int getPassagem() {
        return passagem;
    }

    //setters
    public void setModelo(String m) {
        this.modelo = m;
    }

    public void setQuilometragem(int q) {
        this.quilometragem = q;
    }

    public void setCombustivel(int c) {
        this.combustivel = c;
    }

    public void setPassagem(int p) {
        this.passagem = p;
    }

    public String detalhesCarro() {
        return "\nEspecificidades do transporte: " + "\nModelo: " + modelo + "\nQuilometragem: " + quilometragem + "\nCombustível: RS " + combustivel + passagem;
    }

}
