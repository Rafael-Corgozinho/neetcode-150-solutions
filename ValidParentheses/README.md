 🧩 ValidParentheses
### 📝 Descrição
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

 

Example 1:

Input: s = "()"

Output: true


Example 2:

Input: s = "()[]{}"

Output: true


Example 3:

Input: s = "(]"

Output: false



### 💡 Metodologia (Approach)

*Estratégia Utilizada:*
Stack. fazendo um looping interativo pela string acrescentei C na stack caso ele fosse uma abertura, e caso ele estivesse fechando, comparei com o topo da string 

#### 📊 Análise de Complexidade
- *Tempo:* $O(n)$ 
- *Espaço:* $O(n )$ 

---

---
Resolvido por Rafael Soares durante o roadmap NeetCode 150.
