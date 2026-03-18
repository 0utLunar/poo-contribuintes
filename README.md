# poo-contribuintes

Programa Java para cálculo de imposto de renda de contribuintes, utilizando Orientação a Objetos e Listas.

---

## 📋 Sobre

Dado N contribuintes, o programa lê suas rendas e gastos, calcula o imposto bruto, o abatimento e o imposto líquido devido, exibindo um resumo para cada um.

---

## 💰 Regras de Imposto

**Imposto sobre salário** (baseado no salário mensal):
| Salário mensal | Alíquota |
|---|---|
| Abaixo de R$ 3.000 | Isento |
| R$ 3.000 até R$ 5.000 | 10% |
| R$ 5.000 ou acima | 20% |

- **Prestação de serviços:** 15%
- **Ganho de capital:** 20%
- **Abatimento:** até 30% do imposto bruto com gastos médicos e educacionais

---

## 🏗️ Estrutura

```
src/
├── application/
│   └── Program.java        # Leitura de dados e exibição do resumo
└── entities/
    └── TaxPayer.java       # Entidade com regras de cálculo encapsuladas
```

---

## 🛠️ Tecnologias

- Java 17+
- Orientação a Objetos
- Java Collections (`List`, `ArrayList`)

---

## 🚀 Como executar

1. Clone o repositório
   ```bash
   git clone https://github.com/seu-usuario/java-taxpayer-oo.git
   ```
2. Abra na sua IDE e execute `Program.java`