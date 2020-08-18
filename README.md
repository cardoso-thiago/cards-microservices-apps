---
title: Mastertech v1.0
language_tabs:
  - http: HTTP
language_clients:
  - http: ""
toc_footers: []
includes: []
search: false
highlight_theme: darkula
headingLevel: 2

---

<!-- Generator: Widdershins v4.0.1 -->

<h1 id="mastertech">Mastertech v1.0</h1>


# Introdução
API para o sistema de cartões

# Overview
Sistema de testes criado no curso da Mastertech

Base URLs:

* <a href="http://localhost:8081">http://localhost:8081</a>

* <a href="http://localhost:8080">http://localhost:8080</a>

* <a href="http://localhost:8082">http://localhost:8082</a>

* <a href="http://localhost:8083/fatura">http://localhost:8083/fatura</a>

<h1 id="mastertech-misc">Misc</h1>

## Get All Customers

<a id="opIdGetAllCustomers"></a>

> Code samples

```http
GET http://localhost:8081/cliente HTTP/1.1
Host: localhost:8081

```

`GET /cliente`

Request para obter todos os clientes.

<h3 id="get-all-customers-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Customer Wrong Validation

<a id="opIdPostCustomerWrongValidation"></a>

> Code samples

```http
POST http://localhost:8081/cliente HTTP/1.1
Host: localhost:8081
Content-Type: application/json

```

`POST /cliente`

Request para criar um novo cliente, deve dar erro de validação do campo.

> Body parameter

```json
{
  "nome": ""
}
```

<h3 id="post-customer-wrong-validation-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[PostCustomerWrongValidationRequest](#schemapostcustomerwrongvalidationrequest)|true|none|

<h3 id="post-customer-wrong-validation-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Customer by id Wrong Validation

<a id="opIdGetCustomerbyidWrongValidation"></a>

> Code samples

```http
GET http://localhost:8081/cliente/X HTTP/1.1
Host: localhost:8081

```

`GET /cliente/X`

Request para obter um cliente pelo id, deve dar erro de validação do campo.

<h3 id="get-customer-by-id-wrong-validation-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Customer by id Not Exists

<a id="opIdGetCustomerbyidNotExists"></a>

> Code samples

```http
GET http://localhost:8081/cliente/123456789 HTTP/1.1
Host: localhost:8081

```

`GET /cliente/123456789`

Request para obter um cliente que não existe. Deve retornar mensagem informativa.

<h3 id="get-customer-by-id-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Customer by id

<a id="opIdGetCustomerbyid"></a>

> Code samples

```http
GET http://localhost:8081/cliente/3 HTTP/1.1
Host: localhost:8081

```

`GET /cliente/3`

Request para obter um cliente por id.

<h3 id="get-customer-by-id-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get All Cards

<a id="opIdGetAllCards"></a>

> Code samples

```http
GET http://localhost:8081/cartao HTTP/1.1
Host: localhost:8081

```

`GET /cartao`

Request para obter todos os cartões cadastrados.

<h3 id="get-all-cards-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Card

<a id="opIdPostCard"></a>

> Code samples

```http
POST http://localhost:8081/cartao HTTP/1.1
Host: localhost:8081
Content-Type: application/json

```

`POST /cartao`

Request para criar um novo cartão associado a um cliente que existe.

> Body parameter

```json
{
  "numero": "112358132134",
  "clienteId": 3
}
```

<h3 id="post-card-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[PostCardRequest](#schemapostcardrequest)|true|none|

<h3 id="post-card-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Card by id  Wrong Validation

<a id="opIdGetCardbyidWrongValidation"></a>

> Code samples

```http
GET http://localhost:8081/cartao/id/X HTTP/1.1
Host: localhost:8081

```

`GET /cartao/id/X`

Request para obter o cartão pelo id. Deve retornar erro de validação do campo.

<h3 id="get-card-by-id--wrong-validation-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Card by id Not Exists

<a id="opIdGetCardbyidNotExists"></a>

> Code samples

```http
GET http://localhost:8081/cartao/id/123456 HTTP/1.1
Host: localhost:8081

```

