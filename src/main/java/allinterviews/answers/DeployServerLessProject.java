/*
Deploying a serverless project involves using a cloud platform or
service like AWS Lambda, Azure Functions, or Google Cloud Functions.
Here is a general guide to deploying a serverless project:

        1. Choose Your Cloud Provider

Popular options include:
AWS Lambda (with API Gateway, DynamoDB, etc.)
Azure Functions (with Azure Blob Storage, Event Hub, etc.)
Google Cloud Functions (with Pub/Sub, Firestore, etc.)
2. Prepare Your Serverless Project
Write your serverless function in the language supported by your
cloud provider (e.g., JavaScript, Python, Java, C#, etc.).
Ensure your function meets the cloud provider's
requirements (e.g., entry point, handler signature).

using Azure :

Create a Function App Locally:

Use the Azure Functions Core Tools:

npm install -g azure-functions-core-tools@4 --unsafe-perm true
func init myFunctionApp --worker-runtime node
cd myFunctionApp
func new
Choose a template for your function (e.g., HTTP trigger).
Deploy to Azure:

Log in to Azure:

az login
Create a Function App in Azure:

az functionapp create --name <app-name> --storage-account <storage-account> --resource-group <resource-group> --consumption-plan-location <region>
Deploy:

func azure functionapp publish <app-name>
Verify:

Access the URL in the Azure portal or the output of the publish command.*/
