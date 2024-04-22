package Veiculo;

import java.util.Scanner;

public class VeiculosMain {

    public static void main(String[] args) {
        
    Scanner STRING = new Scanner(System.in);
    Scanner INT = new Scanner(System.in);
    
    
    
        VeiculoCarro vc = new VeiculoCarro();
        
        //INFORMAÇÃO COM SCANNER
        System.out.print("Categoria do transporte: "); vc.setCategoria(STRING.nextLine());
        System.out.print("Marca: "); vc.setMarca(STRING.nextLine());
        System.out.print("Modelo do veículo: "); vc.setModelo(STRING.nextLine());
        System.out.print("Quilometragem: "); vc.setQuilometragem(INT.nextInt());
        System.out.print("Valor total combustível: "); vc.setCombustivel(INT.nextInt());
        System.out.print(vc.detalhesVeiculos());
        System.out.print(vc.detalhesCarro());
        vc.comprandoPassagem();
        
        
        
        //OPÇÃO COM INFORMAÇÕES PRONTAS
        /*
        vc.setCategoria("Terrestre");
        vc.setMarca("Mitsubishi");
        vc.setModelo("Pajero TR4");
        vc.setQuilometragem(56214777);
        vc.setCombustivel(522);
        System.out.println(vc.detalhesVeiculos());
        System.out.println(vc.detalhesCarro());
        vc.comprandoPassagem();
        */
       
        
        VeiculoAviao va = new VeiculoAviao();
        
        //OPÇÃO COM SCANNER
        
        System.out.print("\nCategoria do transporte: "); va.setCategoria(STRING.nextLine());
        System.out.print("Marca: "); va.setMarca(STRING.nextLine());
        System.out.print("Modelo do veículo: "); va.setModelo(STRING.nextLine());
        System.out.print("Classificação da aeronave: "); va.setClassificação(STRING.nextLine());
        System.out.print(va.detalhesVeiculos());        
        System.out.println(va.detalhesAviao());
        va.agendamentoPassagem();
       
        
        /*
        //OPÇÃO COM INFORMAÇÕES PRONTAS
        
        va.setCategoria("Aéreo");
        va.setMarca("Mitsubishi");
        va.setModelo("MU-2");
        va.setClassificação("Comercial");
        System.out.println(va.detalhesVeiculos());
        System.out.println(va.detalhesAviao());
        va.agendamentoPassagem();
        */

    }
}
