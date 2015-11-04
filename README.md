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

- Subsystem
- ✓ Actors 
- ✓ Inheritance (actor -> actor)
- ✓ Use Case
- ✓ Associations ( actor -> use case)
- ✓ Multiplicity
- ✓ Links between cases (extend,include)
- ✓ Rules (Links between cases)
- ✓ Extension points


## LANGAGE

```

Case: {{name}} 
    [ ExtensionPoints: {{extensionPoints}} ]
    [ Includes:  {{includeCase}}  [{ {{rules}} }] ] 
    [ Extends:  {{extendsCase}}  [{ {{rule}} }] ]
    
Actor: {{name}}
    [ Extends: {{actorName}} ]
    [ Uses: {{caseName}} [{multiplicity}] ]
    
```
    
    
    
## EXAMPLE

```
Case: Authenticate
Case: Consult 
    Includes: Authenticate {customer selected HELP}
Case: Withdraw 
    Extends: Consult
Case: Transfer
    Extends: Consult
Case: Deposit
Case: Register ATM
Case: Read Log

Actor: Person
    Uses: Withdraw {*,0..1} 
Actor: Customer extends Person
    Uses: Transfer
Actor: Administrator
Actor: Bank

```
