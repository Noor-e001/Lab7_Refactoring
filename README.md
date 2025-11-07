# SYSC 3110 Lab 7: Refactoring (Form Template Method)

### Overview
This lab recreates and refactors Martin Fowler’s **Site** example to implement the **Template Method Pattern**.

### Steps Completed
1. Built initial classes with duplicated "getBillableAmount()" logic.
2. Extracted common base computation "getBaseAmount()".
3. Converted "Site" to abstract class defining the template method.
4. Subclasses now implement "getTypeSpecificCharge(base)" as hooks.
5. Verified identical runtime results.

### IntelliJ Refactorings Used
- Extract Method
- Make Abstract Class
- Pull Up (if applicable)
- Safe Delete / Reformat Code

### Output
Residential bill: 19.0           
Industrial bill: 30.0

### References
- JetBrains IDEA Refactoring Guide: <https://www.jetbrains.com/help/idea/refactoring-source-code.html>
- Fowler, M. *Form Template Method* Example: <https://www.refactoring.com/catalog/formTemplateMethod.html>
