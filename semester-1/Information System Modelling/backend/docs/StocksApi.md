# StocksApi

All URIs are relative to *https://localhost:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStock**](StocksApi.md#addStock) | **POST** /stocks | 
[**deleteStock**](StocksApi.md#deleteStock) | **DELETE** /stocks/{id} | 
[**getStock**](StocksApi.md#getStock) | **GET** /stocks/{id} | 
[**getStocks**](StocksApi.md#getStocks) | **GET** /stocks | 
[**updateStock**](StocksApi.md#updateStock) | **PUT** /stocks/{id} | 

<a name="addStock"></a>
# **addStock**
> NewItem addStock(body)



Creates a new stock. Duplicates are not allowed

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StocksApi;


StocksApi apiInstance = new StocksApi();
Stock body = new Stock(); // Stock | Add stock
try {
    NewItem result = apiInstance.addStock(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#addStock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Stock**](Stock.md)| Add stock |

### Return type

[**NewItem**](NewItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStock"></a>
# **deleteStock**
> Item deleteStock(id)



deletes a single stock based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StocksApi;


StocksApi apiInstance = new StocksApi();
Long id = 789L; // Long | ID of stock to delete
try {
    Item result = apiInstance.deleteStock(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#deleteStock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of stock to delete |

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStock"></a>
# **getStock**
> GetStock getStock(id)



This endpoints are related with the stocks model of the application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StocksApi;


StocksApi apiInstance = new StocksApi();
Long id = 789L; // Long | ID of stock to fetch
try {
    GetStock result = apiInstance.getStock(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#getStock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of stock to fetch |

### Return type

[**GetStock**](GetStock.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStocks"></a>
# **getStocks**
> List&lt;GetStock&gt; getStocks(responsiblePerson, name)



This endpoint returns all stocks from the database.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StocksApi;


StocksApi apiInstance = new StocksApi();
String responsiblePerson = "responsiblePerson_example"; // String | 
String name = "name_example"; // String | 
try {
    List<GetStock> result = apiInstance.getStocks(responsiblePerson, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#getStocks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responsiblePerson** | **String**|  | [optional]
 **name** | **String**|  | [optional]

### Return type

[**List&lt;GetStock&gt;**](GetStock.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStock"></a>
# **updateStock**
> Item updateStock(id)



Update stock

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StocksApi;


StocksApi apiInstance = new StocksApi();
Long id = 789L; // Long | ID of stock to fetch
try {
    Item result = apiInstance.updateStock(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#updateStock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of stock to fetch |

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

