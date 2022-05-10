# RelationsApi

All URIs are relative to *https://localhost:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRelation**](RelationsApi.md#addRelation) | **POST** /relations | 
[**deleteRelation**](RelationsApi.md#deleteRelation) | **DELETE** /relations/{id} | 
[**getRelation**](RelationsApi.md#getRelation) | **GET** /relations/{id} | 
[**getRelations**](RelationsApi.md#getRelations) | **GET** /relations | 
[**updateRelation**](RelationsApi.md#updateRelation) | **PUT** /relations/{id} | 

<a name="addRelation"></a>
# **addRelation**
> NewItem addRelation(body)



Creates a new relation. Duplicates are not allowed

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RelationsApi;


RelationsApi apiInstance = new RelationsApi();
Relation body = new Relation(); // Relation | Add relation
try {
    NewItem result = apiInstance.addRelation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationsApi#addRelation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Relation**](Relation.md)| Add relation |

### Return type

[**NewItem**](NewItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRelation"></a>
# **deleteRelation**
> Item deleteRelation(id)



deletes a single relation based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RelationsApi;


RelationsApi apiInstance = new RelationsApi();
Long id = 789L; // Long | ID of relation to delete
try {
    Item result = apiInstance.deleteRelation(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationsApi#deleteRelation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of relation to delete |

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRelation"></a>
# **getRelation**
> GetRelation getRelation(id)



This endpoints are related with the relations model of the application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RelationsApi;


RelationsApi apiInstance = new RelationsApi();
Long id = 789L; // Long | ID of relation to fetch
try {
    GetRelation result = apiInstance.getRelation(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationsApi#getRelation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of relation to fetch |

### Return type

[**GetRelation**](GetRelation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRelations"></a>
# **getRelations**
> List&lt;GetRelation&gt; getRelations(type, name)



This endpoint returns all relations from the database.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RelationsApi;


RelationsApi apiInstance = new RelationsApi();
BigDecimal type = new BigDecimal(); // BigDecimal | 
String name = "name_example"; // String | 
try {
    List<GetRelation> result = apiInstance.getRelations(type, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationsApi#getRelations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **BigDecimal**|  | [optional]
 **name** | **String**|  | [optional]

### Return type

[**List&lt;GetRelation&gt;**](GetRelation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRelation"></a>
# **updateRelation**
> Item updateRelation(id)



Update relation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RelationsApi;


RelationsApi apiInstance = new RelationsApi();
Long id = 789L; // Long | ID of relation to fetch
try {
    Item result = apiInstance.updateRelation(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationsApi#updateRelation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of relation to fetch |

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

