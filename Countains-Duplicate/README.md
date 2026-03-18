# 🧩 Contains Duplicate

### 📝 Descrição

Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

### 💡 Metodologia (Approach)

Para resolver este problema de forma eficiente, utilizei uma estrutura de dados de **HashSet** em Java.

1. **Estratégia:** Percorrer o array uma única vez. Para cada elemento, verificar se ele já existe no `Set`.
   - Se existir: O número é duplicado, retornamos `true`.
   - Se não existir: Adicionamos o número ao `Set` e continuamos.
2. **Por que HashSet?** A busca (`contains`) e a inserção (`add`) em um HashSet têm tempo médio de $O(1)$, o que torna a solução muito mais rápida do que comparar todos os elementos entre si ($O(n^2)$).

#### Análise de Complexidade:
- **Tempo:** $O(n)$ — Onde $n$ é o número de elementos no array, pois o percorremos apenas uma vez.
- **Espaço:** $O(n)$ — No pior caso (todos os números distintos), armazenaremos todos os $n$ elementos no `Set`.

---