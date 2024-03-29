import jpype
from jpype import JClass
print(jpype.getDefaultJVMPath())
if not jpype.isJVMStarted():
    jpype.startJVM(jpype.getDefaultJVMPath())


Calculator = JClass("lab3.Calculator")
calculator = Calculator()

x = 10.04
y = 5.33
resultAdd = calculator.addDoubles(x, y)
resultSubtract = calculator.subtractFloats(10.8345, 5.9172345)
resultMultiply = calculator.multiplyInt(10, 5)
resultString = calculator.parseString("String here", 7)

print("Додавання: ", resultAdd)
print("Віднімання: ", resultSubtract)
print("Множення: ", resultMultiply)
print("Substring: ", resultString)


jpype.shutdownJVM()