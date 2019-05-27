package br.com.alpargatas.materiais.cpq.schema.rest;

public class DtModelo {

    private String codModelo;
    private String modelo;
    private String tipoMaterial;
    private String grupoTamanho;

    public DtModelo(String codModelo, String modelo, String tipoMaterial, String grupoTamanho) {
        this.codModelo = codModelo;
        this.modelo = modelo;
        this.tipoMaterial = tipoMaterial;
        this.grupoTamanho = grupoTamanho;
    }

    public DtModelo() {
    }

    public String getCodModelo() {
        return codModelo;
    }

    public void setCodModelo(String codModelo) {
        this.codModelo = codModelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getGrupoTamanho() {
        return grupoTamanho;
    }

    public void setGrupoTamanho(String grupoTamanho) {
        this.grupoTamanho = grupoTamanho;
    }
}
