# 🔤 Valid Anagram - Solution (Java)

## 📌 Sobre o problema
Este exercício consiste em verificar se duas strings são **anagramas** — ou seja, se possuem exatamente os mesmos caracteres com a mesma frequência, apenas em ordens diferentes.

---

## 💡 Minha abordagem inicial

Minha primeira solução utilizou **dois HashMaps** para armazenar a frequência dos caracteres de cada string:

- Um mapa para a string `s`
- Outro mapa para a string `t`

Depois disso, comparei os conjuntos de chaves (`keySet`) para verificar se os caracteres eram os mesmos.

```java
Map<Character,Integer> frequency = new HashMap<>();
Map<Character,Integer> frequency2 = new HashMap<>();

---

## ⚡ Complexidade

### Solução inicial (2 HashMaps)

- Tempo: `O(n)`
- Espaço: `O(n)`

### Solução otimizada (1 HashMap)

- Tempo: `O(n)`
- Espaço: `O(1)` *(considerando apenas letras do alfabeto)*

---

## ✅ Solução otimizada (1 HashMap)

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> frequency = new HashMap<>();

        for (char c : s.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) - 1);

            if (frequency.get(c) < 0) return false;
        }

        return true;
    }
}