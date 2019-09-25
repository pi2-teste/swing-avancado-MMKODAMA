package br.senac.sp.aula5;

public class Computador {
        
    static String fabricante = "seu nome";
    
    String tipoComputador;
    String sistemaOperacional;
    String HD;
    String[] acessorios = new String[3];
    String[] serviços = new String[4];


    public Computador() {
    
    
    

    }

    
    public void setTipoComputador(String tipoComputador) {
        this.tipoComputador = tipoComputador;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

    public void setAcessorios(String[] acessorios) {
        this.acessorios = acessorios;
    }

    public void setServiços(String[] serviços) {
        this.serviços = serviços;
    }

    public String getTipoComputador() {
        return tipoComputador;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public String getHD() {
        return HD;
    }

    public String[] getAcessorios() {
        return acessorios;
    }

    public String[] getServiços() {
        return serviços;
    }



}






