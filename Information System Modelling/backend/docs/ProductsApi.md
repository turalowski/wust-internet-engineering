# ProductsApi

All URIs are relative to *https://localhost:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProduct**](ProductsApi.md#addProduct) | **POST** /products | 
[**deleteProduct**](ProductsApi.md#deleteProduct) | **DELETE** /products/{id} | 
[**getProduct**](ProductsApi.md#getProduct) | **GET** /products/{id} | 
[**getProducts**](ProductsApi.md#getProducts) | **GET** /products | 
[**updateProduct**](ProductsApi.md#updateProduct) | **PUT** /products/{id} | 

<a name="addProduct"></a>
# **addProduct**
> NewItem addProduct(body)



Creates a new product. Duplicates are not allowed

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
Product body = new Product(); // Product | Add product
try {
    NewItem result = apiInstance.addProduct(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#addProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Product**](Product.md)| Add product |

### Return type

[**NewItem**](NewItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProduct"></a>
# **deleteProduct**
> Item deleteProduct(id)



deletes a single product based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | ID of product to delete
try {
    Item result = apiInstance.deleteProduct(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#deleteProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of product to delete |

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProduct"></a>
# **getProduct**
> GetProduct getProduct(id)



This endpoints are related with the products model of the application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | ID of product to fetch
try {
    GetProduct result = apiInstance.getProduct(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#getProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of product to fetch |

### Return type

[**GetProduct**](GetProduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProducts"></a>
# **getProducts**
> List&lt;GetProduct&gt; getProducts(price, unitOfMeasurement, name)



This endpoint returns all products from the database.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
BigDecimal price = new BigDecimal(); // BigDecimal | 
String unitOfMeasurement = "unitOfMeasurement_example"; // String | 
String name = "name_example"; // String | 
try {
    List<GetProduct> result = apiInstance.getProducts(price, unitOfMeasurement, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#getProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price** | **BigDecimal**|  | [optional]
 **unitOfMeasurement** | **String**|  | [optional]
 **name** | **String**|  | [optional]

### Return type

[**List&lt;GetProduct&gt;**](GetProduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProduct"></a>
# **updateProduct**
> Item updateProduct(id)



Update product

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | ID of product to fetch
try {
    Item result = apiInstance.updateProduct(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#updateProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of product to fetch |

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

