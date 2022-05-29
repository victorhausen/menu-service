#!/bin/bash

#echo "installing jq"
#apk update && apk add --no-cache jq

echo "configure aws"
aws configure set region "us-east-1"
aws configure set aws_access_key_id "FAKE"
aws configure set aws_secret_access_key "FAKE"

echo "setting up sns sqs"

################# SYMBOLIC RETURN INVOICE #################
EXEMPLE_TOPIC_NAME="exemple_object__created"

#SNS
EXEMPLE_TOPIC_ARN=$(aws --endpoint-url http://localhost:4566 sns create-topic --output text --name "$EXEMPLE_TOPIC_NAME")
echo "TOPIC: ${EXEMPLE_TOPIC_ARN}"

#SQS
EXEMPLE_QUEUE_URL=$(aws --endpoint-url http://localhost:4566 sqs create-queue --queue-name "$EXEMPLE_QUEUE_NAME" --output text)
echo "URL: ${EXEMPLE_QUEUE_URL}"


################# HEALTH #################
aws --endpoint-url http://localhost:4566 sns list-subscriptions
curl http://localhost:4566/health