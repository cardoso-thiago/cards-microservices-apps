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

## Get All Clientes

<a id="opIdGetAllClientes"></a>

> Code samples

```http
GET http://localhost:8081/cliente HTTP/1.1
Host: localhost:8081

```

`GET /cliente`

<h3 id="get-all-clientes-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Cliente Error Validation

<a id="opIdPostClienteErrorValidation"></a>

> Code samples

```http
POST http://localhost:8081/cliente HTTP/1.1
Host: localhost:8081
Content-Type: application/json

```

`POST /cliente`

> Body parameter

```json
{
  "nome": ""
}
```

<h3 id="post-cliente-error-validation-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[PostClienteErrorValidationRequest](#schemapostclienteerrorvalidationrequest)|true|none|

<h3 id="post-cliente-error-validation-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Cliente por ID Wrong Validation

<a id="opIdGetClienteporIDWrongValidation"></a>

> Code samples

```http
GET http://localhost:8081/cliente/X HTTP/1.1
Host: localhost:8081

```

`GET /cliente/X`

<h3 id="get-cliente-por-id-wrong-validation-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Cliente por ID Not Exists

<a id="opIdGetClienteporIDNotExists"></a>

> Code samples

```http
GET http://localhost:8081/cliente/123456789 HTTP/1.1
Host: localhost:8081

```

`GET /cliente/123456789`

<h3 id="get-cliente-por-id-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Cliente por ID

<a id="opIdGetClienteporID"></a>

> Code samples

```http
GET http://localhost:8081/cliente/3 HTTP/1.1
Host: localhost:8081

```

`GET /cliente/3`

<h3 id="get-cliente-por-id-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get All Cartoes

<a id="opIdGetAllCartoes"></a>

> Code samples

```http
GET http://localhost:8081/cartao HTTP/1.1
Host: localhost:8081

```

`GET /cartao`

<h3 id="get-all-cartoes-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Cartao

<a id="opIdPostCartao"></a>

> Code samples

```http
POST http://localhost:8081/cartao HTTP/1.1
Host: localhost:8081
Content-Type: application/json

```

`POST /cartao`

> Body parameter

```json
{
  "numero": "112358132134",
  "clienteId": 3
}
```

<h3 id="post-cartao-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[PostCartaoRequest](#schemapostcartaorequest)|true|none|

<h3 id="post-cartao-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Cartão By Id Wrong Validation

<a id="opIdGetCartãoByIdWrongValidation"></a>

> Code samples

```http
GET http://localhost:8081/cartao/id/X HTTP/1.1
Host: localhost:8081

```

`GET /cartao/id/X`

<h3 id="get-cartão-by-id-wrong-validation-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Cartão By Id Not Exists

<a id="opIdGetCartãoByIdNotExists"></a>

> Code samples

```http
GET http://localhost:8081/cartao/id/123456 HTTP/1.1
Host: localhost:8081

```

`GET /cartao/id/123456`

<h3 id="get-cartão-by-id-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Cartão By Id

<a id="opIdGetCartãoById"></a>

> Code samples

```http
GET http://localhost:8081/cartao/id/1 HTTP/1.1
Host: localhost:8081

```

`GET /cartao/id/1`

<h3 id="get-cartão-by-id-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Cartão By Id Created

<a id="opIdGetCartãoByIdCreated"></a>

> Code samples

```http
GET http://localhost:8081/cartao/id/3 HTTP/1.1
Host: localhost:8081

```

`GET /cartao/id/3`

<h3 id="get-cartão-by-id-created-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Pagamento Falha Desativado

<a id="opIdPostPagamentoFalhaDesativado"></a>

> Code samples

```http
POST http://localhost:8081/pagamento HTTP/1.1
Host: localhost:8081
Content-Type: application/json

```

`POST /pagamento`

> Body parameter

```json
{
  "cartao_id": 3,
  "descricao": "Compra de Cerveja",
  "valor": 10.5
}
```

<h3 id="post-pagamento-falha-desativado-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[PostPagamentoFalhaDesativadoRequest](#schemapostpagamentofalhadesativadorequest)|true|none|

<h3 id="post-pagamento-falha-desativado-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Patch Ativa Cartao

<a id="opIdPatchAtivaCartao"></a>

> Code samples

```http
PATCH http://localhost:8081/cartao/112358132134 HTTP/1.1
Host: localhost:8081
Content-Type: application/json

```

`PATCH /cartao/112358132134`

> Body parameter

```json
{
  "ativo": true
}
```

<h3 id="patch-ativa-cartao-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[PatchAtivaCartaoRequest](#schemapatchativacartaorequest)|true|none|

<h3 id="patch-ativa-cartao-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Cartao By Numero

<a id="opIdGetCartaoByNumero"></a>

> Code samples

