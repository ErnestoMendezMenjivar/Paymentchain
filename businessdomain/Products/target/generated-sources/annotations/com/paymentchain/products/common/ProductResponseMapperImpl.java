package com.paymentchain.products.common;

import com.paymentchain.products.dto.ProductResponse;
import com.paymentchain.products.entities.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-15T11:32:14-0600",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class ProductResponseMapperImpl implements ProductResponseMapper {

    @Override
    public Product ProductResponseToProduct(ProductResponse source) {
        if ( source == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( source.getId() );
        product.setName( source.getName() );
        product.setCode( source.getCode() );

        return product;
    }

    @Override
    public List<Product> ProductResponseListToProductList(List<ProductResponse> source) {
        if ( source == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( source.size() );
        for ( ProductResponse productResponse : source ) {
            list.add( ProductResponseToProduct( productResponse ) );
        }

        return list;
    }

    @Override
    public ProductResponse ProductToProductResponse(Product source) {
        if ( source == null ) {
            return null;
        }

        ProductResponse productResponse = new ProductResponse();

        productResponse.setId( source.getId() );
        productResponse.setName( source.getName() );
        productResponse.setCode( source.getCode() );

        return productResponse;
    }

    @Override
    public List<ProductResponse> ProductListToProductResponseList(List<Product> source) {
        if ( source == null ) {
            return null;
        }

        List<ProductResponse> list = new ArrayList<ProductResponse>( source.size() );
        for ( Product product : source ) {
            list.add( ProductToProductResponse( product ) );
        }

        return list;
    }
}
