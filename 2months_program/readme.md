we will build 2 microservices
payment -validation-service(spring boot App)
        -- all incoming request from merchant should be validated here.
        --Field & Business validation
        --spring security & hmac5HA256 algo


stripe-provider-service(spring boot App)
        --whatever code needed to interact with external stripe system
        --stripe API integration code
        --stripe webhook/notification processsing
        --implement security changes to call/invoke stripe APIs



PIS--payment intigration system
merchant system
end customer
API-application programming interface


mvp-minimum viable product


