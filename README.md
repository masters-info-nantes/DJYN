# DJYN
## METADATA
### Goals

1. écrire le language
2. écrire un parser du langage
3. Générer des diagrammes à partir du langage

### Dates

Deadline: 20 décembre 2015

### Description

To do

### Vocabulaire

- Systeme (Ne pas modéliser, c'est un composant)
- ✓ Acteurs 
- ✓ Héritage (acteur -> acteur)
- ✓ Cas d'utilisation
- ✓ Associations ( acteur -> cas d'utilisation)
- ✓ Multiplicity
- ✓ Liens entre cas (extend,include)
- ✓ Rêgle (Liens entre cas)
- ✓ Extention points

## LANGAGE
Case: {{name}} 
    [ ExtensionPoints: {{extensionPoints}} ]
    [ Include:  {{includeCase}}  [{ {{rules}} }] ] 
    [ Extends:  {{extendsCase}}  [{ {{rule}} }] ]
    
Actor: {{name}}
    [ Extends: {{actorName}} ]
    [ Link: {{caseName} [{multiplicity}] ]
    
## EXAMPLE

Case: Authenticate

Case: Consult 
    Include: Authenticate {customer selected HELP}
    
Case: Withdraw 
    Extends: Consult
    
Case: Transfer
    Extends: Consult
    
Case: Deposit

Case: Register ATM

Case: Read Log

Actor: Person
    Link: Withdraw {*,0..1} 
    
Actor: Customer extends Person
    Link: Transfer
    
Actor: Administrator
Actor: Bank

