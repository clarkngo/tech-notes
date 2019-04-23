# RDS
- default is 40 DB instances 

# S3
- restrict access
  - Set S3 bucket policy

# EC2 
- able to place instances in multiple locations
- reserved Instances
  - fixed region

# Route 53
- provide scalable DNS


# [DevOps](https://aws.amazon.com/devops/)
## Continuous Integration and Continuous Delivery
- ### CodePipeline
  - CI/CD service
  - software release workflows

- ### CodeBuild
  - build and test code
  - build service that compiles source code, runs tests, and produces software packages that are ready to deploy.

- ### CodeDeploy
  - deployment automation
  - automates code deployment

- ### CodeStar
  - unified CI/CD projects
  - develop, build, and deploy apps in AWS.
  - unified user interface.

## Microservices
-  ### Elastic Container Service (ECS)
   - production docker platform
   - highly scable, high performance container management service that supports Docker contianers.
- ### Lambda
   - serverless computing
   - run code without managing servers

## Infrastructure as Code
- ### CloudFormation
  - create and manage a collection of related AWS resources
  - sample template of CloudFormation is available for own use
- ### OpsWorks
  - configuration management service that uses Chef, an automation platform that treats server configurations as code.
  - two offerings:
    - Opsworks for Chef Automate
    - OpsWorks Stacks
- ### Systems Manager
  - management service that helps you automatically collect software inventory, apply OS patches, create system images, and configure Windows and Linux operating systems.
- ### Config
  - managed service that provides you with an AWS resource  inventory, configuration history, and configuration change notifications.

## Monitoring and Logging
- ### CloudWatch
  - monitoring service for AWS cloud resources.
- ### X-Ray
  - helps developers analyze and debug production, distributed applications.
  - understand how application and its underlying services are performing to identify and troubleshoot the root cause of performance issues and errors.
- ### CloudTrail
  - web service that records AWS API calls for your account and delivers log files to you.

## Version Control
- ### CodeCommit
  - private Git hosting.
  - managed source control service that makes it easy for companies to host secure and highly scalable private Git repositories.

## Platform as a Service
- ### Elastic Beanstalk