`GET /cartao/id/123456`

Request para obter o cartão pelo id. Deve retornar que o cartão não existe.

<h3 id="get-card-by-id-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Card by id

<a id="opIdGetCardbyid"></a>

> Code samples

```http
GET http://localhost:8081/cartao/id/1 HTTP/1.1
Host: localhost:8081

```

`GET /cartao/id/1`

Request para obter o cartão pelo id.

<h3 id="get-card-by-id-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Card by id Created

<a id="opIdGetCardbyidCreated"></a>

> Code samples

```http
GET http://localhost:8081/cartao/id/3 HTTP/1.1
Host: localhost:8081

```

`GET /cartao/id/3`

Request para obter o cartão pelo id recém criado.

<h3 id="get-card-by-id-created-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Payment Deactivated Error

<a id="opIdPostPaymentDeactivatedError"></a>

> Code samples

```http
POST http://localhost:8081/pagamento HTTP/1.1
Host: localhost:8081
Content-Type: application/json

```

`POST /pagamento`

Request para criar um pagamento no cartão. Deve retornar informando que o cartão está desativado.

> Body parameter

```json
{
  "cartao_id": 3,
  "descricao": "Compra de Cerveja",
  "valor": 10.5
}
```

<h3 id="post-payment-deactivated-zuulError-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[PostPaymentDeactivatedErrorRequest](#schemapostpaymentdeactivatederrorrequest)|true|none|

<h3 id="post-payment-deactivated-zuulError-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Patch Card Activation

<a id="opIdPatchCardActivation"></a>

> Code samples

```http
PATCH http://localhost:8081/cartao/112358132134 HTTP/1.1
Host: localhost:8081
Content-Type: application/json

```

`PATCH /cartao/112358132134`

Request para ativar um cartão.

> Body parameter

```json
{
  "ativo": true
}
```

<h3 id="patch-card-activation-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[PatchCardActivationRequest](#schemapatchcardactivationrequest)|true|none|

<h3 id="patch-card-activation-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Card by number

<a id="opIdGetCardbynumber"></a>

> Code samples

```http
GET http://localhost:8081/cartao/112358132134 HTTP/1.1
Host: localhost:8081

```

`GET /cartao/112358132134`

Request para obter um cartão pelo número.

<h3 id="get-card-by-number-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Card by number Not Exists

<a id="opIdGetCardbynumberNotExists"></a>

> Code samples

```http
GET http://localhost:8081/cartao/123456789101212 HTTP/1.1
Host: localhost:8081

```

`GET /cartao/123456789101212`

Request para obter um cartão pelo número. Deve retornar informando que o cartão não existe.

<h3 id="get-card-by-number-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Invoice  Wrong Validation

<a id="opIdGetInvoiceWrongValidation"></a>

> Code samples

```http
GET http://localhost:8081/X/3 HTTP/1.1
Host: localhost:8081

```

`GET /X/3`

Request para obter a fatura. Deve retornar erro de validação do campo.

<h3 id="get-invoice--wrong-validation-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Invoice Customer Not Exists

<a id="opIdGetInvoiceCustomerNotExists"></a>

> Code samples

```http
GET http://localhost:8081/123456/3 HTTP/1.1
Host: localhost:8081

```

`GET /123456/3`

Request para obter a fatura. Deve retornar que o cliente não existe.

<h3 id="get-invoice-customer-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Invoice Card Not Exists

<a id="opIdGetInvoiceCardNotExists"></a>

> Code samples

```http
GET http://localhost:8081/3/123456 HTTP/1.1
Host: localhost:8081

```

`GET /3/123456`

Request para obter a fatura. Deve retornar que o cartão não existe.

<h3 id="get-invoice-card-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Invoice

<a id="opIdGetInvoice"></a>

> Code samples

```http
GET http://localhost:8081/3/3 HTTP/1.1
Host: localhost:8081

```

`GET /3/3`

Request para obter a fatura.

<h3 id="get-invoice-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Pay Invoice Wrong Validation

<a id="opIdPostPayInvoiceWrongValidation"></a>

> Code samples