```http
GET http://localhost:8081/cartao/112358132134 HTTP/1.1
Host: localhost:8081

```

`GET /cartao/112358132134`

<h3 id="get-cartao-by-numero-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Cartao By Numero Not Exists

<a id="opIdGetCartaoByNumeroNotExists"></a>

> Code samples

```http
GET http://localhost:8081/cartao/123456789101212 HTTP/1.1
Host: localhost:8081

```

`GET /cartao/123456789101212`

<h3 id="get-cartao-by-numero-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Fatura Wrong Validation

<a id="opIdGetFaturaWrongValidation"></a>

> Code samples

```http
GET http://localhost:8081/X/3 HTTP/1.1
Host: localhost:8081

```

`GET /X/3`

<h3 id="get-fatura-wrong-validation-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Fatura Cliente Not Exists

<a id="opIdGetFaturaClienteNotExists"></a>

> Code samples

```http
GET http://localhost:8081/123456/3 HTTP/1.1
Host: localhost:8081

```

`GET /123456/3`

<h3 id="get-fatura-cliente-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Fatura Cartao Not Exists

<a id="opIdGetFaturaCartaoNotExists"></a>

> Code samples

```http
GET http://localhost:8081/3/123456 HTTP/1.1
Host: localhost:8081

```

`GET /3/123456`

<h3 id="get-fatura-cartao-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Fatura

<a id="opIdGetFatura"></a>

> Code samples

```http
GET http://localhost:8081/3/3 HTTP/1.1
Host: localhost:8081

```

`GET /3/3`

<h3 id="get-fatura-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Pagar Fatura Wrong Validation

<a id="opIdPagarFaturaWrongValidation"></a>

> Code samples

```http
POST http://localhost:8081/X/3/pagar HTTP/1.1
Host: localhost:8081

```

`POST /X/3/pagar`

<h3 id="pagar-fatura-wrong-validation-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Pagar Fatura Cliente Not Exists

<a id="opIdPagarFaturaClienteNotExists"></a>

> Code samples

```http
POST http://localhost:8081/123456/3/pagar HTTP/1.1
Host: localhost:8081

```

`POST /123456/3/pagar`

<h3 id="pagar-fatura-cliente-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Pagar Fatura Cartao Not Exists

<a id="opIdPagarFaturaCartaoNotExists"></a>

> Code samples

```http
POST http://localhost:8081/3/123456/pagar HTTP/1.1
Host: localhost:8081

```

`POST /3/123456/pagar`

<h3 id="pagar-fatura-cartao-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Pagar Fatura

<a id="opIdPagarFatura"></a>

> Code samples

```http
POST http://localhost:8081/3/3/pagar HTTP/1.1
Host: localhost:8081

```

`POST /3/3/pagar`

<h3 id="pagar-fatura-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Expirar Cartao Wrong Validation

<a id="opIdExpirarCartaoWrongValidation"></a>

> Code samples

```http
POST http://localhost:8081/X/3/expirar HTTP/1.1
Host: localhost:8081

```

`POST /X/3/expirar`

<h3 id="expirar-cartao-wrong-validation-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Expirar Cartao Cliente Not Exists

<a id="opIdExpirarCartaoClienteNotExists"></a>

> Code samples

```http
POST http://localhost:8081/123456/3/expirar HTTP/1.1
Host: localhost:8081

```

`POST /123456/3/expirar`

<h3 id="expirar-cartao-cliente-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Expirar Cartao Cartao Not Exists

<a id="opIdExpirarCartaoCartaoNotExists"></a>

> Code samples

```http
POST http://localhost:8081/3/123456/expirar HTTP/1.1
Host: localhost:8081

```

`POST /3/123456/expirar`

<h3 id="expirar-cartao-cartao-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Expirar Cartao

<a id="opIdExpirarCartao"></a>

> Code samples

```http
POST http://localhost:8081/3/3/expirar HTTP/1.1
Host: localhost:8081

```

`POST /3/3/expirar`

<h3 id="expirar-cartao-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

# Schemas

<h2 id="tocS_PostClienteErrorValidationRequest">PostClienteErrorValidationRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostclienteerrorvalidationrequest"></a>
<a id="schema_PostClienteErrorValidationRequest"></a>
<a id="tocSpostclienteerrorvalidationrequest"></a>
<a id="tocspostclienteerrorvalidationrequest"></a>

```json
{
  "nome": ""
}

```

PostClienteErrorValidationRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|nome|string|true|none|none|

<h2 id="tocS_PostClienteRequest">PostClienteRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostclienterequest"></a>
<a id="schema_PostClienteRequest"></a>
<a id="tocSpostclienterequest"></a>
<a id="tocspostclienterequest"></a>

```json
{
  "nome": "Leonardo Fibonacci"
}

```

PostClienteRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|nome|string|true|none|none|

<h2 id="tocS_PostCartaoRequest">PostCartaoRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostcartaorequest"></a>
<a id="schema_PostCartaoRequest"></a>
<a id="tocSpostcartaorequest"></a>
<a id="tocspostcartaorequest"></a>

```json
{
  "numero": "112358132134",
  "clienteId": 3
}

```

PostCartaoRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|numero|string|true|none|none|
|clienteId|integer(int32)|true|none|none|

<h2 id="tocS_PostCartaoErrorDuplicadoRequest">PostCartaoErrorDuplicadoRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostcartaoerrorduplicadorequest"></a>
<a id="schema_PostCartaoErrorDuplicadoRequest"></a>
<a id="tocSpostcartaoerrorduplicadorequest"></a>
<a id="tocspostcartaoerrorduplicadorequest"></a>

```json
{
  "numero": "112358132134",
  "clienteId": 3
}

```

PostCartaoErrorDuplicadoRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|numero|string|true|none|none|
|clienteId|integer(int32)|true|none|none|

<h2 id="tocS_PostPagamentoFalhaDesativadoRequest">PostPagamentoFalhaDesativadoRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostpagamentofalhadesativadorequest"></a>
<a id="schema_PostPagamentoFalhaDesativadoRequest"></a>
<a id="tocSpostpagamentofalhadesativadorequest"></a>
<a id="tocspostpagamentofalhadesativadorequest"></a>

```json
{
  "cartao_id": 3,
  "descricao": "Compra de Cerveja",
  "valor": 10.5
}

```

PostPagamentoFalhaDesativadoRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|cartao_id|integer(int32)|true|none|none|
|descricao|string|true|none|none|
|valor|number|true|none|none|

<h2 id="tocS_PatchAtivaCartaoRequest">PatchAtivaCartaoRequest</h2>
<!-- backwards compatibility -->
<a id="schemapatchativacartaorequest"></a>
<a id="schema_PatchAtivaCartaoRequest"></a>
<a id="tocSpatchativacartaorequest"></a>
<a id="tocspatchativacartaorequest"></a>

```json
{
  "ativo": true
}

```

PatchAtivaCartaoRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|ativo|boolean|true|none|none|

<h2 id="tocS_PostPagamentoWrongValidationsRequest">PostPagamentoWrongValidationsRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostpagamentowrongvalidationsrequest"></a>
<a id="schema_PostPagamentoWrongValidationsRequest"></a>
<a id="tocSpostpagamentowrongvalidationsrequest"></a>
<a id="tocspostpagamentowrongvalidationsrequest"></a>

```json
{
  "cartao_id": 3,
  "descricao": "",
  "valor": 0
}

```

PostPagamentoWrongValidationsRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|cartao_id|integer(int32)|true|none|none|
|descricao|string|true|none|none|
|valor|integer(int32)|true|none|none|

<h2 id="tocS_PostPagamentoCardNotExistsRequest">PostPagamentoCardNotExistsRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostpagamentocardnotexistsrequest"></a>
<a id="schema_PostPagamentoCardNotExistsRequest"></a>
<a id="tocSpostpagamentocardnotexistsrequest"></a>
<a id="tocspostpagamentocardnotexistsrequest"></a>

```json
{
  "cartao_id": 123456,
  "descricao": "Compra de Cerveja",
  "valor": 10.5
}

```

PostPagamentoCardNotExistsRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|cartao_id|integer(int32)|true|none|none|
|descricao|string|true|none|none|
|valor|number|true|none|none|

<h2 id="tocS_PostPagamentoRequest">PostPagamentoRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostpagamentorequest"></a>
<a id="schema_PostPagamentoRequest"></a>
<a id="tocSpostpagamentorequest"></a>
<a id="tocspostpagamentorequest"></a>

```json
{
  "cartao_id": 3,
  "descricao": "Compra de Cerveja",
  "valor": 10.5
}

```

PostPagamentoRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|cartao_id|integer(int32)|true|none|none|
|descricao|string|true|none|none|
|valor|number|true|none|none|

<h2 id="tocS_PostPagamentoFalhaExpiradoRequest">PostPagamentoFalhaExpiradoRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostpagamentofalhaexpiradorequest"></a>
<a id="schema_PostPagamentoFalhaExpiradoRequest"></a>
<a id="tocSpostpagamentofalhaexpiradorequest"></a>
<a id="tocspostpagamentofalhaexpiradorequest"></a>

```json
{
  "cartao_id": 3,
  "descricao": "Compra de Cerveja",
  "valor": 10.5
}

```

PostPagamentoFalhaExpiradoRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|cartao_id|integer(int32)|true|none|none|
|descricao|string|true|none|none|
|valor|number|true|none|none|

