package com.example.Batch_Processing_demo.config;

import com.example.Batch_Processing_demo.model.Product;
import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Product, Product> {
    @Override
    public Product process(Product item) throws Exception {
        return item;
    }
}
