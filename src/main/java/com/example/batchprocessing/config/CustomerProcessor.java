package com.example.batchprocessing.config;

import com.example.batchprocessing.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

// <Customer, Customer> means read and write item as a customer
public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    // To process only the records which country are United States
//    @Override
//    public Customer process(Customer customer) throws Exception {
//        if(customer.getCountry().equals("United States")) {
//            return customer;
//        }else{
//            return null;
//        }
//    }


    // to process all entry
    @Override
    public Customer process(Customer item) throws Exception {
        return item;
    }
}
