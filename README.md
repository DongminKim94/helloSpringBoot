1. 데이터베이스 스키마 및 테이블 생성(테이블은 어플리케이션 실행 후 데이터베이스에 자동 생성됨)

![image-20200613201645810](https://user-images.githubusercontent.com/42930502/84573527-fe0e1400-addb-11ea-836e-b164098f304d.png)



2. data.sql를 이용하여 미리 10개 이상의 Product 생성(어플리케이션 실행 후 데이터베이스에 자동 저장 됨)

![image-20200613201751319](https://user-images.githubusercontent.com/42930502/84573545-31e93980-addc-11ea-8151-1761e9641af4.png)



![image-20200613201923828](https://user-images.githubusercontent.com/42930502/84573550-39a8de00-addc-11ea-9045-d53391f3e180.png)



3. Postman을 활용하여 API 요청 및 응답 메시지 확인



- Create/Add(POST) : create new product(POST http://localhost:9090/api/v1/products)

![image-20200613205514394](https://user-images.githubusercontent.com/42930502/84573556-41688280-addc-11ea-8a44-168e617891e0.png)

Postman을 이용해 Create 요청

![image-20200613210314366](https://user-images.githubusercontent.com/42930502/84573559-46c5cd00-addc-11ea-9736-aaa6e729495b.png)

MySQL을 통해 테이블에 추가된 내용을 확인

![image-20200613210441178](https://user-images.githubusercontent.com/42930502/84573561-4af1ea80-addc-11ea-988f-a804ece69d8b.png)



- Retrieve/Get (GET):Get full list of products(GET http://localhost: 9090/api/v1/products)

![image-20200613212849097](https://user-images.githubusercontent.com/42930502/84573570-5ba26080-addc-11ea-92ed-f8212a635013.png)

Postman을 이용해 모든 제품 리스트 받아오기

![image-20200613211223463](https://user-images.githubusercontent.com/42930502/84573572-60ffab00-addc-11ea-8480-50a87cbce2de.png)

![image-20200613212713018](https://user-images.githubusercontent.com/42930502/84573576-652bc880-addc-11ea-839c-77efd9e96064.png)



- Retrieve/Get (GET):Get details of products with id=N(GET http://localhost:8080/api/v1/products/{id})

![image-20200613213009644](https://user-images.githubusercontent.com/42930502/84573584-6eb53080-addc-11ea-896c-879bd07f3095.png)

Postman을 이용해 id가 2인 제품 받아오기

![image-20200613212955056](https://user-images.githubusercontent.com/42930502/84573586-7543a800-addc-11ea-918f-599cc53b519c.png)



- Fetch all products of a category(GET http://localhost:9090/api/v1/products/category/{category})

![image-20200613213515388](https://user-images.githubusercontent.com/42930502/84573592-7bd21f80-addc-11ea-9142-5defd0cd32b5.png)

Postman을 이용하여 각 category별로 제품 리스트 받아오기

category : home_appliance

![image-20200613213737629](https://user-images.githubusercontent.com/42930502/84573602-8987a500-addc-11ea-811f-302a741cbe27.png)

category : computer

![image-20200613213657272](https://user-images.githubusercontent.com/42930502/84573606-8ee4ef80-addc-11ea-9f4f-e3a23b750ee2.png)

category:general_merchandise

![image-20200613213838298](https://user-images.githubusercontent.com/42930502/84573609-93a9a380-addc-11ea-9ae1-0ed0b48683a5.png)



- Update (PUT): modify values of product with id=N(PUT http://localhost: 9090/api/v1/products/{id})

![image-20200613214238210](https://user-images.githubusercontent.com/42930502/84573613-986e5780-addc-11ea-8162-c07c84648ff4.png)

Postman을 이용해 id가 11인 제품 update

![image-20200613214725320](https://user-images.githubusercontent.com/42930502/84573614-9ad0b180-addc-11ea-9d6a-db05280f2341.png)

MySQL을 통해 id가 11인 제품 update 내용 확인

![image-20200613214807780](https://user-images.githubusercontent.com/42930502/84573616-9d330b80-addc-11ea-9573-bb42075932b9.png)



- Delete (DELETE): delete product with id=N(DELETE http://localhost:9090/api/v1/products/{id}

![image-20200613215018395](https://user-images.githubusercontent.com/42930502/84573620-a4f2b000-addc-11ea-9041-89992846ef3c.png)

Postman을 통해 id가 5인 제품 delete하기

![image-20200613223831222](https://user-images.githubusercontent.com/42930502/84573623-a8863700-addc-11ea-960e-4afb136adac0.png)

MySQL을 통해 id가 5인 제품 delete 확인하기

![image-20200613223718248](https://user-images.githubusercontent.com/42930502/84573628-ae7c1800-addc-11ea-80b5-1a25f495dccf.png)



4. Spring Boot의 actuator를 활용하여 Products REST API에 대한 URL Mapping 정보 스크린샷

actuator 활용을 위한 dependency 추가

![image-20200613225111296](https://user-images.githubusercontent.com/42930502/84573630-b20f9f00-addc-11ea-9ca6-5d0b9848e6ff.png)

모든 endpoints 확인을 위해 와일드카드로 설정

![image-20200613225418594](https://user-images.githubusercontent.com/42930502/84573633-b50a8f80-addc-11ea-85e6-bd746d7b8628.png)

actuator/mappings 확인 및 URL Mapping 정보

![image-20200613231845589](https://user-images.githubusercontent.com/42930502/84573642-bfc52480-addc-11ea-9893-709b23bdbbab.png)

![image-20200613231857425](https://user-images.githubusercontent.com/42930502/84573645-c6ec3280-addc-11ea-91b0-a963066c7cba.png)

![image-20200613231907904](https://user-images.githubusercontent.com/42930502/84573649-ca7fb980-addc-11ea-92e9-483e08e5500a.png)



![image-20200613231929697](https://user-images.githubusercontent.com/42930502/84573650-cd7aaa00-addc-11ea-82c5-97b4981c19c2.png)

![image-20200613231947052](https://user-images.githubusercontent.com/42930502/84573652-d10e3100-addc-11ea-9fd5-441638fddf6b.png)

![image-20200613232003520](https://user-images.githubusercontent.com/42930502/84573653-d4092180-addc-11ea-9465-922e930af587.png)



![image-20200613232031628](https://user-images.githubusercontent.com/42930502/84573656-d66b7b80-addc-11ea-9b97-56e4f6fc72b5.png)

actuator/mappings 전체 내용

```
{"contexts":{"application":{"mappings":{"dispatcherServlets":{"dispatcherServlet":[{"handler":"Actuator web endpoint 'beans'","predicate":"{GET /actuator/beans, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/beans"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'caches-cache'","predicate":"{GET /actuator/caches/{cache}, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/caches/{cache}"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'caches'","predicate":"{GET /actuator/caches, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/caches"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'caches-cache'","predicate":"{DELETE /actuator/caches/{cache}, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["DELETE"],"params":[],"patterns":["/actuator/caches/{cache}"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'caches'","predicate":"{DELETE /actuator/caches}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["DELETE"],"params":[],"patterns":["/actuator/caches"],"produces":[]}}},{"handler":"Actuator web endpoint 'health-path'","predicate":"{GET /actuator/health/**, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/health/**"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'health'","predicate":"{GET /actuator/health, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/health"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'info'","predicate":"{GET /actuator/info, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/info"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'conditions'","predicate":"{GET /actuator/conditions, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/conditions"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'configprops'","predicate":"{GET /actuator/configprops, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/configprops"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'env'","predicate":"{GET /actuator/env, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/env"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'env-toMatch'","predicate":"{GET /actuator/env/{toMatch}, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/env/{toMatch}"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'loggers'","predicate":"{GET /actuator/loggers, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/loggers"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'loggers-name'","predicate":"{POST /actuator/loggers/{name}, consumes [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}],"headers":[],"methods":["POST"],"params":[],"patterns":["/actuator/loggers/{name}"],"produces":[]}}},{"handler":"Actuator web endpoint 'loggers-name'","predicate":"{GET /actuator/loggers/{name}, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/loggers/{name}"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'heapdump'","predicate":"{GET /actuator/heapdump, produces [application/octet-stream]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/heapdump"],"produces":[{"mediaType":"application/octet-stream","negated":false}]}}},{"handler":"Actuator web endpoint 'threaddump'","predicate":"{GET /actuator/threaddump, produces [text/plain;charset=UTF-8]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/threaddump"],"produces":[{"mediaType":"text/plain;charset=UTF-8","negated":false}]}}},{"handler":"Actuator web endpoint 'threaddump'","predicate":"{GET /actuator/threaddump, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/threaddump"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'metrics-requiredMetricName'","predicate":"{GET /actuator/metrics/{requiredMetricName}, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/metrics/{requiredMetricName}"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'metrics'","predicate":"{GET /actuator/metrics, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/metrics"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'scheduledtasks'","predicate":"{GET /actuator/scheduledtasks, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/scheduledtasks"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator web endpoint 'mappings'","predicate":"{GET /actuator/mappings, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler","name":"handle","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator/mappings"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"Actuator root web endpoint","predicate":"{GET /actuator, produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}","details":{"handlerMethod":{"className":"org.springframework.boot.actuate.endpoint.web.servlet.WebMvcEndpointHandlerMapping.WebMvcLinksHandler","name":"links","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)Ljava/util/Map;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/actuator"],"produces":[{"mediaType":"application/vnd.spring-boot.actuator.v3+json","negated":false},{"mediaType":"application/vnd.spring-boot.actuator.v2+json","negated":false},{"mediaType":"application/json","negated":false}]}}},{"handler":"kr.ac.hansung.cse.controller.HomeController#home(Model)","predicate":"{GET /}","details":{"handlerMethod":{"className":"kr.ac.hansung.cse.controller.HomeController","name":"home","descriptor":"(Lorg/springframework/ui/Model;)Ljava/lang/String;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/"],"produces":[]}}},{"handler":"kr.ac.hansung.cse.controller.ProductController#postProduct(Product)","predicate":"{POST /api/v1/products}","details":{"handlerMethod":{"className":"kr.ac.hansung.cse.controller.ProductController","name":"postProduct","descriptor":"(Lkr/ac/hansung/cse/model/Product;)Lorg/springframework/http/ResponseEntity;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["POST"],"params":[],"patterns":["/api/v1/products"],"produces":[]}}},{"handler":"kr.ac.hansung.cse.controller.ProductController#deleteProduct(int)","predicate":"{DELETE /api/v1/products/{id}}","details":{"handlerMethod":{"className":"kr.ac.hansung.cse.controller.ProductController","name":"deleteProduct","descriptor":"(I)Lorg/springframework/http/ResponseEntity;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["DELETE"],"params":[],"patterns":["/api/v1/products/{id}"],"produces":[]}}},{"handler":"kr.ac.hansung.cse.controller.ProductController#updateProduct(int, Product)","predicate":"{PUT /api/v1/products/{id}}","details":{"handlerMethod":{"className":"kr.ac.hansung.cse.controller.ProductController","name":"updateProduct","descriptor":"(ILkr/ac/hansung/cse/model/Product;)Lorg/springframework/http/ResponseEntity;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["PUT"],"params":[],"patterns":["/api/v1/products/{id}"],"produces":[]}}},{"handler":"kr.ac.hansung.cse.controller.ProductController#getAllProducts()","predicate":"{GET /api/v1/products}","details":{"handlerMethod":{"className":"kr.ac.hansung.cse.controller.ProductController","name":"getAllProducts","descriptor":"()Lorg/springframework/http/ResponseEntity;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/api/v1/products"],"produces":[]}}},{"handler":"kr.ac.hansung.cse.controller.ProductController#getProductById(int)","predicate":"{GET /api/v1/products/{id}}","details":{"handlerMethod":{"className":"kr.ac.hansung.cse.controller.ProductController","name":"getProductById","descriptor":"(I)Lorg/springframework/http/ResponseEntity;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/api/v1/products/{id}"],"produces":[]}}},{"handler":"kr.ac.hansung.cse.controller.ProductController#fingByCategory(String)","predicate":"{GET /api/v1/products/category/{category}}","details":{"handlerMethod":{"className":"kr.ac.hansung.cse.controller.ProductController","name":"fingByCategory","descriptor":"(Ljava/lang/String;)Lorg/springframework/http/ResponseEntity;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":["GET"],"params":[],"patterns":["/api/v1/products/category/{category}"],"produces":[]}}},{"handler":"org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)","predicate":"{ /error}","details":{"handlerMethod":{"className":"org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController","name":"error","descriptor":"(Ljavax/servlet/http/HttpServletRequest;)Lorg/springframework/http/ResponseEntity;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":[],"params":[],"patterns":["/error"],"produces":[]}}},{"handler":"org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#errorHtml(HttpServletRequest, HttpServletResponse)","predicate":"{ /error, produces [text/html]}","details":{"handlerMethod":{"className":"org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController","name":"errorHtml","descriptor":"(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)Lorg/springframework/web/servlet/ModelAndView;"},"requestMappingConditions":{"consumes":[],"headers":[],"methods":[],"params":[],"patterns":["/error"],"produces":[{"mediaType":"text/html","negated":false}]}}},{"handler":"ResourceHttpRequestHandler [\"classpath:/META-INF/resources/webjars/\"]","predicate":"/webjars/**","details":null},{"handler":"ResourceHttpRequestHandler [\"classpath:/META-INF/resources/\", \"classpath:/resources/\", \"classpath:/static/\", \"classpath:/public/\", \"/\"]","predicate":"/**","details":null}]},"servletFilters":[{"servletNameMappings":[],"urlPatternMappings":["/*"],"name":"webMvcMetricsFilter","className":"org.springframework.boot.actuate.metrics.web.servlet.WebMvcMetricsFilter"},{"servletNameMappings":[],"urlPatternMappings":["/*"],"name":"requestContextFilter","className":"org.springframework.boot.web.servlet.filter.OrderedRequestContextFilter"},{"servletNameMappings":[],"urlPatternMappings":["/*"],"name":"Tomcat WebSocket (JSR356) Filter","className":"org.apache.tomcat.websocket.server.WsFilter"},{"servletNameMappings":[],"urlPatternMappings":["/*"],"name":"characterEncodingFilter","className":"org.springframework.boot.web.servlet.filter.OrderedCharacterEncodingFilter"},{"servletNameMappings":[],"urlPatternMappings":["/*"],"name":"formContentFilter","className":"org.springframework.boot.web.servlet.filter.OrderedFormContentFilter"}],"servlets":[{"mappings":[],"name":"default","className":"org.apache.catalina.servlets.DefaultServlet"},{"mappings":["/"],"name":"dispatcherServlet","className":"org.springframework.web.servlet.DispatcherServlet"}]},"parentId":null}}}
```



actuator/info 확인

![image-20200613231313406](https://user-images.githubusercontent.com/42930502/84573664-e08d7a00-addc-11ea-934e-52aba5ba6d0d.png)

actuator/health 확인

![image-20200613231332071](https://user-images.githubusercontent.com/42930502/84573670-e8e5b500-addc-11ea-8dc0-9eb274500f5a.png)

actuator/beans 확인

![image-20200613231247012](https://user-images.githubusercontent.com/42930502/84573676-f3a04a00-addc-11ea-95f2-111eafd75dc2.png)

