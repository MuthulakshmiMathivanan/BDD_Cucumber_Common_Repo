Feature: Rajasekar_15APR2025_API_Reqres

Scenario: fetch users from page 1
Given The Base URI is "https://reqres.in"
When I send GET request to "api/users" with query parameter "page=1"
Then The Respose Code Should be 200
And  The ID of the First User Name Should Be 1

