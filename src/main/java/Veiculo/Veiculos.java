package Veiculo;

public class Veiculos {

    private String marca;
    private String categoria;
    protected String modelo;

    //getters
    public String getMarca() {
        return marca;
    }

    public String getCategoria() {
        return categoria;
    }

    //setters
    public void setMarca(String m) {
        this.marca = m;
    }

    public void setCategoria(String ca) {
        this.categoria = ca;
    }

    public String detalhesVeiculos() {
        return "\nInformações gerais do veículo: \n" + "\nMarca: " + marca + "\nCategoria: " + categoria + '.';
    }

}
