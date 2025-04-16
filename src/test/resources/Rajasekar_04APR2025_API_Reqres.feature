Feature: Validate ReqRes API Users Endpoint

Scenario: fetch users from page 7
Given The Base URI is "https://reqres.in"
When I send GET request to "api/users" with query parameter "page=7"
Then The Respose Code Should be 200
And  The ID of the First User Name Should Be 7

