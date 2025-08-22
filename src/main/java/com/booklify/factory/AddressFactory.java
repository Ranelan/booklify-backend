package com.booklify.factory;

import com.booklify.domain.Address;

public class AddressFactory {
    public static Address createAddress(String unitNumber ,String street,String suburb,String city,String province,String country,String postalCode){

        if(unitNumber == null ){
            return null;
        }

        if(street == null||street.isEmpty() ){
            return null;
        }
        if(suburb == null||suburb.isEmpty() ){
            return null;
        }
        if(province== null||province.isEmpty() ){
            return null;
        }
        if(country == null||country.isEmpty() ){
            return null;
        }
        if(city == null||city.isEmpty() ){
            return null;
        }
        if (postalCode == null) {
            return null;
        }
        return new Address.Builder()
                .setStreet(street)
                .setSuburb(suburb)
                .setCity(city)
                .setProvince(province)
                .setPostalCode(postalCode)
                .setCountry(country)
                .build();
    }


}
