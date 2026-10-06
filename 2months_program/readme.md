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

SDLC-agile:
        --time box based iterative approch software development

  -Donot develop entire project in one go.
  -rather break it down into smaller timeframes
  -in each time frame,decide which geatures you want to work upon.
  -perform all actions to fully complete these features.
  -once done , give a demo to the business.
  -once approved ,plan to PROD.
  -if improvement needed ,include in the next working cycle.
  -software is being developed incrementally. Features are being deployed in production incrementally.


  --Its good for business,good for employees, good for tech company good for end customer

                -- jeera:tool for software development and team coordination
                