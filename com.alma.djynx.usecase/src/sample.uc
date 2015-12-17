Subsystem: ATM_System

    Case: Authenticate
    Case: Consult 
        Includes: Authenticate {customer selected HELP}
    Case: Withdraw
        Extends: Consul {}
    Case: Transfer
        Extends: Consult {}
    Case: Deposit
    Case: RegisterATM
    Case: Read_Log

Actor: Person
Actor: Customer Extends: Person
    Uses: Transfer
Actor: Administrator
Actor: Bank