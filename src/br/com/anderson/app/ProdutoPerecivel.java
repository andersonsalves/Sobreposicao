package br.com.anderson.app;

import java.util.Date;

/**
 *
 * @author Anderson Silva
 */
public class ProdutoPerecivel extends Produto {

    protected Date dataValidade;

    /**
     * 
     */
    @Override
    public void identificar() {
        super.identificar();
        System.out.println("Minha data de validade: " + dataValidade);
    }
}
