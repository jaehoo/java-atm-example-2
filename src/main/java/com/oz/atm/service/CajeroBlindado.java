package com.oz.atm.service;

import com.oz.atm.model.dao.Retiros;
import com.oz.atm.model.dao.Transferencias;

/**
 * Created with IntelliJ IDEA.
 * User: asanchez
 * Date: 20/02/13
 * Time: 10:39
 *
 * @author <a href="jaehoo@gmail.com">Alberto Sánchez</a>
 *         Contact me by:
 *         <ul><li>Twitter: @jaehoox</li><ul>
 */
public class CajeroBlindado implements Cajero {

    private Retiros retiros;
    private Transferencias transferencias;

    public void retirar(Integer idCustomer, double amount){}

    @Override
    public void transferir(Integer idCustomer, double amount) {
        //TODO

    }
}