```http
POST http://localhost:8081/X/3/pagar HTTP/1.1
Host: localhost:8081

```

`POST /X/3/pagar`

Request para pagar a fatura. Deve retornar erro de validação do campo.

<h3 id="post-pay-invoice-wrong-validation-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Pay Invoice Customer Not Exists

<a id="opIdPostPayInvoiceCustomerNotExists"></a>

> Code samples

```http
POST http://localhost:8081/123456/3/pagar HTTP/1.1
Host: localhost:8081

```

`POST /123456/3/pagar`

Request para pagar a fatura. Deve retornar informando que o cliente não existe.

<h3 id="post-pay-invoice-customer-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Pay Invoice Card Not Exists

<a id="opIdPostPayInvoiceCardNotExists"></a>

> Code samples

```http
POST http://localhost:8081/3/123456/pagar HTTP/1.1
Host: localhost:8081

```

`POST /3/123456/pagar`

Request para pagar a fatura. Deve retornar informando que o cartão não existe.

<h3 id="post-pay-invoice-card-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Pay Invoice

<a id="opIdPostPayInvoice"></a>

> Code samples

```http
POST http://localhost:8081/3/3/pagar HTTP/1.1
Host: localhost:8081

```

`POST /3/3/pagar`

Request para pagar a fatura.

<h3 id="post-pay-invoice-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Expire Card Wrong Validation

<a id="opIdPostExpireCardWrongValidation"></a>

> Code samples

```http
POST http://localhost:8081/X/3/expirar HTTP/1.1
Host: localhost:8081

```

`POST /X/3/expirar`

Request para expirar o cartão do cliente. Deve retornar erro de validação do campo.

<h3 id="post-expire-card-wrong-validation-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Expire Card Customer Not Exists

<a id="opIdPostExpireCardCustomerNotExists"></a>

> Code samples

```http
POST http://localhost:8081/123456/3/expirar HTTP/1.1
Host: localhost:8081

```

`POST /123456/3/expirar`

Request para expirar o cartão do cliente. Deve retornar que o cliente não existe.

<h3 id="post-expire-card-customer-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Expire Card Not Exists

<a id="opIdPostExpireCardNotExists"></a>

> Code samples

```http
POST http://localhost:8081/3/123456/expirar HTTP/1.1
Host: localhost:8081

```

`POST /3/123456/expirar`

Request para expirar o cartão do cliente. Deve retornar que o cartão não existe.

<h3 id="post-expire-card-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Expire Card

<a id="opIdPostExpireCard"></a>

> Code samples

```http
POST http://localhost:8081/3/3/expirar HTTP/1.1
Host: localhost:8081

```

`POST /3/3/expirar`

Request para expirar o cartão do cliente.

<h3 id="post-expire-card-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

# Schemas

<h2 id="tocS_PostCustomerWrongValidationRequest">PostCustomerWrongValidationRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostcustomerwrongvalidationrequest"></a>
<a id="schema_PostCustomerWrongValidationRequest"></a>
<a id="tocSpostcustomerwrongvalidationrequest"></a>
<a id="tocspostcustomerwrongvalidationrequest"></a>

```json
{
  "nome": ""
}

```

PostCustomerWrongValidationRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|nome|string|true|none|none|

<h2 id="tocS_PostCustomerRequest">PostCustomerRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostcustomerrequest"></a>
<a id="schema_PostCustomerRequest"></a>
<a id="tocSpostcustomerrequest"></a>
<a id="tocspostcustomerrequest"></a>

```json
{
  "nome": "Leonardo Fibonacci"
}

```

PostCustomerRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|nome|string|true|none|none|

<h2 id="tocS_PostCardRequest">PostCardRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostcardrequest"></a>
<a id="schema_PostCardRequest"></a>
<a id="tocSpostcardrequest"></a>
<a id="tocspostcardrequest"></a>

```json
{
  "numero": "112358132134",
  "clienteId": 3
}

```

PostCardRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|numero|string|true|none|none|
|clienteId|integer(int32)|true|none|none|

