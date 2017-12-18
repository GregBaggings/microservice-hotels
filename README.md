# Hotels module for my Hotel application

This module stores and gives back a list of hotels. This data will be consumed by the the other services and the planned native application in a later stage.

## Database:  
Table **hotels**

Name | Type 
------------ | -------------
id | int NOT NULL IDENTITY
name | varchar(50)
roomname | varchar(50)
country | varchar(50)
city | varchar(50)
address | varchar(100)
lat | decimal(9,6)
lon | decimal(9,6)
minprice | int

### Endpoints:  

#### List Hotels with their details

***Endpoint:*** {host}/v1/hotels

***Example:*** http://localhost:2221/v1/hotels

#### List a certain hotel with its short details by its name
***Endpoint:*** {host}/v1/hotels/hotel  

Params | Type  
------------ | -------------   
name | string   

***Example:*** http://localhost:2221/v1/hotels/hotel?name=Hotel1

#### List a certain hotel with its short details by its id
***Endpoint:*** {host}/v1/hotels/hotel  

Params | Type  
------------ | -------------   
id | int   

***Example:*** http://localhost:2221/v1/hotels/hotel?id=1


#### List hotels for a given destination
***Endpoint:*** /v1/hotels/{city}  

Params | Type  
------------ | -------------   
city | string   

***Example:*** http://localhost:2221/v1/hotels/hotels/Budapest

