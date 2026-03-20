# 🔍 Two Sum — Duas Abordagens

Este repositório contém duas soluções para o problema clássico **Two Sum**, considerando cenários diferentes:

- Array **não ordenado**
- Array **ordenado**

---

## 📌 Problema 1 — Two Sum (Array Não Ordenado)

### 🧩 Descrição
Dado um array de inteiros **não ordenado** e um valor `target`, o objetivo é encontrar dois números cuja soma seja igual ao target e retornar seus índices.

---

### 💡 Abordagem Utilizada — HashMap

Para resolver esse problema de forma eficiente, utilizei um **HashMap**.

#### 🔎 Ideia principal:
- Percorro o array uma única vez
- Para cada elemento, calculo o complemento:  
  `complemento = target - valor atual`
- Verifico se esse complemento já foi visto anteriormente (está no mapa)
  - Se sim → encontrei a solução
  - Se não → armazeno o valor atual no mapa

---

### ⚙️ Complexidade
- **Tempo:** O(n)
- **Espaço:** O(n)

---

## 📌 Problema 2 — Two Sum (Array Ordenado)

### 🧩 Descrição
Dado um array de inteiros **ordenado** e um valor `target`, o objetivo é encontrar dois números cuja soma seja igual ao target.

---

### 💡 Abordagem Utilizada — Two Pointers

Como o array já está ordenado, utilizei a técnica de **dois ponteiros**.

#### 🔎 Ideia principal:
- Um ponteiro começa no início (`left`)
- Outro ponteiro começa no final (`right`)
- A cada passo:
  - Se a soma for igual ao target → solução encontrada
  - Se for menor → movo o ponteiro da esquerda
  - Se for maior → movo o ponteiro da direita

---

### ⚙️ Complexidade
- **Tempo:** O(n)
- **Espaço:** O(1)

---

## ⚖️ Comparação das Soluções

| Abordagem     | Tipo de Entrada | Tempo | Espaço | Estratégia        |
|--------------|----------------|------|--------|------------------|
| HashMap      | Não ordenado   | O(n) | O(n)   | Busca por complemento |
| Two Pointers | Ordenado       | O(n) | O(1)   | Ajuste de ponteiros   |

---

## 🧠 Conclusão

Cada solução foi escolhida com base na estrutura do problema:

- Quando o array **não é ordenado**, o uso de HashMap garante eficiência.
- Quando o array **já está ordenado**, o uso de dois ponteiros elimina a necessidade de memória extra.

---

## ✍️ Autor

Rafael Soares