<h2 id="tocS_PostCardDuplicatedErrorRequest">PostCardDuplicatedErrorRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostcardduplicatederrorrequest"></a>
<a id="schema_PostCardDuplicatedErrorRequest"></a>
<a id="tocSpostcardduplicatederrorrequest"></a>
<a id="tocspostcardduplicatederrorrequest"></a>

```json
{
  "numero": "112358132134",
  "clienteId": 3
}

```

PostCardDuplicatedErrorRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|numero|string|true|none|none|
|clienteId|integer(int32)|true|none|none|

<h2 id="tocS_PostPaymentDeactivatedErrorRequest">PostPaymentDeactivatedErrorRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostpaymentdeactivatederrorrequest"></a>
<a id="schema_PostPaymentDeactivatedErrorRequest"></a>
<a id="tocSpostpaymentdeactivatederrorrequest"></a>
<a id="tocspostpaymentdeactivatederrorrequest"></a>

```json
{
  "cartao_id": 3,
  "descricao": "Compra de Cerveja",
  "valor": 10.5
}

```

PostPaymentDeactivatedErrorRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|cartao_id|integer(int32)|true|none|none|
|descricao|string|true|none|none|
|valor|number|true|none|none|

<h2 id="tocS_PatchCardActivationRequest">PatchCardActivationRequest</h2>
<!-- backwards compatibility -->
<a id="schemapatchcardactivationrequest"></a>
<a id="schema_PatchCardActivationRequest"></a>
<a id="tocSpatchcardactivationrequest"></a>
<a id="tocspatchcardactivationrequest"></a>

```json
{
  "ativo": true
}

```

PatchCardActivationRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|ativo|boolean|true|none|none|

<h2 id="tocS_PostPaymentWrongValidationsRequest">PostPaymentWrongValidationsRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostpaymentwrongvalidationsrequest"></a>
<a id="schema_PostPaymentWrongValidationsRequest"></a>
<a id="tocSpostpaymentwrongvalidationsrequest"></a>
<a id="tocspostpaymentwrongvalidationsrequest"></a>

```json
{
  "cartao_id": 3,
  "descricao": "",
  "valor": 0
}

```

PostPaymentWrongValidationsRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|cartao_id|integer(int32)|true|none|none|
|descricao|string|true|none|none|
|valor|integer(int32)|true|none|none|

<h2 id="tocS_PostPaymentCardNotExistsRequest">PostPaymentCardNotExistsRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostpaymentcardnotexistsrequest"></a>
<a id="schema_PostPaymentCardNotExistsRequest"></a>
<a id="tocSpostpaymentcardnotexistsrequest"></a>
<a id="tocspostpaymentcardnotexistsrequest"></a>

```json
{
  "cartao_id": 123456,
  "descricao": "Compra de Cerveja",
  "valor": 10.5
}

```

PostPaymentCardNotExistsRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|cartao_id|integer(int32)|true|none|none|
|descricao|string|true|none|none|
|valor|number|true|none|none|

<h2 id="tocS_PostPaymentRequest">PostPaymentRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostpaymentrequest"></a>
<a id="schema_PostPaymentRequest"></a>
<a id="tocSpostpaymentrequest"></a>
<a id="tocspostpaymentrequest"></a>

```json
{
  "cartao_id": 3,
  "descricao": "Compra de Cerveja",
  "valor": 10.5
}

```

PostPaymentRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|cartao_id|integer(int32)|true|none|none|
|descricao|string|true|none|none|
|valor|number|true|none|none|

<h2 id="tocS_PostPaymentExpiredErrorRequest">PostPaymentExpiredErrorRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostpaymentexpirederrorrequest"></a>
<a id="schema_PostPaymentExpiredErrorRequest"></a>
<a id="tocSpostpaymentexpirederrorrequest"></a>
<a id="tocspostpaymentexpirederrorrequest"></a>

```json
{
  "cartao_id": 3,
  "descricao": "Compra de Cerveja",
  "valor": 10.5
}

```

PostPaymentExpiredErrorRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|cartao_id|integer(int32)|true|none|none|
|descricao|string|true|none|none|
|valor|number|true|none|none|

