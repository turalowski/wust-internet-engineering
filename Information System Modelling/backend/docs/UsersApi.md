# UsersApi

All URIs are relative to *https://localhost:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUser**](UsersApi.md#addUser) | **POST** /users | 
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /users/{id} | 
[**getUser**](UsersApi.md#getUser) | **GET** /users/{id} | 
[**getUsers**](UsersApi.md#getUsers) | **GET** /users | 
[**updateUser**](UsersApi.md#updateUser) | **PUT** /users/{id} | 

<a name="addUser"></a>
# **addUser**
> NewItem addUser(body)



Creates a new user. Duplicates are not allowed

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
AddUser body = new AddUser(); // AddUser | Add user
try {
    NewItem result = apiInstance.addUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#addUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddUser**](AddUser.md)| Add user |

### Return type

[**NewItem**](NewItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUser"></a>
# **deleteUser**
> Item deleteUser(id)



deletes a single user based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Long id = 789L; // Long | ID of user to delete
try {
    Item result = apiInstance.deleteUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of user to delete |

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> GetUser getUser(id)



This endpoints are related with the Users model of the application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Long id = 789L; // Long | ID of user to fetch
try {
    GetUser result = apiInstance.getUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of user to fetch |

### Return type

[**GetUser**](GetUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsers"></a>
# **getUsers**
> List&lt;GetUser&gt; getUsers(email, fullName, companyName, employeeCount)



This endpoint returns all Users from the database.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String email = "email_example"; // String | 
String fullName = "fullName_example"; // String | 
String companyName = "companyName_example"; // String | 
BigDecimal employeeCount = new BigDecimal(); // BigDecimal | 
try {
    List<GetUser> result = apiInstance.getUsers(email, fullName, companyName, employeeCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  | [optional]
 **fullName** | **String**|  | [optional]
 **companyName** | **String**|  | [optional]
 **employeeCount** | **BigDecimal**|  | [optional]

### Return type

[**List&lt;GetUser&gt;**](GetUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> Item updateUser(id)



Update user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Long id = 789L; // Long | ID of user to fetch
try {
    Item result = apiInstance.updateUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of user to fetch |

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

