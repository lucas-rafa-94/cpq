package br.com.alpargatas.materiais.cpq.schema.rest;

public class DtRelacProd {

    private String modelo;
    private String cor;
    private String tamanho;
    private String produto;
    private String centro;
    private String orgVenda;
    private String canalDist;

    public DtRelacProd(String modelo, String cor, String tamanho, String produto, String centro, String orgVenda, String canalDist) {
        this.modelo = modelo;
        this.cor = cor;
        this.tamanho = tamanho;
        this.produto = produto;
        this.centro = centro;
        this.orgVenda = orgVenda;
        this.canalDist = canalDist;
    }

    public DtRelacProd() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getOrgVenda() {
        return orgVenda;
    }

    public void setOrgVenda(String orgVenda) {
        this.orgVenda = orgVenda;
    }

    public String getCanalDist() {
        return canalDist;
    }

    public void setCanalDist(String canalDist) {
        this.canalDist = canalDist;
    }
}
