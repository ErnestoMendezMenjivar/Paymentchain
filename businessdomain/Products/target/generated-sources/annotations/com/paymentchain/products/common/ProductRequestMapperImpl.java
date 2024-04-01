package com.paymentchain.products.common;

import com.paymentchain.products.dto.ProductRequest;
import com.paymentchain.products.entities.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-15T11:32:13-0600",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class ProductRequestMapperImpl implements ProductRequestMapper {

    @Override
    public Product ProductRequestToProduct(ProductRequest source) {
        if ( source == null ) {
            return null;
        }

        Product product = new Product();

        product.setName( source.getName() );
        product.setCode( source.getCode() );

        return product;
    }

    @Override
    public List<Product> ProductRequestListToProductList(List<ProductRequest> source) {
        if ( source == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( source.size() );
        for ( ProductRequest productRequest : source ) {
            list.add( ProductRequestToProduct( productRequest ) );
        }

        return list;
    }

    @Override
    public ProductRequest ProductToProductRequest(Product source) {
        if ( source == null ) {
            return null;
        }

        ProductRequest productRequest = new ProductRequest();

        productRequest.setName( source.getName() );
        productRequest.setCode( source.getCode() );

        return productRequest;
    }

    @Override
    public List<ProductRequest> ProductListToProductRequestList(List<Product> source) {
        if ( source == null ) {
            return null;
        }

        List<ProductRequest> list = new ArrayList<ProductRequest>( source.size() );
        for ( Product product : source ) {
            list.add( ProductToProductRequest( product ) );
        }

        return list;
    }
}
