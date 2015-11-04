# DJYN
## METADATA
### Goals

1. Write a language
2. Write a parser for this language
3. Write diagrams based on the language

### Dates

Deadline: December 20th 2015

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
Subsystem: {{name}}
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
Subsystem: ATM System

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
