Feature: Rajasekar_15APR2025_API_Reqres

Scenario: fetch users from page 7
Given The API is running
When I send GET request with end ponit "api/users?page=7"
Then The response status code should be 200