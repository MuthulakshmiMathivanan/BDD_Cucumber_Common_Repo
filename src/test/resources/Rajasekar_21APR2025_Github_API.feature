Feature: GitHub Repository CRUD via REST Assured

Scenario: Create, update, delete, and verify a GitHub repo

Given I set the GitHub API base URI
When I create a GitHub repository with name "bdd-github-automation" and description "Initial test repo"
Then I should get status code 201
And I store the repository name

When I update the repository description to "Updated via REST Assured"
Then I should get status code 200

When I get the repository detail
Then I should see the updated description "Updated via REST Assured"

When I delete the repository
Then I should get status code 204

When I try to get the repository again
Then I should get status code 404







