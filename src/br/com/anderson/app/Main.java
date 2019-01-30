package br.com.anderson.app;

import java.util.Date;

/**
 *
 * @author Anderson Silva
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        ProdutoPerecivel pp = new ProdutoPerecivel();
        pp.descricao = "Caixa de fósforo";
        pp.dataValidade = new Date();
        pp.identificar();
    }
}
