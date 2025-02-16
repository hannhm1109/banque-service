# Service Bancaire Web (Banque Web Service)

Un service web SOAP pour les opérations bancaires utilisant JAX-WS (Jakarta XML Web Services).

## Fonctionnalités

- Conversion de devise (EUR vers DH)
- Consultation des informations de compte
- Liste des comptes disponibles

## Technologies Utilisées

- Java 17
- JAX-WS (Jakarta XML Web Services)
- Maven
- SoapUI (pour les tests)

## Opérations du Service Web

# 1. Conversion (EUR vers DH)
Endpoint : /conversion
Méthode : conversion(double montant)
Description : Convertit un montant d'euros en dirhams
Exemple de requête SOAP :

![carbon (1)](https://github.com/user-attachments/assets/f5f67f76-ceb6-4487-9c74-b46d3f5365c8)

![conversion](https://github.com/user-attachments/assets/d8feafa0-08ab-4244-84e2-a912fa984c5c)

# 2. Consultation de Compte

Endpoint : /getCompte
Méthode : getCompte(int code)
Description : Récupère les informations d'un compte spécifique
Exemple de requête SOAP : 

![carbon (2)](https://github.com/user-attachments/assets/7841dcb4-1acc-4fe1-9c0c-1e0fcb131ef6)

![getCompte](https://github.com/user-attachments/assets/81b4a51b-c538-4658-9181-86a6cdcd828f)

# 3. Liste des Comptes

Endpoint : /getComptes
Méthode : getComptes()
Description : Récupère la liste de tous les comptes disponibles
Exemple de requête SOAP :

![carbon (3)](https://github.com/user-attachments/assets/b48fb375-352e-4e1b-ad61-e3904010ff89)

![getComptes](https://github.com/user-attachments/assets/32a96f25-a41b-4eca-999e-014018f961cb)

#Tests
Les tests ont été effectués avec SoapUI :

.Tests de conversion avec différents montants
.Tests de récupération de comptes existants
.Tests de récupération de la liste complète des comptes
.Vérification des temps de réponse et de la stabilité du service

## Structure des Fichiers IntelliJ

### Fichiers Principaux
1. **BanqueService.java**

![carbon (4)](https://github.com/user-attachments/assets/22d1a5e7-789b-45ac-b7cf-0d0953003877)

2. **Compte.java**
   
![carbon (5)](https://github.com/user-attachments/assets/12a90825-11e4-45d8-917b-153ef3ee418e)

3. **ServerJWS.java**

![carbon (6)](https://github.com/user-attachments/assets/70261dd6-a6c0-4819-ab26-d37338d4a44a)

4. **Configuration Maven (pom.xml)**

![carbon (7)](https://github.com/user-attachments/assets/f7b9ceb3-e279-407b-b7e2-8df3b4b1e262)

## Structure du Projet IntelliJ

![carbon (8)](https://github.com/user-attachments/assets/c75d349a-57e5-4e57-99bf-4e8cce70119b)

Auteur : Hanane Nahim
