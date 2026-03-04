package domain;

import java.util.*;

public class ProductCatalog {
  private Map<Integer, ProductSpecification> productSpecifications = new HashMap<>();

  public ProductCatalog() {
    ProductSpecification ps =
        new ProductSpecification(1, 100, "product 1");
    productSpecifications.put(1, ps);
    ps = new ProductSpecification(2, 200, "product 2");
    productSpecifications.put(2, ps);

    ps = new ProductSpecification(3, 300, "product 3");
    productSpecifications.put(3, ps);
    ps = new ProductSpecification(4, 400, "product 4");
    productSpecifications.put(4, ps);

  }

  public ProductSpecification specification(int upc) {
    return productSpecifications.get(upc);
  }
}
