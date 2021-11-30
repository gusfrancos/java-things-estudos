package br.com.estudos.TDesignparttenrs.factory;

import br.com.estudos.TDesignparttenrs.dominio.Country;
import br.com.estudos.TDesignparttenrs.dominio.Currency;
import br.com.estudos.TDesignparttenrs.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
