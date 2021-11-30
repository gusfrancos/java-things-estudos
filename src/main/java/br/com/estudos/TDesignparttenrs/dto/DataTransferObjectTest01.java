package br.com.estudos.TDesignparttenrs.dto;

import br.com.estudos.TDesignparttenrs.dominio.Aircraft;
import br.com.estudos.TDesignparttenrs.dominio.Country;
import br.com.estudos.TDesignparttenrs.dominio.Currency;
import br.com.estudos.TDesignparttenrs.dominio.CurrencyFactory;
import br.com.estudos.TDesignparttenrs.dominio.Person;
import br.com.estudos.TDesignparttenrs.dominio.ReportDto;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder
                .builder()
                .firstName("William")
                .lastName("Suane")
                .build();
        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDto);
    }
}

