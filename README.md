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
