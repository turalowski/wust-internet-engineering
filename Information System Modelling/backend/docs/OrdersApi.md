# OrdersApi

All URIs are relative to *https://localhost:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrder**](OrdersApi.md#addOrder) | **POST** /orders | 
[**deleteOrder**](OrdersApi.md#deleteOrder) | **DELETE** /orders/{id} | 
[**getOrder**](OrdersApi.md#getOrder) | **GET** /orders/{id} | 
[**getOrders**](OrdersApi.md#getOrders) | **GET** /orders | 
[**updateOrder**](OrdersApi.md#updateOrder) | **PUT** /orders/{id} | 

<a name="addOrder"></a>
# **addOrder**
> NewItem addOrder(body)



Creates a new order. Duplicates are not allowed

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
Order body = new Order(); // Order | Add order
try {
    NewItem result = apiInstance.addOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#addOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Order**](Order.md)| Add order |

### Return type

[**NewItem**](NewItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrder"></a>
# **deleteOrder**
> Item deleteOrder(id)



deletes a single order based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
Long id = 789L; // Long | ID of order to delete
try {
    Item result = apiInstance.deleteOrder(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#deleteOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of order to delete |

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrder"></a>
# **getOrder**
> GetOrder getOrder(id)



This endpoints are related with the orders model of the application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
Long id = 789L; // Long | ID of order to fetch
try {
    GetOrder result = apiInstance.getOrder(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of order to fetch |

### Return type

[**GetOrder**](GetOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrders"></a>
# **getOrders**
> List&lt;GetOrder&gt; getOrders(status, partnerName, name)



This endpoint returns all orders from the database.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
BigDecimal status = new BigDecimal(); // BigDecimal | 
String partnerName = "partnerName_example"; // String | 
String name = "name_example"; // String | 
try {
    List<GetOrder> result = apiInstance.getOrders(status, partnerName, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **BigDecimal**|  | [optional]
 **partnerName** | **String**|  | [optional]
 **name** | **String**|  | [optional]

### Return type

[**List&lt;GetOrder&gt;**](GetOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOrder"></a>
# **updateOrder**
> Item updateOrder(id)



Update order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
Long id = 789L; // Long | ID of order to fetch
try {
    Item result = apiInstance.updateOrder(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#updateOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of order to fetch |

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

