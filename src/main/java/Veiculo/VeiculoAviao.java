package Veiculo;

public class VeiculoAviao extends Veiculos {

    private String classificacao; //comercial; militar;carga;executivo;

    public void agendamentoPassagem() {
        System.out.println("\nVoo agendado para 23/04/2024!");
    }

    //getters
    public String getClassificação() {
        return classificacao;
    }

    public String getModelo() {
        return modelo;
    }

    //setters
    public void setClassificação(String cl) {
        this.classificacao = cl;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String detalhesAviao() {
        return "\nEspecificidades do Avião: " + "\nClassificação: " + classificacao + "\nModelo: " + modelo + '.';
    }

}
